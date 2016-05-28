package clsaa.wshh.edzf.hm;

public class PrepareBrcCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brc="598";
		//String accno="5992010420005755";
		//String accno="FTF2010420005755";
		//String accno="FTE2010420005755";
		//String accno="FTU2010420005755";
		String accno="NRA599775290000026";
		String TranCode="581717";
		System.out.println(accno.substring(3,6));
		//
		if("581717".equals(TranCode)){
			if(brc.equals(accno.substring(0,3))){
				System.out.println("继续交易。。。");
			}else if(brc.equals("598")&&("FTE".equals(accno.substring(0,3))||"FTU".equals(accno.substring(0,3))||"FTN".equals(accno.substring(0,3))||"FTI".equals(accno.substring(0,3))||"FTF".equals(accno.substring(0,3)))){
				//自贸区字母开头账号
				System.out.println("继续交易。。。");
			}else{
				System.out.println("没有权限操作。。。");
			}
		}
	}

}
