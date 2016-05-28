package com.socket.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


/** 
 ***************************************************************  
 * ��Ŀ���ƣ�JavaThread 
 * �������ƣ�JabberServer 
 * ���ڣ�2015��7��30��16:09:58
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
public class JabberServer {

	 public static int PORT = 8080;  
	    public static void main(String[] agrs) {  
	        ServerSocket s = null;  
	        Socket socket = null;  
	        BufferedReader br = null;  
	        PrintWriter pw = null;  
	        try {  
	            //�趨����˵Ķ˿ں�  
	            s = new ServerSocket(PORT);  
	            System.out.println("ServerSocket Start:"+s);  
	            //�ȴ�����,�˷�����һֱ����,ֱ����������������  
	            socket = s.accept();  
	            System.out.println("Connection accept socket:"+socket);  
	            //���ڽ��տͻ��˷���������  
	            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
	            //���ڷ��ͷ�����Ϣ,���Բ���Ҫװ����ô��io��ʹ�û�����ʱ��������Ҫע�����.flush()����  
	            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);  
	            while(true){  
	            	//����
	                String str = br.readLine();
	                //���
	                System.out.println("Client Socket Message:"+str);
	                //����1��
	                Thread.sleep(1000);
	                //����
	                str=outString(str);
	                //�Ƿ�ֹͣ����
	                if(str.equals("END")){  
	                    break;  
	                }  
	                
	                //��Ӧ
	                pw.println(str);  
	                //����
	                pw.flush();  
	            }  
	              
	        } catch (Exception e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }finally{  
	            System.out.println("Close.....");  
	            try {  
	                br.close();  
	                pw.close();  
	                socket.close();  
	                s.close();  
	            } catch (Exception e2) {  
	                  
	            }  
	        }  
	    } 
	    
	    private static String outString(String str){
	    	
	    	if("Hello".equals(str)){
	    		str="�Է����᣿��";
	    	}else if("hi".equals(str)){
	    		str="��ã�";
	    	}else if("sorry".equals(str)){
	    		str="û��ϵ��";
	    	}else if("END".equals(str)){
	    		str="�ټ���";
	    	}else{
	    		str="��������";
	    	}
	    	
	    	return str;
	    }
	    
	    private static void oneServer(Socket socket){
	    	 //���ڽ��տͻ��˷���������  
           /* br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
            //���ڷ��ͷ�����Ϣ,���Բ���Ҫװ����ô��io��ʹ�û�����ʱ��������Ҫע�����.flush()����  
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);*/  
	    	
	    }
}