package com.fxt.service;

import java.util.List;

import com.fxt.entity.Cart;

public interface CartService {
	//向数据库购物车表中加入一条购物车信息
	public int addcart(Cart Carts);
	//根据用户ID和商品ID查询数据库购物车表中是否已存在该商品信息
	public Cart queryCartByUid_Gid(int uid,int gid);
	//根据用户ID和商品ID更新购物车表中商品数量num和商品总价格totalmoney
	public int upCartByUid_Gid(int uid,int gid,int num,float totalmoney);
	//根据用户ID查询出该用户购物车表中的商品
    public List<Cart> queryCartByUid(int uid);
    //根据商品ID，用户ID删除购物车里的商品
    public int DelCartByGid_Uid(int gid,int uid);
}
