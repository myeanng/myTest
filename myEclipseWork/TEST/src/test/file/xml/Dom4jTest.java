package test.file.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.dom4j.Attribute;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class Dom4jTest {

	
	
	/**
	 * @param args
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws DocumentException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, DocumentException {
		// TODO Auto-generated method stub
		long lasting =System.currentTimeMillis(); 
		File f=new File("E:/xmlTest/test.xml"); 
        try{ 
        System.out.println("DOM解析开始---------------");
        //定义工厂 API，使应用程序能够从 XML 文档获取生成 DOM 对象树的解析器。newInstance(); 获取 DocumentBuilderFactory 的新实例。
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance(); 
        //定义 API， 使其从 XML 文档获取 DOM 文档实例。使用此类，应用程序员可以从 XML 获取一个 Document。
        //此类的实例可以从 DocumentBuilderFactory.newDocumentBuilder() 方法获取。
        //获取此类的实例之后，将可以从各种输入源解析 XML。这些输入源有 InputStreams、Files、URL 和 SAX InputSources。
        //注意，此类重用了 SAX API 中的一些类。这并不要求底层 DOM 实现的实现者使用 SAX 解析器将 XML 文档解析为 Document。
        //它仅要求该实现使用这些现有的 API 与应用程序交流。 
        DocumentBuilder builder=factory.newDocumentBuilder();
        //将给定文件的内容解析为一个 XML 文档，并且返回一个新的 DOM Document 对象。
        Document doc = builder.parse(f); 
        //NodeList 接口提供对节点的有序集合的抽象，没有定义或约束如何实现此集合。DOM 中的 NodeList 对象是活动的。 
        //NodeList 中的项可以通过从 0 开始的整数索引进行访问。
        NodeList nl = doc.getElementsByTagName("VALUE"); 
        for (int i=0;i<nl.getLength();i++){ 
            System.out.println("车牌号码:" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue()); 
            System.out.println("车主地址:" 
                    + doc.getElementsByTagName("ADDR").item(i)
                    .getFirstChild().getNodeValue());
            } 
         }catch(Exception e){ 
            e.printStackTrace(); 
        }
        System.err.println("运行时间:"+(System.currentTimeMillis() - lasting)+"毫秒"); 
        
        
        //另一种解析方式
        /*InputStream in = MyXMLReaderDOM4J.class.getClassLoader().getResourceAsStream("resource.xml");
        SAXReader reader = new SAXReader();
        Document doc = reader.read(in);
        Element root = doc.getRootElement();
		for (Object o : (List<?>) root.elements("类型")) {
		  Element e = (Element) o;
		   System.out.print("言情小说:" + e.elementText("言情小说"));
		   System.out.println(" 书名:" + e.elementText("v"));
		}*/
        System.out.println("SAX解析开始---------------");
        lasting =System.currentTimeMillis();
        
        //SAX解析
        //1.sax工厂
        SAXParserFactory saxf=SAXParserFactory.newInstance();
    
        //2.创建解析器
        SAXParser sax=saxf.newSAXParser();
        //3.得到解析文件f,创建监听器进行解析
        MyListener mylistener =new MyListener();
        sax.parse(f, mylistener);
       
        System.err.println("运行时间:"+(System.currentTimeMillis() - lasting)+"毫秒");
        System.out.println( sax.toString());
        //System.out.println(sax.getProperty("VALUE"));
        //XMLReader xml=sax.getXMLReader();
        
        
        //Dom4j解析
        
        System.out.println("DOM4J解析开始----------------------------");
        
        StringBuffer sb=new StringBuffer();
        lasting =System.currentTimeMillis();
        
        //创建Dom4j解析器
        SAXReader saxr=new SAXReader();
        org.dom4j.Document dom=saxr.read(f);
        
        //获取根元素
        Element root=dom.getRootElement();
        System.out.println(root.getName());
        //List<Attribute> attr=root.attributes();
        //获取一级
        List firstlist=root.elements();
        Iterator it=firstlist.iterator();
        while(it.hasNext()){
        	Element firste=(Element) it.next();
        	sb.append("<"+firste.getName());
        	System.out.print("<"+firste.getName());
        	
        	//获取属性
        	List<Attribute> attrs=firste.attributes();
        	for (Attribute attr : attrs) {
				//打印属性
        		sb.append(" "+attr.getName()+"="+attr.getValue());
        		System.err.print(" "+attr.getName()+"="+attr.getValue());
			}
        	sb.append(">\n");
        	System.out.print(">\n");
        	//子元素
        	List<Element> twoe=firste.elements();
        	if(null!=twoe){
        		Iterator tit=twoe.iterator();
        		while(tit.hasNext()){
        			
        			Element te=(Element) tit.next();
        			List<Attribute> tattrs=firste.attributes();
        			sb.append("<"+te.getName());
        			System.out.print("<"+te.getName());
        			for (Attribute tattr : tattrs) {
        				//打印属性
                		sb.append(" "+tattr.getName()+"="+tattr.getValue());
                		System.err.print(" "+tattr.getName()+"="+tattr.getValue());
        			}
        			sb.append(">\n");
        			System.out.print(">\n");
        			
        			sb.append(te.getText()+"\n");
        			sb.append("</"+te.getName()+">\n");
        			System.err.print(te.getText()+"\n");
        			System.out.print("</"+te.getName()+">\n");
        		}
        	}
        	
        	sb.append(firste.getText()+"\n");
        	//打印子节点内容
        	System.out.print(firste.getText()+"\n");
        	//添加子元素
        	
        	Element book=firste.addElement("BOOK");
        	book.setText("<<呼啸山庄>>");
        	
        	
        	sb.append("</"+firste.getName()+">\n");
        	
        	//打印子节点标签
        	System.out.print("</"+firste.getName()+">\n");
        	
        }
        //写入
    	OutputStream os=new FileOutputStream(f);
    	OutputFormat of=OutputFormat.createPrettyPrint();
    	of.setEncoding("utf-8");
    	XMLWriter xw=new XMLWriter(os,of);
    	xw.write(dom);
    	xw.flush();
    	xw.close();
       
        //dom.clone();
        System.out.println("-------------------------------------------");
        
        System.out.println(sb.toString().trim());
        
        System.err.println("运行时间:"+(System.currentTimeMillis() - lasting)+"毫秒");
	}

}
