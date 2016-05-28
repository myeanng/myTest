package test.string;
import java.io.FileOutputStream;
import java.text.Format;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String str="aaaaaaaaaaa大的玩法大师大师法师法师阿萨达瓦大苏打，aas湿哒哒是倒萨大实打实实打实大aa大的玩法大师大师法师法师阿萨达瓦大苏打；；；";
		String str1="";
		String str2="";
		String str3="";
		
		if(str.length()>60&&str.length()<=120){
			System.out.println("tiaojian1");
			str1=str.substring(0, 60);
			str2=str.substring(60);
		}else if(str.length()>120){
			System.out.println("tiaojian2");
			str1=str.substring(0, 60);
			str2=str.substring(60,120);
			str3=str.substring(120);
		}else{
			System.out.println("tiaojian3");
			str1=str;
		}
		System.out.println(str+"长度："+str.length());
		System.out.println(str1+"长度："+str1.length());
		System.out.println(str2+"长度："+str2.length());
		System.out.println(str3+"长度："+str3.length());
		Formatter frm=new Formatter();
		str1="1100         1";
		str2="M某";
		str3="某M";
		Calendar c = null;
		str1=String.format("%-4.4s",str1);
		str2=String.format("%-10.10S",str2);
		str3=String.format("%-10.10S",str3);
		System.err.println(str1.length());
		System.err.println(str2.length());
		System.err.println(str3.length());
		
		
		
		//
		List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();
		for(int i=0;i<1000;i++){
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("PS@ACPDATE", i);
			map.put("PS@TXID", i);
			map.put("PS@SNDBANKCODE", i);
			map.put("PS@SNDCLRBANKCODE", i);
			map.put("PS@PAYERBANKCODE", i);
			map.put("PS@PAYERACCNO", i);
			map.put("PS@PAYEEBANKCODE", i);
			map.put("PS@PAYEEACCNO", i);
			map.put("PS@PAYEEACCNAME", i);
			map.put("PS@PAYEEBANKCODE", i);
			map.put("PS@PAYEEACCADR", i);
			map.put("PS@RCVBANKCODE", i);
			map.put("PS@RCVCLRBANKCODE", i);
			map.put("PS@TRANAMT", i);
			map.put("PS@TRANTYPE", i);
			map.put("PS@TRANKIND", i);
			map.put("PS@HOSTSTATUS", i);
			map.put("PS@TRANSTATUS", i);
			results.add(map);
		}
		System.out.println(results);
		StringBuffer strb=new StringBuffer("");
		Object value=null;
		long sj=System.currentTimeMillis();
		System.err.println(new Date());
		for (Map<String, Object> map : results) {
			value=String.format("%-8.8s", map.get("PS@ACPDATE").toString());
			strb.append(value);
			value=String.format("%-35.35s", map.get("PS@TXID").toString());
			strb.append(value);
			value=String.format("%-14.14s", map.get("PS@SNDBANKCODE").toString());
			strb.append(value);
			value=String.format("%-14.14s", map.get("PS@SNDCLRBANKCODE").toString());
			strb.append(value);
			value=String.format("%-14.14s", map.get("PS@PAYERBANKCODE").toString());
			strb.append(value);
			value=String.format("%-32.32s", map.get("PS@PAYERACCNO").toString());
			strb.append(value);
			value=String.format("%-14.14s", map.get("PS@PAYEEBANKCODE").toString());
			strb.append(value);
			value=String.format("%-32.32s", map.get("PS@PAYEEACCNO").toString());
			strb.append(value);
			value=String.format("%-180.180s", map.get("PS@PAYEEACCNAME").toString());
			strb.append(value);
			value=String.format("%-14.14s", map.get("PS@PAYEEBANKCODE").toString());
			strb.append(value);
			value=String.format("%-210.210s", map.get("PS@PAYEEACCADR").toString());
			strb.append(value);
			value=String.format("%-14.14s", map.get("PS@RCVBANKCODE").toString());
			strb.append(value);
			value=String.format("%-14.14s", map.get("PS@RCVCLRBANKCODE").toString());
			strb.append(value);
			value=String.format("%-18.18s", map.get("PS@TRANAMT").toString());
			strb.append(value);
			value=String.format("%-5.5s", map.get("PS@TRANTYPE").toString());
			strb.append(value);
			value=String.format("%-18.18s", map.get("PS@TRANKIND").toString());
			strb.append(value);
			value=String.format("%-1.1s", map.get("PS@HOSTSTATUS").toString());
			strb.append(value);
			value=String.format("%-2.2s", map.get("PS@TRANSTATUS").toString());
			strb.append(value);
			strb.append("\n");
		}
		System.out.println(strb.toString());
		System.err.println(sj-System.currentTimeMillis());
		System.err.println(new Date());
		String fileName="F:\\test\\file.txt";//FTP路径：/home/edzf/eap_release/ebillfiles/

		System.out.println(fileName);
		FileOutputStream fos=new FileOutputStream(fileName);
		fos.write(strb.toString().getBytes());
		fos.close();
		System.out.println("输出结束。。。");
		
		//转义字符
		String zystr="/home/edzf/eap_release/ebillfiles/";
		System.out.println(zystr);
		
		
		
		
		
		
		
		String s=new String("09999999");
		results.get(0).put("PS@TRANTYPE","09999999");
		System.out.println(results.get(0).get("PS@TRANTYPE")==s?"s等":"s不等");
		String s1="09999999";
		results.get(0).put("PS@TRANTYPE","09999999");
		System.err.println(results.get(0).get("PS@TRANTYPE")==s1?"s1等":"s1不等");
		
		
		
	}

}
