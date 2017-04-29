package Final;

public class Faculty extends Person{
	private String jobTitle;
	private String department;
	private int numberOfClasses;
	private boolean tenured;
	
	public Faculty(){
		super();
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

}
