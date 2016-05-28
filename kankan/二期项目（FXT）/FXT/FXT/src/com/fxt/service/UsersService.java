package com.fxt.service;

import java.util.List;

import com.fxt.entity.Users;

public interface UsersService {
	public Users login(String username,String userpwd);
	public boolean queryUserByUsername(String username);
	public List<Users> queryAllUser();
	public int reg(String username, String userpwd,String tel,int x);
	public boolean queryUserByTel(String tel);
	public Users UpShowUser(int uid);//���º��ѯ�û������Ϣ
	public int AddHead(int uid,String head);//�û����ͷ��
	
	public int ReviseUsersMessage(String name,String tel,String pwd,int uid);//��������
	public int UpUserMessage(String sex,String time,String shenfen,String xingqu,int uid);
	//��̨��ѯ�û���ҳ��
		public int querypage(int size);
		//��̨��ѯÿҳ���û���Ϣ
		public List<Users> queryUsersBypage(int size,int page);
		//��̨�����û���ʹ��״̬
		public int UpUsersStatusByUid(int uid,int status);
		//��̨��ѯ����Ա�û�
		public List<Users> queryGuanLiYuan(int isadmin);
		//��ѯ�ո�ע����û���UID
		public int SelectMaxUid();
}
