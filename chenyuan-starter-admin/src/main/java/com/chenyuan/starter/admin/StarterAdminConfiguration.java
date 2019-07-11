package com.chenyuan.starter.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@ConditionalOnWebApplication
@EntityScan
@EnableJpaRepositories
@ComponentScan
@MapperScan("com.chenyuan.starter.admin.repository")
public class StarterAdminConfiguration {
    public StarterAdminConfiguration() {
        System.out.println(String.format("StarterAdminConfiguration : "));
    }
}
