package test.random;

import java.util.Date;
import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Long lo=new Date().getTime();
		Random rd=new Random(new Date().getTime());
		System.out.println(lo+"s"+rd.nextInt(999999999));
		int len=rd.nextInt(99);
		String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";     
	    Random random = new Random();     
	         
	   
	    
	    System.out.println();
	    for(int i=0;i<10000;i++){
	    	StringBuffer sb = new StringBuffer();
	    	 for (int j = 0; j < 10; j++) {     
	 	        int number = random.nextInt(base.length());     
	 	        sb.append(base.charAt(number));     
	 	    }     
	 	    sb.toString(); 
			Long l=System.currentTimeMillis();
			System.out.println(l);
			Random rdd=new Random(System.currentTimeMillis());
			System.out.println(l+sb.toString());
		}*/
		StringBuffer path = new StringBuffer("/home/edzf/eap_release/ebillfiles/");
		path.append(System.currentTimeMillis());
		
		String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";    
		Random rd=new Random(System.currentTimeMillis());
    	for (int j = 0; j < 10; j++) {     
 	       int number = rd.nextInt(base.length());     
 	       path.append(base.charAt(number));     
 	    } 
		path.append(".txt");
		System.out.println(path.toString());
	}
}
