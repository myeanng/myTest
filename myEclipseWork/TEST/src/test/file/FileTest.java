package test.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileTest {

	/**
	 * IO��
	 * I/O����
	 * ��ȡ��д���ļ�
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		String fileName="F:\\test\\file.txt";
		System.out.println(fileName);
		FileOutputStream fos=new FileOutputStream(fileName);
		String file="Aaaaaaasds��������SDS��,,,,,,,,,,!!!!!!!!!!!!!!@@@@@@@@''''+sd�����������߷������Ǵ��㷢ɫ�ʷ������ߴ�Ů��";
		fos.write(file.getBytes("UTF-8"));
		fos.close();
		System.out.println("�������������");
		
		
		String outFileName="F:\\test\\adobe-flex����ָ��.pdf";
		String inFileName="F:\\�Ķ�\\Flex������\\adobe-flex����ָ��.pdf";//F:\�Ķ�\Flex������\adobe-flex����ָ��.pdf
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
		System.out.println("���2����������");
	}

}
