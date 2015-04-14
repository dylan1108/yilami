package com.yilami.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yilami.dao.UserLoginListDao;
import com.yilami.entity.UserLoginList;
import com.yilami.service.UserLoginListService;
import com.yilami.util.PageView;

@Transactional
@Service("userLoginListService")
public class UserLoginListServiceImpl implements UserLoginListService{
	@Autowired
	private UserLoginListDao userLoginListDao;
	
	public PageView query(PageView pageView, UserLoginList userLoginList) {
		List<UserLoginList> list = userLoginListDao.query(pageView, userLoginList);
		pageView.setRecords(list);
		return pageView;
	}

	public void add(UserLoginList userLoginList) {
		userLoginListDao.add(userLoginList);
	}

}
