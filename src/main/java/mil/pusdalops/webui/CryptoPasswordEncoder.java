package mil.pusdalops.webui;

import org.apache.log4j.Logger;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CryptoPasswordEncoder {

	public static final Logger log = Logger.getLogger(CryptoPasswordEncoder.class);
	
	public static void main(String[] args) {
		log.info("Password Encoder");
		
		String password = "123";
		log.info("Encode Password String: "+password);
		
		PasswordEncoder passwordEncoder = new PasswordEncoder() {
			
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				
				return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
			}
			
			@Override
			public String encode(CharSequence rawPassword) {
				
				return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt());
			}
		};
	
		String encodedPassword = passwordEncoder.encode(password);
		log.info(encodedPassword);
	}
}
