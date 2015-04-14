package com.yilami.dao.impl;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.yilami.base.impl.BaseDaoImpl;
import com.yilami.dao.RolesDao;
import com.yilami.entity.Roles;
import com.yilami.entity.UserRoles;


@Repository("rolesDao")
public class RolesDaoImpl extends BaseDaoImpl<Roles> implements RolesDao
{

	public List<Roles> findAll() {
		return getSqlSession().selectList("roles.findAll");
	}

	public void saveUserRole(UserRoles userRoles ) {
		getSqlSession().insert("roles.saveUserRole", userRoles);
	}

	public void deleteUserRole(String userId) {
		getSqlSession().delete("roles.deleteUserRole", userId);
	}
}
