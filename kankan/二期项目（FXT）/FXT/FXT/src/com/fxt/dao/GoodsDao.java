package com.fxt.dao;

import java.util.List;

import com.fxt.entity.Goods;

public interface GoodsDao {
	//��̨������Ʒ
	public int addgoods(Goods good);
	//��̨�鿴������Ʒ
	public List<Goods> selectAll();
	//��̨����ÿҳ��ʾ��Ʒ������size��ȡ��ҳ��
	public int countpage(int size);
	//��̨����ÿҳ��ʾ��Ʒ�������Ͳ鿴��ҳ����ʾ��Ʒ
	public List<Goods> selectPageGoods(int size,int dangqianye);
	//������ƷGid��ѯ��Ʒ
	public Goods selectGoods(int gid);
	//��̨������Ʒ��Ϣ
	public int updategoods(Goods good);
	//��̨������ƷGid������Ʒ���¼���Ϣ
	public int updategoodsisdelete(int gid,int isdelete);
	//��̨������ƷͼƬ��Ϣ����δ���
	public int updategoodspic(String pic1,String pic2,String pic3);
	//��ҳ��ѯ�������·�����Ʒ
	public List<Goods> selectweekgoods();
	//��ҳ��ѯ�������·�����Ʒ
	public List<Goods> selecttodaygoods();
	//��ҳ���ݴ����Gcid��ѯ���·�����Ʒ
	public List<Goods> selectlistgoods(int gcid);
	//����С����gclid��ÿҳ��ʾ����size����ѯ������С�������Ʒ������ҳ
	public int queryCountPageByGclid(int gclid,int size);
	//����С����gclid�Ͳ�ѯ��ҳ��pageindex��ÿҳ��ʾ������size��ѯ��Ʒ
	public List<Goods> queryGoodsByGclid_Pageindex_size(int gclid,int pageindex,int size);
	//�����������did��С����gclid��ÿҳ��ʾ����size����ѯ��������Ʒ������ҳ
	public int queryCountPageByGclid_Did(int gclid,int did,int size);
	//�����������did��С����gclid�Ͳ�ѯ��ҳ��pageindex��ÿҳ��ʾ������size��ѯ��Ʒ
	public List<Goods> queryGoodsByGclid_Did_Pageindex_size(int gclid,int did,int pageindex,int size);
	//��ҳ����������ť��ѯ����
	public List<Goods> queryGoodsInSS(String sstj);
	//������ƷGid������Ʒ�Ŀ��
	public int updategoodsbysupnum(int num,int gid);
	
	//��̨���¿�������
	public int UpGoodSupNum(int uid,int num,int status);
	//��̨����ͼƬ
	public int UpGoodsPic(String pic,int xuan,int gid);
	//��̨������Ʒ
	public List<Goods> sousuoGoods(String gid,String gname,String createtime);
	//��̨������Ʒʱ��ѯ��Ʒ�����Ƿ��ظ�
	public boolean queryGoodsByGname(String gname);
}
