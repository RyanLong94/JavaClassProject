package Final;

//Implement Student Class with Person Extension
public class Student extends Person{
	private String vid;
	private String major;
	private String classLevel;
	private Double gpa;
	
	//Construct Student object with specified name, ssn, 
	//address, gender, age, vid, major, classLevel, and gpa
	public Student(String name, String ssn, String address, 
			String gender, int age, String vid, String major, 
			String classLevel, double gpa) {
		super(name, ssn, address, gender, age);
			this.vid = vid;
			this.major = major;
			this.classLevel = classLevel;
			this.gpa = gpa;
	}

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	//Return a String description of the class
public String toString() {
	return super.toString() + "\nVid: " + vid + "\nMajor: " + 
			major + "\nClassLevel: " + classLevel + "\nGpa: " + gpa;
}
}
