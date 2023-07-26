package mil.pusdalops.webui.security;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	private static final Logger log = Logger.getLogger(SecurityConfig.class);

	public SecurityConfig() {
		super();
		
		log.info("Configuration - WebSecurity - SecurityConfiguration Started");
	}
	
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	log.info("Define Security FilterChain - Disable the default spring security login");
    	
    	http
    		.httpBasic(Customizer.withDefaults());
 		
    	return http.build();
    }	
}
