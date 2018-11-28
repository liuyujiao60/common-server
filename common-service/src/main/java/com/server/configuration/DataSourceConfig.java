package com.server.configuration;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;

@Configuration("commonDataSourceConfig")
public class DataSourceConfig {

    @Primary
    @Bean(name="commonDSProperties")
    @Qualifier("commonDSProperties")
    @ConfigurationProperties(prefix = "spring.datasource.datasource-common")
    public DataSourceProperties commonDSProperties(){//这是是用hikariCP的时候用的
        return new DataSourceProperties();
    }

//    @Primary
//    @Bean(name = "commonDS")
//    @ConfigurationProperties(prefix = "spring.datasource.datasource-common")
//    public HikariDataSource dataSourceCommon(){
//        //return DruidDataSourceBuilder.create().build(); //使用druidCP时打开这个注释，同时注释掉下面一行
//        return commonDSProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
//    }

}
