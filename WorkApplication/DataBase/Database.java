package workforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Database {

	private Session beginSession()
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		return session;
	}

	
	public User validateLoginUser(String userName, String password) {
		Session session = beginSession();
		String queried = "from User where userName = :username and password = :password";
		Query query = session.createQuery(queried);
		query.setParameter("username", userName);
		query.setParameter("password", password);
		List<User> ls = (List<User>)query.list();
		
		if(ls==null || ls.isEmpty())
		{
			return null;
		}
		return ls.get(0);		
	}
	
	public PersonalDetails viewProfileFunct(int userId) {
		Session session = beginSession();
		String queried = "from PersonalDetails where userId = :userId";
		Query query = session.createQuery(queried);
		query.setParameter("userId", userId);
		
		List<PersonalDetails> ls1 = (List<PersonalDetails>)query.list();
		
		if(ls1==null || ls1.isEmpty())
		{
			return null;
		}
		return ls1.get(0);
		
		
	}
	
	public List<EmployeeSchedule> viewEmployeeSchedule(int userId) {
		Session session = beginSession();
		String queried = "from EmployeeSchedule where userId = :userId";
		Query query = session.createQuery(queried);
		query.setParameter("userId", userId);
		
		List<EmployeeSchedule> ls1 = (List<EmployeeSchedule>)query.list();
		
		if(ls1==null || ls1.isEmpty())
		{
			return null;
		}
		return ls1;
	}
	
	public List<EmployeeSchedule> viewEmployeeSchedule() {
		Session session = beginSession();
		String queried = "from EmployeeSchedule";
		Query query = session.createQuery(queried);
		
		List<EmployeeSchedule> ls1 = (List<EmployeeSchedule>)query.list();
		
		if(ls1==null || ls1.isEmpty())
		{
			return null;
		}
		return ls1;
	}
	
	public void UpdateExchange(int userId1, int userId) {
		Session session = beginSession();
		
		String queried = "update EmployeeSchedule set userId = :userId where userId = :userId1";
		Query query = session.createQuery(queried);
		query.setParameter("userId", userId);
		query.setParameter("userId1", userId1);
		session.beginTransaction();

		query.executeUpdate();
		session.close();
	}
	
}
