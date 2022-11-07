package school.database.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import school.database.dao.StudentDAO;
import school.database.entity.Student;

public class StudentDAOTest {
	private static StudentDAO studentDAO;
	@Before
	public void setUp() {
		studentDAO = new StudentDAO();
	}
	@Test
	public void testGetStudentById() {
		Student expected = new Student();
		expected.setId(1);
		expected.setFirstName("Guadalupe");
		expected.setLastName("Donoghue");
		expected.setMajor(4);
		Student actual = studentDAO.findById(1);
		assertEquals(expected.getFirstName(), actual.getFirstName());
	}
	
	@Test
	public void testStudent() {
		Student a = new Student();
		a.setId(1);
		a.setFirstName("Mike");
		a.setLastName("Gabriel");
		a.setStreet("172 Middle Street");
		a.setStreetDet("Apt 503");
		a.setCity("Lowell");
		a.setState("Massachusetts");
		
		Student b = new Student();
		b.setId(1);
		b.setFirstName("Mike");
		b.setLastName("Gabriel");
		b.setStreet("172 Middle Street");
		b.setStreetDet("Apt 503");
		b.setCity("Lowell");
		b.setState("Massachusetts");		
		
		assertEquals(a, b);
	}
}
