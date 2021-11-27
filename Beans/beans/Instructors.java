package beans;

public class Instructors implements java.io.Serializable{

	private String firstName=null;
	private String lastName=null;
	private String empId=null;
	private String coursesAssigned=null;
	private String yearsOfExperience=null;
	private String education=null;
	private String laptopOS=null;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getCoursesAssigned() {
		return coursesAssigned;
	}
	public void setCoursesAssigned(String coursesAssigned) {
		this.coursesAssigned = coursesAssigned;
	}
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getLaptopOS() {
		return laptopOS;
	}
	public void setLaptopOS(String laptopOS) {
		this.laptopOS = laptopOS;
	}
	
	

}