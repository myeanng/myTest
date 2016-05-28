package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fxt.dao.DistrictDao;
import com.fxt.entity.District;
import com.fxt.util.BaseDao;

public class DistrictDaoImpl implements DistrictDao {

	BaseDao bd=new BaseDao("FXT");
	public District queryDistrictByDid(int did) {
		// TODO Auto-generated method stub
		District di=null;
		Connection con=bd.getConn();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=con.createStatement();
			String sql="select * from district where did="+did;
			rs=st.executeQuery(sql);
			while(rs.next()){
				di=new District(rs.getInt(1),rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		return di;
	}

}
