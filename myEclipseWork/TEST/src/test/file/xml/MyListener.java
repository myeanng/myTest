package test.file.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyListener extends DefaultHandler {

	/**
	 * ���Ԫ�ص�������
	 */
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.print(new String(ch,start,length));
		//super.characters(ch, start, length);
	}

	/**
	 * ����ĵ��Ľ����¼�
	 */
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("SAX����������������������");
		//super.endDocument();
	}

	/**
	 * ���Ԫ�صĽ����¼�
	 */
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		System.out.print("</"+qName+">");
		//super.endElement(uri, localName, qName);
	}

	
	/**
	 * �����ĵ���ʼ�Ľ���
	 */
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("SAX������ʼ��������������");
		//super.startDocument();
	}

	/**
	 * Ԫ�ؿ�ʼ�Ľ������м�������
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
