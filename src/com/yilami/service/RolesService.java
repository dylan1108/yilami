package com.yilami.service;


import java.util.List;

import com.yilami.entity.Roles;
import com.yilami.entity.UserRoles;
import com.yilami.util.PageView;

public interface RolesService{
	public PageView query(PageView pageView,Roles roles);
	
	public void add(Roles roles);
	
	public void delete(String id);
	
	public void modify(Roles roles);
	
	public Roles getById(String id);
	
	public List<Roles> findAll();
	
	public void saveUserRole(UserRoles userRoles);
}
