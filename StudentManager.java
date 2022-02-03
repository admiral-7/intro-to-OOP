
public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println(student.firstName+" "+student.lastName+" Öğrenci Sınıfa eklendi");
	}
	public void delete(Student student) {
		System.out.println(student.firstName+" "+student.lastName+" Öğrenci Sınıftan silindi");
	}
	public void update(Student student) {
		System.out.println(student.firstName+" "+student.lastName+" Öğrencinin sınıfı güncellendi");
	}
	public void list(Student student) {
		System.out.println("sınıftaki öğrenciler " + student.firstName);
	}

}
