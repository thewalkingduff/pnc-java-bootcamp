package school.database.dao;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import school.database.entity.Course;
import school.database.entity.Student;

public class StudentDAO {
	public Student findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "SELECT s FROM Student s where s.id = :pk";

		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("pk", id);

		Student result = query.getSingleResult();

		t.commit();
		factory.close();
		session.close();

		return result;
	}
	
	public void insert(Student student ) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(student);

		t.commit();
		factory.close();
		session.close();
	}
}
