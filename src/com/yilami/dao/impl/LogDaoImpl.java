package com.yilami.dao.impl;
import org.springframework.stereotype.Repository;

import com.yilami.base.impl.BaseDaoImpl;
import com.yilami.dao.LogDao;
import com.yilami.entity.Log;


@Repository("logDao")
public class LogDaoImpl extends BaseDaoImpl<Log> implements LogDao
{
}
