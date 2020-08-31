/*
package com.example.SpringBootJpa.Security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        try {
            auth.inMemoryAuthentication()
                    .withUser("Bhuvana")
                    .password("{noop}Bhuvana@123")
                    .roles("ADMIN")
                    .and()
                    .withUser("Pratyusha")
                    .password("{noop}Pratyusha@123")
                    .roles("Manager");
        } catch (java.lang.Exception e) {
            System.out.println("UnAuthorized User");
        }
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable();
        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
        //http.authorizeRequests().antMatchers("/Employer").fullyAuthenticated().and().httpBasic();
    }

    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}

*/
