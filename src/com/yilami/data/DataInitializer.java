package com.yilami.data;

import org.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;

/**
 * 测试数据初始化工具
 *
 * @Date:  2015-04-11
 * @version 0.1v
 */
public class DataInitializer implements InitializingBean {

    private DataSource dataSource;

    private String dataFile;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setDataFile(String dataFile) {
        this.dataFile = dataFile;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        DataFixtures.reloadData(dataSource, dataFile);
    }
}
