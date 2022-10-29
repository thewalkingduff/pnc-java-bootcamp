package school.database.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "majorId")
	private Integer major;
	
	// mapped by department because ... deparment is the name of the java variable in the Course entity
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<StudentCourse> studentCourses;

	@Override
	public String toString() {
		return "Student Id: " + getId() + " | First Name: " + getFirstName() + " | Last Name: " + getLastName();
	}

}
