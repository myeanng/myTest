package struts.sl3.dao;

import java.util.List;

import struts.sl3.entity.Admin;

public interface AdminDao {
Admin checkLogin(String name,String pwd);
List<Admin> findAll();
int addAdmin(Admin admin);
int delAdmin(int id);
int updAdmin(Admin admin);
}
