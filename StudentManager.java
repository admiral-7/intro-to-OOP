
public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println(student.firstName+" "+student.lastName+" ��renci S�n�fa eklendi");
	}
	public void delete(Student student) {
		System.out.println(student.firstName+" "+student.lastName+" ��renci S�n�ftan silindi");
	}
	public void update(Student student) {
		System.out.println(student.firstName+" "+student.lastName+" ��rencinin s�n�f� g�ncellendi");
	}
	public void list(Student student) {
		System.out.println("s�n�ftaki ��renciler " + student.firstName);
	}

}
