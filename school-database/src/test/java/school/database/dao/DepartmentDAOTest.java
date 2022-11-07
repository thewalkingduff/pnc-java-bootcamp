package school.database.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import school.database.entity.Department;

public class DepartmentDAOTest {
	@Test
	public void testFaculty() {
		Department a = new Department();
		a.setId(1);
		a.setName("Mathematics");

		Department b = new Department();
		b.setId(1);
		b.setName("Mathematics");

		
		assertEquals(a, b);
	}
}

