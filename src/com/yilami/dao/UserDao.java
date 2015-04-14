package com.yilami.dao;


import com.yilami.base.BaseDao;
import com.yilami.entity.Roles;
import com.yilami.entity.User;


public interface UserDao extends BaseDao<User>{
	public int countUser(String userName,String userPassword);
	
	public User querySingleUser(String userName);
	
	public Roles findbyUserRole(String userId);
}
