
public class Instructor extends User{
	String profession;
	String givenCourses;
	
	public Instructor(int id, String firstName, String lastName, int age , String email, String password, String profession, String givenCourses) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password = password;
		this.profession = profession;
		this.givenCourses = givenCourses;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	
	
	
	

}
