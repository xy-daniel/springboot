package org.javaboy.authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * AccessToken
 * 授权Token
 * @author arctic
 * @date 2020/5/6
 **/
@Configuration
public class AccessTokenConfig {

//    @Resource
//    DataSource dataSource;

    @Bean
    TokenStore tokenStore(){
//        return new JdbcTokenStore(dataSource);
        return new InMemoryTokenStore();
    }
}
