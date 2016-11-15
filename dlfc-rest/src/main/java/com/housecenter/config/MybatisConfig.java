package com.housecenter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "classpath:/mybatisConfig/mybatis-*.xml" })
public class MybatisConfig {

}
