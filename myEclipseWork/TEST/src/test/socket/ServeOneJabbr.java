package test.socket;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.io.PrintWriter;  
import java.net.Socket;  
  
/** 
 ***************************************************************  
 * ��Ŀ���ƣ�JavaThread 
 * �������ƣ�ServeOneJabbr 
 * ���ڣ�2012-8-23 ����02:34:13 
 * ���ߣ� 
 * ģ�飺 
 * ������ 
 * ��ע�� 
 * ------------------------------------------------------------ 
 * �޸���ʷ 
 * ���               ����              �޸���       �޸�ԭ�� 
 *  
 * �޸ı�ע�� 
 * @version  
 *************************************************************** 
 */  
public class ServeOneJabbr extends Thread{  
  
    private Socket socket = null;  
    private BufferedReader br = null;  
    private PrintWriter pw = null;  
      
    public ServeOneJabbr(Socket s){  
        socket = s;  
        try {  
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);  
            start();  
        } catch (Exception e) {  
              
            e.printStackTrace();  
        }  
    }  
      
    @Override  
    public void run() {  
        while(true){  
            String str;  
            try {  
                str = br.readLine();  
                if(str.equals("END")){  
                    br.close();  
                    pw.close();  
                    socket.close();  
                    break;  
                }  
                System.out.println("Client Socket Message:"+str);  
                pw.println("Message Received");  
                pw.flush();  
            } catch (Exception e) {  
                try {  
                    br.close();  
                    pw.close();  
                    socket.close();  
                } catch (IOException e1) {  
                    // TODO Auto-generated catch block  
                    e1.printStackTrace();  
                }  
            }  
        }  
    }  
      
      
      
}  
