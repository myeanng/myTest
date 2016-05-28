package com.sx.action;

public class JisuanAction extends BaseAction {

	private int num1;
	private int num2;
	private String num4;
	private String fuhao;
	public String execute(){
		if("+".equals(fuhao)){
			int num3=num1+num2;
			num4=num3+"";
			this.getRequest().setAttribute("mun4", num4);
			System.out.println(num4);
			return "dui";
		}
		if("-".equals(fuhao)){
			int num3=num1-num2;
			num4=num3+"";
			System.out.println(num4);
			this.getRequest().setAttribute("mun4", num4);
			return "dui";
		}
		if("*".equals(fuhao)){
			int num3=num1*num2;
			num4=num3+"";
			System.out.println(num4);
			this.getRequest().setAttribute("mun4", num4);
			return "dui";
		}
		if("/".equals(fuhao)){
			int num3=num1/num2;
			num4=num3+"";
			System.out.println(num4);
			this.getRequest().setAttribute("mun4", num4);
			return "dui";
		}
		return "cuo";
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getFuhao() {
		return fuhao;
	}
	public void setFuhao(String fuhao) {
		this.fuhao = fuhao;
	}
	public String getNum4() {
		return num4;
	}
	public void setNum4(String num4) {
		this.num4 = num4;
	}
	
}
