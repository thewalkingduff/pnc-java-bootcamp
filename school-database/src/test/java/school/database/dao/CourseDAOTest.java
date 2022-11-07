package school.database.dao;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.*;

import school.database.dao.CourseDAO;
import school.database.entity.Course;

public class CourseDAOTest {
	
	private static CourseDAO courseDAO;
	
	@Before
	public void setUp() {
		courseDAO = new CourseDAO();
	}
	
	@Test
	public void testGetCourseByName() {
		Course expected = new Course();
		
		expected.setId(1);
		expected.setName("Accounting & Finance");
		expected.setDeptId(2);
		
		List<Course> actualList = courseDAO.findByCourseName(expected.getName());
		
		assertTrue(actualList.size() > 0);
		
		Course actual = actualList.get(0);
		assertEquals(expected.getName(), actual.getName());
		assertEquals(expected.getDeptId(), actual.getDeptId());
				
	}
	
	@Test
	public void testFindByCourseNameStartsWith() {
		Course expected1 = new Course();
		
		expected1.setId(41);
		expected1.setName("History");
		expected1.setDeptId(3);
		
		Course expected2 = new Course();
		
		expected2.setId(41);
		expected2.setName("History");
		expected2.setDeptId(3);
		
		List<Course> actualList = courseDAO.findByCourseNameStartsWith("History");
		
		assertTrue(actualList.size() == 2);
		
		Course actual1 = actualList.get(0);
		assertEquals(expected1, actual1);
		assertEquals(expected1.getName(), actual1.getName());
		assertEquals(expected1.getDeptId(), actual1.getDeptId());
		
		Course actual2 = actualList.get(0);
		assertEquals(expected2, actual2);
		assertEquals(expected2.getName(), actual2.getName());
		assertEquals(expected2.getDeptId(), actual2.getDeptId());
	}
	
	
	
	

}
