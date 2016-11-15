package com.housecenter;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@EnableAutoConfiguration
@ComponentScan
@MapperScan("com.housecenter.dao")
@SpringBootApplication
public class DlfcRestApplication {

    private static Logger logger = Logger.getLogger(DlfcRestApplication.class);

    //DataSource配置
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {

        return new com.alibaba.druid.pool.DruidDataSource();
    }

    //提供SqlSeesion
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        System.out.println(dataSource());
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mappings/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {

        System.out.println(dataSource().toString());
        return new DataSourceTransactionManager(dataSource());
    }

    public static void main(String[] args) {

        SpringApplication.run(DlfcRestApplication.class, args);
        logger.info("============= DLFC-REST Start Success =============");
    }
}
