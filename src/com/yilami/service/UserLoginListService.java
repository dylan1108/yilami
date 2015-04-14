package com.yilami.service;

import com.yilami.entity.UserLoginList;
import com.yilami.util.PageView;

public interface UserLoginListService {
	public PageView query(PageView pageView,UserLoginList userLoginList);
	
	public void add(UserLoginList userLoginList);

}
