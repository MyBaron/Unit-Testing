package com.unit.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author lanruqi
 * @date 2020/4/16
 */
@Configuration
public class DataSource {

    @Autowired
    private DataSource dataSource;
}
