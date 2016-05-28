package com.fxt.service.impl;

import java.util.List;

import com.fxt.dao.CartDao;
import com.fxt.dao.impl.CartDaoImpl;
import com.fxt.entity.Cart;

public class CartServiceImpl implements CartDao {
	CartDaoImpl cartdaoimpl=new CartDaoImpl();

	public int addcart(Cart Carts) {
		// TODO Auto-generated method stub
		return cartdaoimpl.addcart(Carts);
	}

	public Cart queryCartByUid_Gid(int uid, int gid) {
		// TODO Auto-generated method stub
		return cartdaoimpl.queryCartByUid_Gid(uid, gid);
	}

	public int upCartByUid_Gid(int uid, int gid, int num,float totalmoney) {
		// TODO Auto-generated method stub
		return cartdaoimpl.upCartByUid_Gid(uid, gid, num,totalmoney);
	}

	public List<Cart> queryCartByUid(int uid) {
		// TODO Auto-generated method stub
		return cartdaoimpl.queryCartByUid(uid);
	}

	public int DelCartByGid_Uid(int gid, int uid) {
		// TODO Auto-generated method stub
		return cartdaoimpl.DelCartByGid_Uid(gid, uid);
	}

}
