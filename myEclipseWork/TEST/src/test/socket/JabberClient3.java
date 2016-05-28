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
 * 项目名称：JavaThread 程序名称：JabberClient 日期：2015年7月30日16:22:41  
 * 作者： 
 * 模块：  
 * 描述：  
 * 备注： 
 * ------------------------------------------------------------  
 * 修改历史 
 * 序号 
 * 日期 
 * 修改人 
 * 修改原因 
 * 修改备注： 
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
            //客户端socket指定服务器的地址和端口号  localhost 127.0.0.1 10.48.8.139 
            socket = new Socket("127.0.0.1", 8080); // JabberServer.PORT
            System.out.println("Socket=" + socket);  
            //同服务器原理一样  
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
            	System.out.print("输入口令：");
            	String str=sa.next();
            	pw.println(str);
            	pw.flush();
            	System.out.println("口令已发出...");
            	System.out.println("等待响应...");
            	str=br.readLine();
            	System.out.println("Server响应内容："+str);
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
