package com.yilami.dao.impl;

import org.springframework.stereotype.Repository;

import com.yilami.base.impl.BaseDaoImpl;
import com.yilami.dao.UserLoginListDao;
import com.yilami.entity.UserLoginList;

@Repository("userLoginListDao")
public class UserLoginListDaoImpl extends BaseDaoImpl<UserLoginList> implements UserLoginListDao{

}
