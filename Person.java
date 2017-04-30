package Final;

//Implement Person class
public class Person {
	private String name;
	private String ssn;
	private String address;
	private String gender;
	private int age;
	
	//Construct Person object with specified name, ssn, 
		//address, gender, and age
	public Person(String name, String ssn, String address, String gender, int age){
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.gender = gender;
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
		
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getGender(){
		return gender;
	}
			
	public void setGender(String gender){
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	/* Set the Age of the person
	 * 
	 * @param age This is the age of the persons
	 */
	public void setAge(int age) {
		
		//If age is less than 0, then set to 0
		if(age < 0){
			age = 0;
		}
		
		//Set the age
		this.age = age;
	}
	
	//Return a string description of the class
	public String toString() {
		return("\nName: " + name + "\nSsn: " + ssn + "\nAddress: " 
				+ address + "\nGender: " + gender + "\nAge: " + age);
	}
}