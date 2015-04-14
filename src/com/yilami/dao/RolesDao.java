package com.yilami.dao;


import java.util.List;

import com.yilami.base.BaseDao;
import com.yilami.entity.Roles;
import com.yilami.entity.UserRoles;


public interface RolesDao extends BaseDao<Roles>{
	public List<Roles> findAll();
	public void deleteUserRole(String userId);
	public void saveUserRole(UserRoles userRoles);
}
