package Final;

//Implement Student Class with Person Extension
public class Student extends Person{
	private String vid;
	private String major;
	private String classLevel;
	private Double gpa;
	
	//Construct Student object with specified name, ssn, 
	//address, gender, age, vid, major, classLevel, and gpa
	public Student(Person person, String vid, String major, 
			String classLevel, double gpa) {
		super(person.getName(), person.getSsn(), person.getAddress(), 
				person.getGender(), person.getAge());
			this.vid = vid;
			this.major = major;
			this.classLevel = classLevel;
			setGpa(gpa);
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

	/* Set the Student's GPA
	 * 
	 * @param gpa This is the GPA of the student
	 */
	public void setGpa(Double gpa) {
		
		//If GPA is less than 0, set to 0
		if(gpa < 0.0){
			gpa = 0.0;
		}
		
		//Set GPA 
		this.gpa = gpa;
	}
	
	//Return a String description of the class
	public String toString() {
		return super.toString() + "\nVid: " + vid + "\nMajor: " + 
				major + "\nClassLevel: " + classLevel + "\nGpa: " + gpa;
	}
}
