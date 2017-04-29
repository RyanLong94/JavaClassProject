package Final;

import java.util.ArrayList;
import java.util.List;

//Implement Course Class
public class Course {
	
	//Define Course Variables
	private String courseName;		//Name of the Course
	private String department;		//Name of Department
	private String courseNumber;	//Course Number
	private Faculty instructor;		//Faculty teaching the course
	public List<Student> students = new ArrayList<Student>();	//List of Students taking the Course
	
	//Construct Course object with specified courseName, department, courseNumber, instructor
	public Course(String courseName, String department,
			String courseNumber, Faculty instructor ) {
		this.courseName = courseName;
		this.department = department;
		this.courseNumber = courseNumber;
		this.instructor = instructor;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public Faculty getInstructor() {
		return instructor;
	}
	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	
	/* Get the Number of Students Taking the Course
	 */
	public int getClassSize() {
		return students.size();
	}
	
	/* Add Student to the List of Students
	 */
	public void addStudent(Student student){
		students.add(student);
	}
	
	//Return a String description of the class
	public String toString() {
		return super.toString() + "\nCourseName: " + courseName + "\ndepartment: " 
				+ department + "\nCourseNumber: " + courseNumber + 
				"\nInstructor: " + instructor.toString() + "\nClassSize: " + 
				getClassSize();
	}
}
