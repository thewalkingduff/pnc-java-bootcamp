package school.database.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;
	
	// mapped by department because ... deparment is the name of the java variable in the Course entity
	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Course> courses;	

	@Override
	public String toString() {
		return "Department Id: " + getId() + " | Name: " + getName();
	}

	

	
	
	

}
