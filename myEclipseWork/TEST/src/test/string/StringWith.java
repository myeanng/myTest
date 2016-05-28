package test.string;

public class StringWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accNo="1234ftE567890";
		accNo=accNo.toLowerCase();
		System.out.println(accNo);
		System.out.println(isStartStr(accNo));
		System.out.println(accNo.contains("tee"));

	}
	
	private static boolean isStartStr(String str){
		return str.startsWith("nra") || str.startsWith("osa") || str.startsWith("ft") ;
	}
	private static boolean isWith(String str,String withStr){
		boolean b=true;
		return true;
	} 
}
