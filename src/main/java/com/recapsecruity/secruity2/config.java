package com.recapsecruity.secruity2;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class config extends WebSecurityConfigurerAdapter  {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic();
		http.formLogin();
		
		http.authorizeHttpRequests().antMatchers("/user").authenticated()
		.and().authorizeHttpRequests().antMatchers("/index").permitAll();
		
	}

	
	
}
