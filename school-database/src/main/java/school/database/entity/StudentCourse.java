package school.database.entity;

import javax.persistence.*;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="studentcourse")

public class StudentCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="studentId", insertable=false, updatable = false)
	private Integer studentId;
	
	@Column(name = "courseId", insertable = false, updatable = false)
	private Integer cId;
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "studentId", nullable = false)
    private Student student;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "courseId", nullable = false)
    private Course course;

	@Override
	public String toString() {
		return "StudentCourse [id=" + getId() + ", studentId=" + getStudentId() + ", cId=" + getCId() + "]";
	}
    
    
}
