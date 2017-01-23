package exercise1;

public class Patient {
	
	//Declaration of Instance Variables
	private String patientID;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String province;
	private String postalCode;
	
	//Declaration of Constructors
	public Patient(String patientID, String firstName, String lastName, String address, String city, String province, String postalCode){
		this.patientID = patientID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}
	
	//Default Constructor
	public Patient(){
		patientID = "101";
		firstName = "Shruti";
		lastName = "Kaushal";
		address = "ABC";
		city = "Toronto";
		province = "ON";
		postalCode = "A1A1A1";
	}
	
	//Setters for Instance Variables
	public void setPatientID(String PatientID){
		this.patientID = PatientID;
	}
	
	public void setFirstName(String FName){
		this.firstName = FName;
	}
	
	public void setLastName(String LName){
		this.lastName = LName;
	}
	
	public void setAddress(String Address){
		this.address = Address;
	}
	
	public void setCity(String City){
		this.city = City;
	}
	
	public void setProvince(String Province){
		this.province = Province;	
	}
	
	public void setPostalCode(String PostalCode){
		this.postalCode = PostalCode;
	}
	
	//Getters
	
	public String getPatientID(){
		return patientID;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getProvince(){
		return province;
	}
	
	public String getPostalCode(){
		return postalCode;
	}
	
	//getPatientInfo Method
	public String getPatientInfo(){
		String patientInfo = String.format("Patient Info is given below: %n PatientID: %s%n First Name: %s%n LastName: %s%n Address: %s%n City: %s%n Province: %s%n PostalCode: %s%n",getPatientID(), getFirstName(), getLastName(), getAddress(), getCity(), getProvince(), getPostalCode());
		return patientInfo;
	}
}

