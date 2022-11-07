package school.database.dao;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import school.database.entity.Faculty;

public class FacultyDAO {
	
	// HOMEWORK implement a find by name
	
	// this is the mechanics of getting a record from the database
	public Faculty findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "SELECT d FROM Faculty d where d.id = :pk";

		TypedQuery<Faculty> query = session.createQuery(hql, Faculty.class);
		query.setParameter("pk", id);

		Faculty result = query.getSingleResult();

		t.commit();
		factory.close();
		session.close();

		return result;
	}
	

	
}