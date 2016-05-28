package com.ss.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;
import com.ss.entity.Admin;
import com.ss.entity.Vote;
import com.ss.entity.Votecontext;
import com.ss.factory.BaseAction;
import com.ss.service.H8Service;
import com.ss.service.impl.H8ServiceImpl;

@SuppressWarnings("serial")
public class H8VotecontextAction extends ActionSupport {
	private String[] votecontexts;
	private Integer id;
	
	H8VoteAction h8va=new H8VoteAction();

	BaseAction ba=new BaseAction();
	H8Service h8s=new H8ServiceImpl();
	
	public String add(){
		Set<Votecontext> votecontext =new HashSet<Votecontext>();
		Vote vote=(Vote)ba.getSession().getAttribute("vote");
		for(int i=0;i<votecontexts.length;i++){
			System.out.println(votecontexts[i]);
			Votecontext v=new Votecontext();
			v.setContext(votecontexts[i]);
			v.setCount(0);
			v.setVote(vote);
			votecontext.add(v);
		}
		vote.setVotecontexts(votecontext);
		Admin admin=(Admin)ba.getSession().getAttribute("admin");
		vote.setAdmin(admin);
		vote.setDateCreated(new Timestamp(new Date().getTime()));
		h8s.add(vote);
		return h8va.findVote();
	}
	
	public String delete(){
		System.out.println("deleteVotecontext...");
		System.out.println(id);
		Vote vote=(Vote)ba.getSession().getAttribute("vote");
		for (Votecontext votecontext: vote.getVotecontexts()) {
			if(votecontext.getId().intValue()==id.intValue()){
				vote.getVotecontexts().remove(votecontext);
				break;
			}
		}
		ba.getSession().setAttribute("vote", vote);
		return "updateVote";
	}
	
	public String[] getVotecontexts() {
		return votecontexts;
	}

	public void setVotecontexts(String[] votecontexts) {
		this.votecontexts = votecontexts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
