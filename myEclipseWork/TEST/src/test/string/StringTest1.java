package test.string;

import java.io.UnsupportedEncodingException;

public class StringTest1 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		
		
		/*String a="ab����1��as";
		
		
		System.out.println(fySub(8,a).trim());*/
		
		
		String str = "��ѯ���ݣ�����1277891918990009,��Ʊ����20141120,��Ʊ������20141120.��Ʊ�ˣ�ɽ���¹���֯��װ���޹�˾.���123.00,�Ƿ�����ǩ��,���޹�ֹ������,���֪�������к�,�Ƿ����,�뾡��ظ�,лл!��ѯ���ݣ�����1277891918990009,��Ʊ����20141120,��Ʊ������20141120.��Ʊ�ˣ�ɽ���¹���֯��װ���޹�˾.���123.00,�Ƿ�����ǩ��,���޹�ֹ������,���֪�������к�,�Ƿ����,�뾡��ظ�,лл!";
		String str1="";
		String str2="";
		String str3="";
		String str4="";
		System.out.println(str.length());
		
		if(str.length()>60&&str.length()<=120){
			str1=str.substring(0, 60);
			str2=str.substring(60);
		}else if(str.length()>120&&str.length()<=180){
			str1=str.substring(0, 60);
			str2=str.substring(60,120);
			str3=str.substring(120);
		}else if(str.length()>180){
			str1=str.substring(0, 60);
			str2=str.substring(60,120);
			str3=str.substring(120,180);
			str4=str.substring(180);
		}else{
			str1=str;
		}
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
	
	/**
	 * 
	 * @param lenth ָ����ȡ�ַ���ʣ���ֽڳ���
	 * @param str Ҫ��ȡ���ַ���
	 * @return ����ָ�����ȵ��ַ���
	 * @throws UnsupportedEncodingException 
	 */
	private static String fySub(int lenth,String str) throws UnsupportedEncodingException{
		byte[] b;
			b = str.getBytes("UTF-8");
			byte[] b1=new byte[lenth];
			if(b.length>lenth){
				for (int i=0;i<lenth;i++) {
					System.out.println(b[i]);
					b1[i]=b[i];
				}
				str=new String(b1,"UTF-8");
			}
			else{
				str=new String(b,"UTF-8");
			}
		return str;
	}

}
