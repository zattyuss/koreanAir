package koreanAir.copy.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import koreanAir.copy.security.CustomUserDetailService;

@Configuration
@EnableWebSecurity
@ComponentScan("koreanAir.copy.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	AuthenticationSuccessHandler loginSuccessHandler;
	
	@Autowired
	CustomUserDetailService customUserDetailService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetailService)
		.passwordEncoder(bcryptPwEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/member/all").permitAll()
			.antMatchers("/member/admin").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/member/member").access("hasRole('ROLE_MEMBER')");
		http.formLogin()
			.loginPage("/customLogin")
			.loginProcessingUrl("/login")
			.successHandler(loginSuccessHandler);
		http.logout()
			.logoutUrl("/customLogout")
			.invalidateHttpSession(true)
			.deleteCookies("remember-me", "JSESSION_ID");
		http.rememberMe().key("project")
			.tokenRepository(persistentTokenRepository())
			.tokenValiditySeconds(604800);
	}
   
	
		@Autowired
		DataSource dataSource;
	   @Bean
	   public PersistentTokenRepository persistentTokenRepository() {
		   JdbcTokenRepositoryImpl repo = new JdbcTokenRepositoryImpl();
		   repo.setDataSource(dataSource);
		   return repo; 
	   }
	   
		@Bean
		public  PasswordEncoder bcryptPwEncoder() {
			return new BCryptPasswordEncoder();
		}
	
	

}
