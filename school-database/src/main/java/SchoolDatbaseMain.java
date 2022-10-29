import java.util.List;

import school.database.dao.CourseDAO;
import school.database.dao.DepartmentDAO;
import school.database.dao.StudentDAO;
import school.database.entity.Course;
import school.database.entity.Department;
import school.database.entity.Student;

public class SchoolDatbaseMain {

	public static void main(String[] args) {

		CourseDAO courseDao = new CourseDAO();

		Course c = courseDao.findById(28);
		System.out.println(c);
		System.out.println("---------------Search by Name/Keyword/Partial Match-------------------");
		List<Course> courses = courseDao.findByCourseName("Scien");
		for (Course course : courses) {
			System.out.println(course);
		}
		System.out.println(courses);
		// ------------------------------ inserting a course

		DepartmentDAO departmentDao = new DepartmentDAO();
//		Department science = departmentDao.findById(7);
//		System.out.println("Art Department: " + science);

//		Course newCourse = new Course();

		// we should not have to set an id because it should always be an autoincrmeent
		// every time you run the code you will have to manually change this id
//		newCourse.setId(100);
//		newCourse.setName("Thermodynamics");
//		newCourse.setDepartment(science);

		// insert into course ( id , name, deptId ) values ( 101, "by sql", (select id
		// from department d where d.id = 1 ));
//		courseDao.insert(newCourse);

		// https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping
		// 1) implement a find by name on the deptarmentdao
		System.out.println("---------------Deparments by Name-------------------");
		List<Department> deptsByName = departmentDao.findByName("Sci");
		for(Department department: deptsByName) {
			System.out.println(department);
			
		}
		// 2) implement a findByNameStartsWith on the course dao .. using a HQL like
				// I updated findbyName to include like
		
		// 3) create entity for student table
		
		// 4) create a dao for student with findById
		StudentDAO studentDAO = new StudentDAO();
		Student student = studentDAO.findById(5);
		System.out.println("findById: " + student);
		// 5) use mysql workbench to add a id column that is a PK , not null , auto
		// increment to the studentcourse table
		// Ian hooked us up.
		
		// 5) create an entity for studentcourse table
		
		// 6) create a one to many relationship between student course and student
		// 7) create a one to many relationship between student course and course

		// bonus -- try to register a student for a course
		Student newStudent = new Student();
		newStudent.setFirstName("Michael");
		newStudent.setLastName("Jordan");
		newStudent.setMajor(5);
		studentDAO.insert(newStudent);

	}

}
