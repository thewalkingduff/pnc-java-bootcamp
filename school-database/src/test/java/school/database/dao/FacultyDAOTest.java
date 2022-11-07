package school.database.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import school.database.entity.Faculty;

public class FacultyDAOTest {
	@Test
	public void testFaculty() {
		Faculty a = new Faculty();
		a.setId(1);
		a.setFirstName("Mike");
		a.setLastName("Gabriel");
		
		Faculty b = new Faculty();
		b.setId(1);
		b.setFirstName("Mike");
		b.setLastName("Gabriel");
		
		assertEquals(a, b);
	}
}
