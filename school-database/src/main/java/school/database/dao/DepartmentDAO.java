package school.database.dao;
import java.util.List;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import school.database.entity.Course;
import school.database.entity.Department;

public class DepartmentDAO {
	
	// HOMEWORK implement a find by name
	
	// this is the mechanics of getting a record from the database
	public Department findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "SELECT d FROM Department d where d.id = :pk";

		TypedQuery<Department> query = session.createQuery(hql, Department.class);
		query.setParameter("pk", id);

		Department result = query.getSingleResult();

		t.commit();
		factory.close();
		session.close();

		return result;
	}
	
	public List<Department> findByName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "SELECT d FROM Department d where d.name like :deptName";

		TypedQuery<Department> query = session.createQuery(hql, Department.class);
		query.setParameter("deptName", "%" + name + "%");

		List<Department> result = query.getResultList();

		t.commit();
		factory.close();
		session.close();

		return result;
	}
	
}
