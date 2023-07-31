package mil.pusdalops.persistence.user.dao.hibernate;

import java.util.List;

import org.hibernate.Session;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import mil.pusdalops.domain.user.User;
import mil.pusdalops.domain.user.UserRole;
import mil.pusdalops.persistence.common.dao.hibernate.DaoHibernate;
import mil.pusdalops.persistence.user.dao.UserDao;

public class UserHibernate extends DaoHibernate implements UserDao {

	@Override
	public User findUserById(Long id) throws Exception {

		return (User) super.findById(User.class, id);
	}

	@Override
	public User findUserByUsername(String username) throws Exception {
		Session session = super.getSessionFactory().openSession();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.select(root).where(
				criteriaBuilder.equal(root.get("user_name"), username));
		
		try {
			
			return session.createQuery(criteriaQuery).getSingleResult();
			
		} catch (Exception e) {
			throw e;

		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() throws Exception {

		return super.findAll(User.class);
	}

	@Override
	public void save(User user) throws Exception {

		super.save(user);
	}

	@Override
	public void update(User user) throws Exception {
		
		super.update(user);
	}

	@Override
	public List<User> findAllUsersByUserRole(UserRole userRole) throws Exception {
		Session session = getSessionFactory().openSession();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.select(root).where(
				criteriaBuilder.equal(root.join("user_roles"), userRole));
		
		try {
		
			return session.createQuery(criteriaQuery).getResultList();
			
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}	
	}

}
