package com.ss.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.entity.Vote;
import com.ss.entity.Votecontext;
import com.ss.factory.BaseAction;
import com.ss.service.H8Service;
import com.ss.service.impl.H8ServiceImpl;

@SuppressWarnings("serial")
public class H8VoteAction extends ActionSupport implements ModelDriven<Vote> {
	
	private Vote vote =new Vote();
	private Integer voteNum;
	private String[] vt;
	
	BaseAction ba=new BaseAction();
	H8Service h8s=new H8ServiceImpl();
	
	public String add(){
		ba.getSession().setAttribute("vote", vote);
		ba.getSession().setAttribute("voteNum", voteNum);
		
		return "addVotecontext";
	}
	
	public String findVote(){
		ba.getSession().setAttribute("listVote", h8s.findVote());
		return "listVote";
	}
	
	public String findVoteTou(){
		ba.getSession().setAttribute("listVote", h8s.findVote());
		return "touVote";
	}
	
	public String findVoteTitle(){
		System.out.println("findVoteTitle...");
		ba.getSession().setAttribute("listVote", h8s.findTitle(vote.getTitle()));
		return "listVote";
	}
	/**
	 * 根据ID查找Vote的全部内容,并跳转到修改页面进行修改
	 * */
	public String findId(){
		ba.getSession().setAttribute("vote", h8s.findVote(vote.getId()));
		return "updateVote";
	}
	
	public String findIdTou(){
		ba.getSession().setAttribute("vote", h8s.findVote(vote.getId()));
		return "touVotecontext";
	}
	
	public String updateVote(){
		System.out.println("updateVote...");
		Vote newVote=(Vote)ba.getSession().getAttribute("vote");
		newVote.setPublish(vote.getPublish());
		newVote.setType(vote.getType());
		//遍历集合更改Votecontexts内容
		System.out.println(vt.length);
		int i=vt.length;
		//判断是否有新选项的添加
		if(i==newVote.getVotecontexts().size()){
			int j=0;
			for (Votecontext votecontext: newVote.getVotecontexts()) {
				votecontext.setContext(vt[j]);
				j++;
			}
		}else{
			int j=0;
			for (Votecontext votecontext: newVote.getVotecontexts()) {
				votecontext.setContext(vt[j]);
				j++;
			}
			for(;j<i;j++){
				Votecontext v=new Votecontext();
				v.setContext(vt[j]);
				v.setCount(0);
				v.setVote(vote);
				newVote.getVotecontexts().add(v);
			}
		}
		
		h8s.update(newVote);
		return findVote();
	}
	public Vote getModel() {
		// TODO Auto-generated method stub
		return vote;
	}

	public Integer getVoteNum() {
		return voteNum;
	}

	public void setVoteNum(Integer voteNum) {
		this.voteNum = voteNum;
	}

	public String[] getVt() {
		return vt;
	}

	public void setVt(String[] vt) {
		this.vt = vt;
	}

	
}
