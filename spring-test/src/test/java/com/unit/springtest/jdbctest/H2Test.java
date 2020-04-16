package com.unit.springtest.jdbctest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.util.Assert;


import javax.sql.DataSource;

/**
 * @author lanruqi
 * @date 2020/4/16
 */
@JdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
public class H2Test {
    @Autowired
    private DataSource dataSource;

    @Test
    public void h2Test() {
        Assert.notNull(dataSource);
    }
}
