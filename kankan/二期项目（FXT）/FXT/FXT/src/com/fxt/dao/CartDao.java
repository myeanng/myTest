package com.fxt.dao;

import java.util.List;

import com.fxt.entity.Cart;

public interface CartDao {
	//�����ݿ⹺�ﳵ���м���һ�����ﳵ��Ϣ
	public int addcart(Cart Carts);
	//�����û�ID����ƷID��ѯ���ݿ⹺�ﳵ�����Ƿ��Ѵ��ڸ���Ʒ��Ϣ
    public Cart queryCartByUid_Gid(int uid,int gid);
    //�����û�ID����ƷID����Ʒ����num���¹��ﳵ������Ʒ����
    public int upCartByUid_Gid(int uid,int gid,int num,float totalmoney);
    //�����û�ID��ѯ�����û����ﳵ���е���Ʒ
    public List<Cart> queryCartByUid(int uid);
    //������ƷID���û�IDɾ�����ﳵ�����Ʒ
    public int DelCartByGid_Uid(int gid,int uid);
}
