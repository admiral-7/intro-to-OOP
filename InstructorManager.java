
public class InstructorManager extends UserManager{

	private User user;
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+" E�itmen S�n�fa eklendi ");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+" E�itmen S�n�ftan silindi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+"E�itmenin s�n�f� g�ncellendi");
	}
	public void list(Instructor instructor) {
		System.out.println("s�n�ftaki e�itmen " + instructor.firstName);
	}

}
