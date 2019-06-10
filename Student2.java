public class Student2 {
	public static void main (String[] args) {
		Student s1=new Student();
		s1.setStudentData(121, "rohan", "mca");
		Student s2=new Student();
		s2.setStudentData(122, "asmita","bca");
		Student s3=new Student();
		s3.setStudentData(123, "hari" ,"bit");
		System.out.println(s1.getStudentenrollment()+", "+s1.getStudentname()+", "+s1.getStudentprogramme());
		System.out.println(s2.getStudentenrollment()+", "+s2.getStudentname()+", "+s2.getStudentprogramme());
		System.out.println(s3.getStudentenrollment()+", "+s3.getStudentname()+", "+s3.g2etStudentprogramme());

		

	}
}


class Student{

	private int enrollment;
	private String name;
	private String programme;
	
	

	public void setStudentData(int enrollment, String name, String programme) {
		this.enrollment = enrollment;
		this.name = name;
		this.programme = programme;
	}
	
	public int getStudentenrollment(){
		return enrollment;
		
	}
	public String  getStudentname(){
		return  name;
		
	}
	public String getStudentprogramme(){
	  
		return  programme;
		
	}
	
	
}