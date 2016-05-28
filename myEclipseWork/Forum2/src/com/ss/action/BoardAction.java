package com.ss.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.dao.BoardDao;
import com.ss.dao.impl.BoardDaoImpl;
import com.ss.entity.Board;
import com.ss.factory.BaseAction;

@SuppressWarnings("serial")
public class BoardAction extends ActionSupport implements ModelDriven<Board> {
	private Board b=new Board();
	BoardDao pd= new BoardDaoImpl();
	BaseAction ba=new BaseAction();
	public String add(){
		pd.add(b);
		System.out.println("���ӳɹ�...");
		return SUCCESS;
	}
	public String find(){
		Board board=pd.sel(b.getId());
		ba.getSession().setAttribute("board", board);
		return "dui";
	}
	public String del(){
		pd.del(b.getId());
		return SUCCESS;
	}
	public String upd(){
		pd.upd(b);
		return find();
	}
	public Board getModel() {
		// TODO Auto-generated method stub
		return b;
	}

}
