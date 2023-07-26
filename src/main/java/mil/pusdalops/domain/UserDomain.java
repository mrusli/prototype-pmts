package mil.pusdalops.domain;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import mil.pusdalops.domain.user.User;

public class UserDomain {

	public static final Logger log = Logger.getLogger(UserDomain.class);
	
	public static void main(String[] args) {
		log.info("User class verification started...");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		
		Session session = sessionFactory.openSession();
		
		User authUser = session.get(User.class, 1L);
		log.info(authUser.toString());
		
		session.close();
	}

}
