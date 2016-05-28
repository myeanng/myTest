package test.file.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyListener extends DefaultHandler {

	/**
	 * 获得元素的内容体
	 */
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.print(new String(ch,start,length));
		//super.characters(ch, start, length);
	}

	/**
	 * 获得文档的结束事件
	 */
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("SAX解析结束。。。。。。。");
		//super.endDocument();
	}

	/**
	 * 获得元素的结束事件
	 */
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.print("</"+qName+">");
		//super.endElement(uri, localName, qName);
	}

	
	/**
	 * 对于文档开始的解析
	 */
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("SAX解析开始。。。。。。。");
		//super.startDocument();
	}

	/**
	 * 元素开始的解析其中几个名词
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		//super.startElement(uri, localName, qName, attributes);
		StringBuffer sb=new StringBuffer();
		sb.append("<"+qName);
		for(int i=0;i<attributes.getLength();i++){
			String attName=attributes.getQName(i);
			String attValue=attributes.getValue(i);
			sb.append(attName+"="+attValue);
		}
		sb.append(">");
		System.out.print(sb.toString());
		
	}
	
}
