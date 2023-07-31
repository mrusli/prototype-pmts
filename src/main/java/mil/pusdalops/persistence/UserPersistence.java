package mil.pusdalops.persistence;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mil.pusdalops.domain.user.User;
import mil.pusdalops.persistence.user.dao.UserDao;

public class UserPersistence {

	private static ApplicationContext ctx;

	private static final Logger log = Logger.getLogger(UserPersistence.class);
	
	public static void main(String[] args) throws Exception {
		log.info("User DAO verification started...");
		
		ctx = new ClassPathXmlApplicationContext("CommonContext-Dao.xml");

		UserDao userDao = (UserDao) ctx.getBean("userDao");
		
		String username = "iqbal";
		User user =	userDao.findUserByUsername(username);

		log.info(user.toString());
	}

}
