package com.cs.eureka.server.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description:
 * @Author: shuai.chen
 * @Date: 2019/7/27 10:50
 */
//@EnableWebSecurity
public class SercurityConfig extends WebSecurityConfigurerAdapter {

    // 自定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("all").password("123456").roles("VIP1")
                .and()
                .withUser("angle").password("123456").roles("VIP1", "VIP2")
                .and()
                .withUser("god").password("123456").roles("VIP1", "VIP2", "VIP3");
    }

}
