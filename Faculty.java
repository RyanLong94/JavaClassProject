package Final;

//Implement Faculty Class with Person Extension
public class Faculty extends Person{
	private String jobTitle;
	private String department;
	private int salary;
	private int numberOfClasses;
	private boolean tenured;
	
	//Construct Faculty object with specified name, ssn, 
		//address, gender, age, jobTitle, department 
		//salary, and numberOfClasses
	public Faculty(String name, String ssn, String address, 
			String gender, int age, String jobTitle, 
			String department, int salary, int numberOfClasses){
		super(name, ssn, address, gender, age);
		this.jobTitle = jobTitle;
		this.department = department;
		this.salary = salary;
		this.numberOfClasses = numberOfClasses;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

	public boolean isTenured() {
		return tenured;
	}

	public void setTenured(boolean tenured) {
		this.tenured = tenured;
	}
	
	//Return a String description of the class
	public String toString() {
		return super.toString() + "\nJobTitle: " + jobTitle + 
				"\nDepartment: " + department + "\nSalary: " + 
				salary + "\nNumberOfClasses: " + numberOfClasses;
	}

}
