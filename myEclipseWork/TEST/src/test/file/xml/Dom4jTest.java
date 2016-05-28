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
        System.out.println("DOM������ʼ---------------");
        //���幤�� API��ʹӦ�ó����ܹ��� XML �ĵ���ȡ���� DOM �������Ľ�������newInstance(); ��ȡ DocumentBuilderFactory ����ʵ����
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance(); 
        //���� API�� ʹ��� XML �ĵ���ȡ DOM �ĵ�ʵ����ʹ�ô��࣬Ӧ�ó���Ա���Դ� XML ��ȡһ�� Document��
        //�����ʵ�����Դ� DocumentBuilderFactory.newDocumentBuilder() ������ȡ��
        //��ȡ�����ʵ��֮�󣬽����ԴӸ�������Դ���� XML����Щ����Դ�� InputStreams��Files��URL �� SAX InputSources��
        //ע�⣬���������� SAX API �е�һЩ�ࡣ�Ⲣ��Ҫ��ײ� DOM ʵ�ֵ�ʵ����ʹ�� SAX �������� XML �ĵ�����Ϊ Document��
        //����Ҫ���ʵ��ʹ����Щ���е� API ��Ӧ�ó������� 
        DocumentBuilder builder=factory.newDocumentBuilder();
        //�������ļ������ݽ���Ϊһ�� XML �ĵ������ҷ���һ���µ� DOM Document ����
        Document doc = builder.parse(f); 
        //NodeList �ӿ��ṩ�Խڵ�����򼯺ϵĳ���û�ж����Լ�����ʵ�ִ˼��ϡ�DOM �е� NodeList �����ǻ�ġ� 
        //NodeList �е������ͨ���� 0 ��ʼ�������������з��ʡ�
        NodeList nl = doc.getElementsByTagName("VALUE"); 
        for (int i=0;i<nl.getLength();i++){ 
            System.out.println("���ƺ���:" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue()); 
            System.out.println("������ַ:" 
                    + doc.getElementsByTagName("ADDR").item(i)
                    .getFirstChild().getNodeValue());
            } 
         }catch(Exception e){ 
            e.printStackTrace(); 
        }
        System.err.println("����ʱ��:"+(System.currentTimeMillis() - lasting)+"����"); 
        
        
        //��һ�ֽ�����ʽ
        /*InputStream in = MyXMLReaderDOM4J.class.getClassLoader().getResourceAsStream("resource.xml");
        SAXReader reader = new SAXReader();
        Document doc = reader.read(in);
        Element root = doc.getRootElement();
		for (Object o : (List<?>) root.elements("����")) {
		  Element e = (Element) o;
		   System.out.print("����С˵:" + e.elementText("����С˵"));
		   System.out.println(" ����:" + e.elementText("v"));
		}*/
        System.out.println("SAX������ʼ---------------");
        lasting =System.currentTimeMillis();
        
        //SAX����
        //1.sax����
        SAXParserFactory saxf=SAXParserFactory.newInstance();
    
        //2.����������
        SAXParser sax=saxf.newSAXParser();
        //3.�õ������ļ�f,�������������н���
        MyListener mylistener =new MyListener();
        sax.parse(f, mylistener);
       
        System.err.println("����ʱ��:"+(System.currentTimeMillis() - lasting)+"����");
        System.out.println( sax.toString());
        //System.out.println(sax.getProperty("VALUE"));
        //XMLReader xml=sax.getXMLReader();
        
        
        //Dom4j����
        
        System.out.println("DOM4J������ʼ----------------------------");
        
        StringBuffer sb=new StringBuffer();
        lasting =System.currentTimeMillis();
        
        //����Dom4j������
        SAXReader saxr=new SAXReader();
        org.dom4j.Document dom=saxr.read(f);
        
        //��ȡ��Ԫ��
        Element root=dom.getRootElement();
        System.out.println(root.getName());
        //List<Attribute> attr=root.attributes();
        //��ȡһ��
        List firstlist=root.elements();
        Iterator it=firstlist.iterator();
        while(it.hasNext()){
        	Element firste=(Element) it.next();
        	sb.append("<"+firste.getName());
        	System.out.print("<"+firste.getName());
        	
        	//��ȡ����
        	List<Attribute> attrs=firste.attributes();
        	for (Attribute attr : attrs) {
				//��ӡ����
        		sb.append(" "+attr.getName()+"="+attr.getValue());
        		System.err.print(" "+attr.getName()+"="+attr.getValue());
			}
        	sb.append(">\n");
        	System.out.print(">\n");
        	//��Ԫ��
        	List<Element> twoe=firste.elements();
        	if(null!=twoe){
        		Iterator tit=twoe.iterator();
        		while(tit.hasNext()){
        			
        			Element te=(Element) tit.next();
        			List<Attribute> tattrs=firste.attributes();
        			sb.append("<"+te.getName());
        			System.out.print("<"+te.getName());
        			for (Attribute tattr : tattrs) {
        				//��ӡ����
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
        	//��ӡ�ӽڵ�����
        	System.out.print(firste.getText()+"\n");
        	//�����Ԫ��
        	
        	Element book=firste.addElement("BOOK");
        	book.setText("<<��Хɽׯ>>");
        	
        	
        	sb.append("</"+firste.getName()+">\n");
        	
        	//��ӡ�ӽڵ��ǩ
        	System.out.print("</"+firste.getName()+">\n");
        	
        }
        //д��
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
        
        System.err.println("����ʱ��:"+(System.currentTimeMillis() - lasting)+"����");
	}

}
