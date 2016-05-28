package test.string;

import java.io.UnsupportedEncodingException;

public class StringTest1 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		
		
		/*String a="ab阿萨1德as";
		
		
		System.out.println(fySub(8,a).trim());*/
		
		
		String str = "查询内容：银承1277891918990009,出票日期20141120,汇票到期日20141120.出票人：山东新光针织服装有限公司.金额123.00,是否你行签发,有无挂止冻他查,请告知他查行行号,是否机打,请尽快回复,谢谢!查询内容：银承1277891918990009,出票日期20141120,汇票到期日20141120.出票人：山东新光针织服装有限公司.金额123.00,是否你行签发,有无挂止冻他查,请告知他查行行号,是否机打,请尽快回复,谢谢!";
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
	 * @param lenth 指定截取字符串剩余字节长度
	 * @param str 要截取的字符串
	 * @return 范回指定长度的字符串
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
