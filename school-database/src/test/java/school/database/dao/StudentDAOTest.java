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
		Student actual = studentDAO.findById(1);
		assertEquals(expected.getFirstName(), actual.getFirstName());
	}
}
