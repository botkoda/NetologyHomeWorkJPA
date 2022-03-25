package com.example.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws  Exception{
        auth.inMemoryAuthentication()
                .withUser("roman")
                .password("{noop}1234")
                .roles("READ")
                .and()
                .withUser("ivan")
                .password("{noop}1234")
                .roles("WRITE")
                .and()
                .withUser("levitan")
                .password("{noop}1234")
                .roles("DELETE");
    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws  Exception{
//        http.formLogin()
//                .and()
//                .authorizeRequests().antMatchers("/persons/by-city").permitAll()
//                .and()
//                .authorizeRequests().anyRequest().authenticated();
//    }
}
