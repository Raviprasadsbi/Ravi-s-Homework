
public class StaticStudent
{

	public static void main(String[] args) 
	{
				
		System.out.println("Number of Students in the college is:"+Student.numberofStudents);
		
		Student s1=new Student("Ravi",100,"JNTU");
		Student s2=new Student("prasad",200,"JNTU");
		Student s3=new Student("Kurapati",300,"JNTU");
		Student s4=new Student("Pradeep",400,"JNTU");
		
		System.out.println("Number of Students in the college is"+Student.numberofStudents);
				
		
		
	}

}
class Student
{
	
	String studentName;
	int rollNumber;
	String collegeName;
	static int numberofStudents;
	
	public Student(String studentName, int rollNumber, String collegeName) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		numberofStudents++;
	}
	@Override
	public String toString()
	{
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + "]";
	}
	
}