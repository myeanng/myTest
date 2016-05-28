package test.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.Properties;

public class PropertiesTest {

	/**
	 * 从properties文件里取值
	 * 及写入属性
	 * 
	 * @param args
	 * @throws IOException 
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws IOException, URISyntaxException{
		// TODO Auto-generated method stub
		Pro p1  = new Pro();
		try {
			System.out.println(p1.porper());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InputStream in= Object.class.getResourceAsStream("/test/test.properties");
		Properties pro=new Properties();
		try {
			pro.load(in);
			System.out.println("path:"+pro.getProperty("path"));
			System.out.println("name:"+pro.getProperty("name"));
			System.out.println("age:"+pro.getProperty("age"));
			System.out.println("sex:"+pro.getProperty("sex"));
			System.err.println("update6:"+pro.getProperty("update6")!=null?"输出："+pro.getProperty("update6"):"null");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}/*finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		String url=Object.class.getResource("/test/test.properties").toString().substring(6).trim();
		System.err.println(url);
		OutputStream outs=new FileOutputStream(url);
		pro.setProperty("update6", url);
		pro.store(outs, "Update6 " + "url" + " name");
		/*byte[] b=new byte[1024];
		int len=0;
		while((len=in.read(b))>0){
			System.out.println(len);
			outs.write(b,0,len);
		}
		in.close();
		outs.close();
		*/
		System.out.println("path:"+pro.getProperty("path"));
		System.out.println("name:"+pro.getProperty("name"));
		System.out.println("age:"+pro.getProperty("age"));
		System.out.println("sex:"+pro.getProperty("sex"));
		System.out.println("update3:"+pro.getProperty("update3"));
		
		pro.load(in);
		System.err.println(pro.get("update6"));
		pro.clear();
		pro.clone();
		in.close();
		outs.close();
		
		
	}

}
