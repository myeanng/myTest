package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.fxt.dao.GoodsDao;
import com.fxt.entity.Goods;
import com.fxt.util.BaseDao;

public class GoodsDaoImpl implements GoodsDao {
	BaseDao bd=new BaseDao("FXT");

	public int addgoods(Goods good) {
		// TODO Auto-generated method stub
		int rows=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="insert Goods(did,gclid,gname,num,supnum,price,nowprice,createtime,destroytime,intro,describe,pic1,pic2,pic3) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, good.getDid());
			pstmt.setInt(2, good.getGclid());
			pstmt.setString(3, good.getGname());
			pstmt.setInt(4, good.getNum());
			pstmt.setInt(5, good.getNum());
			pstmt.setFloat(6, good.getPrice());
			pstmt.setFloat(7, good.getNowprice());
			pstmt.setString(8, (new Timestamp(new java.util.Date().getTime())).toString());
			pstmt.setString(9, good.getDestroytime());
			pstmt.setString(10, good.getIntro());
			pstmt.setString(11, good.getDescribe());
			pstmt.setString(12, good.getPic1());
			pstmt.setString(13, good.getPic2());
			pstmt.setString(14, good.getPic3());
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return rows;
	}

	public List<Goods> selectAll() {
		// TODO Auto-generated method stub
		List<Goods> goodslist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from Goods";
		try {
			pstmt=con.prepareStatement(sql);
		    rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				goodslist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return goodslist;
	}

	public int countpage(int size) {
		// TODO Auto-generated method stub
		int count=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select count(*) from Goods";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return count%size==0?count/size:(count/size+1);
	}

	public List<Goods> selectPageGoods(int size, int dangqianye) {
		// TODO Auto-generated method stub
		List<Goods> pagegoodslist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select top "+size+" * from Goods where gid not in(select top "+(dangqianye-1)*size+" gid from Goods order by createtime desc)order by createtime desc";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				pagegoodslist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return pagegoodslist;
	}

	public Goods selectGoods(int gid) {
		// TODO Auto-generated method stub
		Goods good=null;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from Goods where gid="+gid;
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return good;
	}

	public int updategoods(Goods good) {
		// TODO Auto-generated method stub
		int rows=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="update Goods set did=?,gclid=?,gname=?,num=num+?,supnum=supnum+?,price=?,nowprice=?,destroytime=?,intro=?,describe=? where gid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, good.getDid());
			pstmt.setInt(2, good.getGclid());
			pstmt.setString(3, good.getGname());
			pstmt.setInt(4, good.getNum());
			pstmt.setInt(5, good.getNum());
			pstmt.setFloat(6,good.getPrice());
			pstmt.setFloat(7, good.getNowprice());
			pstmt.setString(8, good.getDestroytime());
			pstmt.setString(9,good.getIntro());
			pstmt.setString(10, good.getDescribe());
			pstmt.setInt(11, good.getGid());
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return rows;
	}

	public int updategoodsisdelete(int gid,int isdelete) {
		// TODO Auto-generated method stub
		int rows=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="update Goods set isdelete=? where gid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, isdelete);
			pstmt.setInt(2, gid);
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return rows;
	}

	public int updategoodspic(String pic1, String pic2, String pic3) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Goods> selectweekgoods() {
		// TODO Auto-generated method stub
		List<Goods> weeklist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select top 10 gid,did,gclid,substring(gname,1,10)+'...',num,supnum,price,nowprice,createtime,destroytime,substring(intro,1,30)+'...',describe,isdelete,ispay,pic1,pic2,pic3 from Goods where DateDiff(DW,createtime,GETDATE())<DatePart(DW,GETDATE()) and isdelete=0 order by createtime desc";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				weeklist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return weeklist;
	}

	public List<Goods> selecttodaygoods() {
		// TODO Auto-generated method stub
		List<Goods> todaylist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select gid,did,gclid,substring(gname,1,13)+'...',num,supnum,price,nowprice,createtime,destroytime,substring(intro,1,40)+'...',describe,isdelete,ispay,pic1,pic2,pic3 from Goods where DATEDIFF(DD,createtime,GETDATE())=0 and isdelete=0 order by createtime desc";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				todaylist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return todaylist;
	}

	public List<Goods> selectlistgoods(int gcid) {
		// TODO Auto-generated method stub
		List<Goods> classlist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select gid,did,gclid,substring(gname,1,13)+'...',num,supnum,price,nowprice,createtime,destroytime,substring(intro,1,40)+'...',describe,isdelete,ispay,pic1,pic2,pic3 from Goods where gclid in(select gclid from goodsClasslist where gcid=?) and isdelete=0 order by createtime desc";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, gcid);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				classlist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return classlist;
	}

	public int queryCountPageByGclid(int gclid,int size) {
		// TODO Auto-generated method stub
		int count=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select count(*) from goods where gclid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, gclid);
			rs=pstmt.executeQuery();
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return count%size==0?count/size:(count/size)+1;
	}

	public List<Goods> queryGoodsByGclid_Pageindex_size(int gclid,
			int pageindex, int size) {
		// TODO Auto-generated method stub
		List<Goods> goodslist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select top ("+size+") gid,did,gclid,substring(gname,1,13)+'...',num,supnum,price,nowprice,createtime,destroytime,substring(intro,1,40)+'...',describe,isdelete,ispay,pic1,pic2,pic3 from goods where gid not in(select top "+(pageindex-1)*size+" gid from goods where gclid="+gclid+" order by createtime desc) and gclid="+gclid+" order by createtime desc";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				goodslist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}		
		return goodslist;
	}

	public int queryCountPageByGclid_Did(int gclid, int did, int size) {
		// TODO Auto-generated method stub
		int count=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select count(*) from goods where gclid=? and did=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, gclid);
			pstmt.setInt(2, did);
			rs=pstmt.executeQuery();
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return count%size==0?count/size:(count/size)+1;
	}

	public List<Goods> queryGoodsByGclid_Did_Pageindex_size(int gclid, int did,
			int pageindex, int size) {
		// TODO Auto-generated method stub
		List<Goods> goodslist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select top ("+size+") gid,did,gclid,substring(gname,1,13)+'...',num,supnum,price,nowprice,createtime,destroytime,substring(intro,1,40)+'...',describe,isdelete,ispay,pic1,pic2,pic3 from goods where gid not in(select top "+(pageindex-1)*size+" gid from goods where gclid="+gclid+" and did="+did+" order by createtime desc) and gclid="+gclid+" and did="+did+" order by createtime desc";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				goodslist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}		
		return goodslist;
	}

	public List<Goods> queryGoodsInSS(String sstj) {
		List<Goods> goodslist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select goods.gid,goods.did,goods.gclid,substring(goods.gname,1,13)+'...',goods.num,goods.supnum,goods.price,goods.nowprice,goods.createtime,goods.destroytime,substring(goods.intro,1,40)+'...',goods.describe,goods.isdelete,goods.ispay,goods.pic1,goods.pic2,goods.pic3 from goods,goodsClass,goodsclasslist,district where (gname like '%"+sstj+"%' or gcname like '%"+sstj+"µê%' or gclname like '%"+sstj+"%' or dname like  '%"+sstj+"%') and goods.gclid=goodsclasslist.gclid and goodsClass.gcid=goodsclasslist.gcid and goods.did=district.did";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				goodslist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}		
		return goodslist;
	}

	public int updategoodsbysupnum(int num, int gid) {
		// TODO Auto-generated method stub
		int rows=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="update Goods set supnum=supnum-? where gid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setInt(2, gid);
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return rows;
	}

	public int UpGoodSupNum(int uid,int num, int status) {
		// TODO Auto-generated method stub
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		int row=0;
		try {
			String sql="update goods set supnum=supnum-? from goods,orders where goods.gid=orders.gid and orders.uid=? and orders.status=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, uid);
			pstmt.setInt(2, num);
			pstmt.setInt(3, status);
			row=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return row;
	}
//¸üÐÂÍ¼Æ¬
	public int UpGoodsPic(String pic, int xuan,int gid) {
		// TODO Auto-generated method stub
		Connection con=bd.getConn();
		PreparedStatement pst=null;
		int row=0;
		if(xuan==1){
			String sql="update goods set pic1=? where gid=?";
			try {
				pst=con.prepareStatement(sql);
				pst.setString(1, pic);
				pst.setInt(2, gid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(xuan==2){
			String sql="update goods set pic2=? where gid=?";
			try {
				pst=con.prepareStatement(sql);
				pst.setString(1, pic);
				pst.setInt(2, gid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(xuan==3){
			String sql="update goods set pic3=? where gid=?";
			try {
				pst=con.prepareStatement(sql);
				pst.setString(1, pic);
				pst.setInt(2, gid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			row=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pst, con);
		}
		return row;
	}

	public List<Goods> sousuoGoods(String gid, String gname, String createtime) {
		// TODO Auto-generated method stub
		List<Goods> gdlist=new ArrayList<Goods>();
		Connection con=bd.getConn();
		Statement st=null;
		ResultSet rs=null;
		String sql=null;
		if(gid!=""&&gname==""&&createtime==""){
			sql="select * from goods where gid="+gid;
		}else if(gname!=""&&gid==""&&createtime==""){
			sql="select * from goods where gname like '%"+gname+"%'";
		}else if(gname==""&&gid==""&&createtime!=""){
			sql="select * from goods where DATEDIFF(DD,'"+createtime+"',createtime)=0";
		}else if(gname!=""&&gid!=""&&createtime==""){
			sql="select * from goods where gid="+gid+" and gname like '%"+gname+"%'";
		}else if(gname!=""&&gid==""&&createtime!=""){
			sql="select * from goods where gname like '%"+gname+"%' and DATEDIFF(DD,'"+createtime+"',createtime)=0";
		}else if(gname==""&&gid!=""&&createtime!=""){
			sql="select * from goods where gid="+gid+" and DATEDIFF(DD,'"+createtime+"',createtime)=0";
		}else if(gname!=""&&gid!=""&&createtime!=""){
			sql="select * from goods where gid="+gid+" and gname like '%"+gname+"%' and DATEDIFF(DD,'"+createtime+"',createtime)=0";
		}
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				Goods good=new Goods(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getFloat(7),
						rs.getFloat(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getInt(14),
						rs.getString(15),rs.getString(16),rs.getString(17));
				gdlist.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		return gdlist;
	}

	public boolean queryGoodsByGname(String gname) {
		// TODO Auto-generated method stub
		boolean jieguo=false;
		Connection con=bd.getConn();
		Statement st=null;
		ResultSet rs=null;
		String sql="select * from goods where gname='"+gname+"'";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				jieguo=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		return jieguo;
	}

}
