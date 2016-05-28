package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fxt.dao.UsersDao;
import com.fxt.entity.Users;
import com.fxt.util.BaseDao;

public class UsersDaoImpl implements UsersDao {
	BaseDao bd=new BaseDao("FXT");
	public static String uname=null;
	public boolean flag=false;
	
	/*public Users login(String username, String userpwd) {
		Users user=null;
		String sql="select * from Users where username=? and userpwd=?";
		String[] params={username,userpwd};
		bd.rs=bd.exeQu(sql, params);
		try {
			while(bd.rs.next()){
				user=new Users(bd.rs.getString("username"),bd.rs.getString("userpwd"),bd.rs.getInt("isadmin"),bd.rs.getInt("status"));
				uname=bd.rs.getString("username");
			}
			bd.rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return user;
	}*/

	public boolean queryUserByUsername(String username) {
		String sql="select * from Users where username='"+username+"'";
		bd.rs=bd.exeQu(sql, null);
		try {
			while(bd.rs.next()){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return flag;
	}
	
	public List<Users> queryAllUser() {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Users> list=new ArrayList<Users>();
		String sql="select * from Users";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Users user=new Users(rs.getInt(1),rs.getString(2),rs.getString(4),rs.getInt(5),rs.getFloat(6),rs.getString(7),rs.getInt(9));
				list.add(user);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, conn);
		}
		return list;
	}

	public int reg(String username, String userpwd, String tel,int x) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		int rows=0;
		String sql="insert into Users(username,userpwd,tel,isadmin) values(?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, userpwd);
			pstmt.setString(3, tel);
			pstmt.setInt(4, x);
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, pstmt, conn);
		}
		return rows;
	}

	public boolean queryUserByTel(String tel) {
		String sql="select * from Users where tel='"+tel+"'";
		bd.rs=bd.exeQu(sql, null);
		try {
			while(bd.rs.next()){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return flag;
	}

	public Users login(String username, String userpwd) {
		Users user=null;
		String sql="select * from Users where (username='"+username+"' or tel='"+username+"') and userpwd='"+userpwd+"' and status=1";
		bd.rs=bd.exeQu(sql, null);
		try {
			while(bd.rs.next()){
				user=new Users(bd.rs.getInt("uid"),bd.rs.getString("username"),bd.rs.getString("userpwd"),bd.rs.getString("tel"),bd.rs.getString("address"),bd.rs.getInt("isadmin"));
				uname=bd.rs.getString("username");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return user;
	}
	public int ReviseUsersMessage(String name, String tel,String pwd,int uid) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		int row1=0;
		
		try {
			String sql="update users set username=?,tel=?,userpwd=? where uid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,tel);
			pstmt.setString(3, pwd);
			pstmt.setInt(4,uid);
			 row1=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return row1;
	}

	public int AddHead(int uid,String head) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		
		int row=0;
		try {
			String sql="update users set pic=? where uid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, head);
			pstmt.setInt(2, uid);
			row=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return row;
	}

	public Users UpShowUser(int uid) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Users u=null;
		try {
					String sql="select uid,username,tel,grade,money,createtime,address,sex,birthday,shenfen,hunyinstatus,xingqu,pic from users where uid=?";
					pstmt=conn.prepareStatement(sql);
					pstmt.setInt(1, uid);
					rs=pstmt.executeQuery();
					while(rs.next()){
						u=new Users(rs.getInt("uid"),rs.getString("username"),rs.getString("tel"),rs.getInt("grade"),rs.getFloat("money"),rs.getString("createtime"),rs.getString("address"),rs.getString("sex"),rs.getString("birthday"),rs.getString("shenfen"),rs.getString("hunyinstatus"),rs.getString("xingqu"),rs.getString("pic"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					bd.closeAll(bd.rs, bd.pstmt, bd.conn);
				}
				
		return u;
	}

	public int UpUserMessage(String sex, String time, String shenfen,
			String xingqu, int uid) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
	int row=0;
		try {
			String sql="update users set sex=?,birthday=?,shenfen=?,xingqu=? where uid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sex);
		    pstmt.setString(2, time);
		    pstmt.setString(3, shenfen);
		    pstmt.setString(4, xingqu);
		    pstmt.setInt(5,uid);
		    row=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, bd.pstmt, bd.conn);
		}
		return row;
	}

	public int querypage(int size) {
		// TODO Auto-generated method stub
		Connection con=bd.getConn();
		PreparedStatement pst=null;
		ResultSet rs=null;
		int count=0;
		String sql="select count(*) from users where isadmin=0";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pst, con);
		}	
		return count;
	}

	public List<Users> queryUsersBypage(int size, int page) {
		// TODO Auto-generated method stub
		List<Users> userslist=new ArrayList<Users>();
		Connection con=bd.getConn();
		Statement st=null;
		ResultSet rs=null;
		String sql="select top "+size+" * from users where uid not in(select top "+size*(page-1)+" uid from users where isadmin=0 order by createtime desc) and isadmin=0 order by createtime desc";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				Users us=new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getFloat(6),((rs.getDate(7)).toString()),rs.getInt(8),rs.getInt(9));
				userslist.add(us);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userslist;
	}

	public int UpUsersStatusByUid(int uid, int status) {
		// TODO Auto-generated method stub
		Connection con=bd.getConn();
		PreparedStatement pst=null;
		int row=0;
		String sql="update users set status=? where uid=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, status);
			pst.setInt(2, uid);
			row=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pst, con);
		}
		return row;
	}

	public List<Users> queryGuanLiYuan(int isadmin) {
		// TODO Auto-generated method stub
		List<Users> adminlist=new ArrayList<Users>();
		Connection con=bd.getConn();
		Statement st=null;
		ResultSet rs=null;
		String sql="select * from users where isadmin="+isadmin;
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				Users us=new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getFloat(6),((rs.getDate(7)).toString()),rs.getInt(8),rs.getInt(9));
				adminlist.add(us);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		return adminlist;
	}

	public int SelectMaxUid() {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int uid=0;
		try {
				String sql="select MAX(uid) from users";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()){
					uid=rs.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				bd.closeAll(bd.rs, bd.pstmt, bd.conn);
			}
		return uid;
	}
}
