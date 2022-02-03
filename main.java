
public class main {

	public static void main(String[] args) {
		
		Student[] students = new Student[] 
				
				{
				new Student(1,"harun","güngörmez",21,"harun@gmail.com","12abcde","12a","math"),
				new Student(2,"irfan","güngörmez",21,"harun@gmail.com","12abcde","12a","math"),
				new Student(3,"ilknur","güngörmez",21,"harun@gmail.com","12abcde","12a","math")
				};
		
		Instructor[] instructors = new Instructor[]
				
				{
						new Instructor(4,"ahmet","güngörmez",21,"harun@gmail.com","12abcde","geo","math"),
						new Instructor(5,"mehmet","güngörmez",21,"harun@gmail.com","12abcde","geo","math"),
						new Instructor(6,"mahmut","güngörmez",21,"harun@gmail.com","12a","geo","math")
				};
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		for(Instructor instructor : instructors) {
			instructorManager.list(instructor);
		}
		 
		for(Instructor instructor : instructors) {
		instructorManager.add(instructor);
		}
		
		
		StudentManager studentManager = new StudentManager();
		for(Student student: students) {
			studentManager.list(student);
			studentManager.add(student);

		}
	}

}