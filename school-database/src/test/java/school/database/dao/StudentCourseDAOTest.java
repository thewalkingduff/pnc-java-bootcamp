package school.database.dao;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import school.database.entity.StudentCourse;

public class StudentCourseDAOTest {

	@Test
	public void testStudentCourse() {
		StudentCourse a = new StudentCourse();
		a.setId(1);
		a.setCId(3);
		a.setStudentId(10);

		StudentCourse b = new StudentCourse();
		b.setId(1);
		b.setCId(3);
		b.setStudentId(10);
		
		assertEquals(a, b);
	}
}