
public class InstructorManager extends UserManager{

	private User user;
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+" Eðitmen Sýnýfa eklendi ");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+" Eðitmen Sýnýftan silindi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+"Eðitmenin sýnýfý güncellendi");
	}
	public void list(Instructor instructor) {
		System.out.println("sýnýftaki eðitmen " + instructor.firstName);
	}

}
