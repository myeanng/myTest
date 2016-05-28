package test.socket;


import java.io.IOException;  
import java.net.ServerSocket;  
import java.net.Socket;  
  
/** 
 ***************************************************************  
 * ��Ŀ���ƣ�JavaThread 
 * �������ƣ�MultiJabberServer 
 * ���ڣ�2012-8-23 ����02:38:20 
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
public class MultiJabberServer {  
  
      
    /** 
     * ��������main 
     * ������ 
     * ���ߣ� 
     * ���ڣ�2012-8-23 ����02:38:20 
     * @param @param args 
     * @return void 
     */  
    public static void main(String[] args) {  
        ServerSocket s = null;  
        Socket socket  = null;  
        try {  
            s = new ServerSocket(8080);  
            //�ȴ������󡢷���һֱ����  
            while(true){  
                socket = s.accept();  
                System.out.println("socket:"+socket);  
                new ServeOneJabbr(socket);  
                  
            }  
        } catch (Exception e) {  
            try {  
                socket.close();  
            } catch (IOException e1) {  
                // TODO Auto-generated catch block  
                e1.printStackTrace();  
            }  
        }finally{  
            try {  
                s.close();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
          
  
    }  
  
}  
