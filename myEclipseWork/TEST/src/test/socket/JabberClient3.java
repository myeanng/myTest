package test.socket;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.io.PrintWriter;  
import java.net.Socket;  
import java.util.Scanner;
  
/** 
 ***************************************************************  
 * ��Ŀ���ƣ�JavaThread �������ƣ�JabberClient ���ڣ�2015��7��30��16:22:41  
 * ���ߣ� 
 * ģ�飺  
 * ������  
 * ��ע�� 
 * ------------------------------------------------------------  
 * �޸���ʷ 
 * ��� 
 * ���� 
 * �޸��� 
 * �޸�ԭ�� 
 * �޸ı�ע�� 
 *  
 * @version 
 ***************************************************************  
 */  
public class JabberClient3 {  
    
    public static void main(String[] args) {  
        Socket socket = null;  
        BufferedReader br = null;  
        PrintWriter pw = null;
        Scanner sa=new Scanner(System.in);
        
        try {  
            //�ͻ���socketָ���������ĵ�ַ�Ͷ˿ں�  localhost 127.0.0.1 10.48.8.139 
            socket = new Socket("127.0.0.1", 8080); // JabberServer.PORT
            System.out.println("Socket=" + socket);  
            //ͬ������ԭ��һ��  
            br = new BufferedReader(new InputStreamReader(  
                    socket.getInputStream()));  
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(  
                    socket.getOutputStream())));  
            
            /*for (int i = 0; i < 10; i++) {  
                pw.println("howdy " + i);  
                pw.flush();  
                String str = br.readLine();  
                System.out.println(str);  
            } */ 
            while(true){
            	System.out.print("������");
            	String str=sa.next();
            	pw.println(str);
            	pw.flush();
            	System.out.println("�����ѷ���...");
            	System.out.println("�ȴ���Ӧ...");
            	str=br.readLine();
            	System.out.println("Server��Ӧ���ݣ�"+str);
            }
            
            //pw.println("END");  
            //pw.flush();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                System.out.println("close......");  
                br.close();  
                pw.close();  
                socket.close();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
    }  
  
}  
