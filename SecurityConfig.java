package com.gl.caseStudy4.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gl.caseStudy4.dao.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserService service;
	
	@Bean
	public PasswordEncoder passwordEncoder(){		
		return NoOpPasswordEncoder.getInstance();
	}
    @Override
	public void configure(AuthenticationManagerBuilder authority) throws Exception {
		//authority.inMemoryAuthentication().withUser("rose").password("mango").roles("USER");
    	authority.getDefaultUserDetailsService();
	}
    @Override
	public void configure(HttpSecurity http) throws Exception {
		/*http.antMatcher("/**").authorizeRequests().anyRequest().hasRole("USER")
		.and().formLogin().loginPage("/loginpage")
		.failureUrl("/loginerror").loginProcessingUrl("/login")
		.permitAll().and().logout()
		.logoutSuccessUrl("/index");*/
    	
    	http.antMatcher("/**").authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/loginpage")
		.failureUrl("/errorpage").loginProcessingUrl("/login")
		.permitAll().and().logout()
		.logoutSuccessUrl("/welcome");
	}
  
}
