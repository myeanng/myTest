package com.fxt.service;

import java.util.List;

import com.fxt.entity.Goods;

public interface GoodsService {

	public int addgoods(Goods good);
	public List<Goods> selectAll();
	public int countpage(int size);
	public List<Goods> selectPageGoods(int size,int dangqianye);
	public Goods selectGoods(int gid);
	public int updategoods(Goods good);
	public int updategoodsisdelete(int gid,int isdelete);
	public List<Goods> selectweekgoods();
	public List<Goods> selecttodaygoods();
	public List<Goods> selectlistgoods(int gcid);
	public List<Goods> queryGoodsByGclidandDid(int gclid,int did);
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
	
	public int UpGoodSupNum(int uid,int num, int status);
	
	//����ͼƬ
	public int UpGoodsPic(String pic,int xuan,int gid);
	//��̨������Ʒ
	public List<Goods> sousuoGoods(String gid,String gname,String createtime);
	//��̨������Ʒʱ��ѯ��Ʒ�����Ƿ��ظ�
	public boolean queryGoodsByGname(String gname);
}
