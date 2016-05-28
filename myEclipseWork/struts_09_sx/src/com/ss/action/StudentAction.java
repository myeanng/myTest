package com.ss.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.entity.Student;

@SuppressWarnings("serial")
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
	private Student st=new Student();
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	public String add() throws Exception {
		System.out.println("add...1...");
		String fileName=ServletActionContext.getServletContext().getRealPath("/img")+"\\"+getUploadFileName();
		FileOutputStream fos=new FileOutputStream(fileName);
		FileInputStream fis=new FileInputStream(getUpload());
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))>0){
			fos.write(b,0,len);
			System.out.println("add...3...");
		}
		fos.close();
		fis.close();
		System.out.println("add...2...");
		return SUCCESS;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public Student getModel() {
		// TODO Auto-generated method stub
		return st;
	}
	
}
