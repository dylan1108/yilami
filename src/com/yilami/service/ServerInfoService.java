package com.yilami.service;

import java.util.List;

import com.yilami.entity.ServerInfo;
import com.yilami.util.PageView;

public interface ServerInfoService {
	public PageView query(PageView pageView,ServerInfo serverInfo);
	
	public List<ServerInfo> queryAll(ServerInfo serverInfo);
	
	public void add(ServerInfo serverInfo);
	
	public void delete(String id);
	
	public ServerInfo getById(String id);
	
	public void modify(ServerInfo serverInfo);
}
