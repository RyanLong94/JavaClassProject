package Final;

public class Person {
	private String name;
	private String ssn;
	private String address;
	private String gender;
	private String phoneNumber;
	private int age;
	
	public static int numPersons;
	
	public Person(){
		numPersons++;
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getSsn() {
		this.ssn = ssn;
	}
		
	public String setSsn(String ssn){
		return ssn;
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
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}