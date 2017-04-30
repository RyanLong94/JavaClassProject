package Final;

//Implement Faculty Class with Person Extension
public class Faculty extends Person{
	
	private String jobTitle;
	private String department;
	private double salary;
	private int numberOfClasses;	//Number of Classes taught by Faculty
	private boolean tenured;
	
	//Construct Faculty object with specified name, ssn, 
		//address, gender, age, jobTitle, department 
		//salary, and numberOfClasses
	public Faculty(Person person, String jobTitle, 
			String department, double salary, int numberOfClasses){
		super(person.getName(), person.getSsn(), person.getAddress(), 
				person.getGender(), person.getAge());
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
	
	public double getSalary() {
		return salary;
	}
	
	/* Set the Salary for the Faculty
	 * 
	 * @param salary This is the salary of the faculty
	 */
	public void setSalary(double salary) {
		
		//If Salary is less than zero, set to zero
		if(salary < 0.0){
			salary = 0.0;
		}
		
		//Set the salary
		this.salary = salary;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	/* Set the Number of Classes taught by the Faculty
	 * 
	 * @param numberOfClasses Number of classes that the faculty teaches
	 */
	public void setNumberOfClasses(int numberOfClasses) {
		
		//If Number of Classes is less than zero, set to zero
		if(numberOfClasses < 0){
			numberOfClasses = 0;
		}
		
		//Set the Number of Classes
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
