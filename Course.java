package Final;

//Implement Course Class
public class Course {
	private String courseName;
	private String department;
	private String courseNumber;
	private String instructor;
	private int classSize;
	
	//Construct Course object with specified courseName, 
			//department, courseNumber, instructor, classSize
	public Course(String courseName, String department,
			String courseNumber, String instructor, 
			int classSize) {
		this.courseName = courseName;
		this.department = department;
		this.courseNumber = courseNumber;
		this.instructor = instructor;
		this.classSize = classSize;
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
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getClassSize() {
		return classSize;
	}
	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}
	
	//Return a String description of the class
	public String toString() {
		return super.toString() + "\nCourseName: " + courseName + "\ndepartment: " 
				+ department + "\nCourseNumber: " + courseNumber + 
				"\nInstructor: " + instructor + "\nClassSize: " + 
				classSize;
		}
}
