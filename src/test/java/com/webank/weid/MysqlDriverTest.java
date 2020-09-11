package com.webank.weid;

import com.webank.weid.protocol.response.ResponseData;
import com.webank.weid.suite.persistence.sql.SqlDomain;
import com.webank.weid.suite.persistence.sql.SqlExecutor;
import com.webank.weid.suite.persistence.sql.driver.MysqlDriver;
import org.junit.Test;

public class MysqlDriverTest {
    private static final String domain = "domain.defaultInfo";

    @Test
    public void testDomain() {
        // 1. 检查表是否存在，不存在就创建新表，并把domain<->tableName存到本地缓存中；
        MysqlDriver mysqlDriver = new MysqlDriver();

        ResponseData<String> ret = mysqlDriver.get(domain, "123456");
        System.out.println(ret);

        //mysqlDriver.save(domain, "123456", "data123456");

    }

    @Test
    public void testResolveDomain() {
        SqlExecutor sqlExecutor = new SqlExecutor(new SqlDomain(domain));
        System.out.println(sqlExecutor.toString());

    }
}
