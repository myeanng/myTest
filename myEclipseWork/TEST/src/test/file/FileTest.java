package test.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileTest {

	/**
	 * IO流
	 * I/O操作
	 * 读取与写入文件
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		String fileName="F:\\test\\file.txt";
		System.out.println(fileName);
		FileOutputStream fos=new FileOutputStream(fileName);
		String file="Aaaaaaasds啊啊啊；SDS；,,,,,,,,,,!!!!!!!!!!!!!!@@@@@@@@''''+sd的撒发生大瓦房爱的是打算发色彩发生达瓦大女；";
		fos.write(file.getBytes("UTF-8"));
		fos.close();
		System.out.println("输出结束。。。");
		
		
		String outFileName="F:\\test\\adobe-flex编码指南.pdf";
		String inFileName="F:\\阅读\\Flex电子书\\adobe-flex编码指南.pdf";//F:\阅读\Flex电子书\adobe-flex编码指南.pdf
		FileInputStream fis=new FileInputStream(inFileName);
		FileOutputStream fos2=new FileOutputStream(outFileName);
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))>0){
			System.out.println(len);
			fos2.write(b,0,len);
		}
		fos2.close();
		fis.close();
		System.out.println("输出2结束。。。");
	}

}
