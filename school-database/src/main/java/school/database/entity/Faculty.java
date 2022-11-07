package school.database.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode
@ToString

@Table(name = "faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include

	@Column(name = "id")
	private Integer id;

	@Column(name = "firstname")
	@EqualsAndHashCode.Include
	private String firstName;
	
	@Column(name = "lastname")
	@EqualsAndHashCode.Include
	private String lastName;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "deptid", nullable = false)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Department department;	
}

