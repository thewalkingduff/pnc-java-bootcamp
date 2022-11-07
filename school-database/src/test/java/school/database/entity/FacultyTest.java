package school.database.entity;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import school.database.dao.FacultyDAO;
import school.database.entity.Faculty;

public class FacultyTest {
	private static FacultyDAO fdao;
	
	@BeforeAll
	public void setup() {
		fdao = new FacultyDAO();
	}
	
	@ParameterizedTest
	@CsvSource({"8,Harlan,Kloss", "9,Dorie,Budde"})
	void testJUnit5CsvParameters(int id, String firstName, String lastName) {
		Faculty expected = new Faculty();
		expected.setId(id);
		expected.setFirstName(firstName);
		expected.setLastName(lastName);
	
		Faculty actual = fdao.findById(id);
		
		assertEquals(expected, actual);	
	}
}

