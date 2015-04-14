package com.yilami.dao.impl;

import org.springframework.stereotype.Repository;

import com.yilami.base.impl.BaseDaoImpl;
import com.yilami.dao.ServerInfoDao;
import com.yilami.entity.ServerInfo;

@Repository("serverInfoDao")
public class ServerInfoDaoImpl extends BaseDaoImpl<ServerInfo> implements ServerInfoDao{

}
