
public class Student extends User {
	String className;
	String currentCourse;
	
	public Student(int id, String firstName, String lastName, int age , String email, String password, String className, String currentCourse) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password = password;
		this.className = className;
		this.currentCourse = currentCourse;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTakenCourse() {
		return currentCourse;
	}
	public void setTakenCourses(String currentCourse) {
		this.currentCourse = currentCourse;
	}

}
