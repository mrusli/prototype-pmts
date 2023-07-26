package mil.pusdalops.webui.security;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	private static final Logger log = Logger.getLogger(SecurityConfig.class);

	private static final String ZUL_FILES = "/zkau/web/plbn/**";
	
    private static final String[] ZK_RESOURCES = {
            "/zkau/web/js/*",
            "/zkau/web/css/*",
            "/zkau/web/font/*",
            "/zkau/web/img/*",
            "/zkau/web/error/*"
    };
    private static final String REMOVE_DESKTOP_REGEX = "/zkau\\?dtid=.*&cmd_0=rmDesktop&.*";

	public SecurityConfig() {
		super();
		
		log.info("Configuration - WebSecurity - SecurityConfiguration Started");
	}
	
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	log.info("Define Security FilterChain - Disable the default spring security login");
    	
    	http
    		.csrf(csrf -> csrf.disable())
        	.authorizeHttpRequests(authz -> authz
        		.requestMatchers(ZUL_FILES).permitAll()
        		.requestMatchers("/**").permitAll()
    			.requestMatchers(HttpMethod.GET, ZK_RESOURCES).permitAll()
    			.requestMatchers(HttpMethod.GET, REMOVE_DESKTOP_REGEX).permitAll()
    			.requestMatchers(req -> "rmDesktop".equals(req.getParameter("cmd_0"))).permitAll());
    			// .requestMatchers("/success").authenticated()
    			// .requestMatchers("/secure/**").authenticated()
    			// .anyRequest().authenticated())
 		
    	return http.build();
    }	
}
