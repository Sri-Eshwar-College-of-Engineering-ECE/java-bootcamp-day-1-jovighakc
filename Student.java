
public class Student {
	String Name = "Jovigha";
	String RollNo = "25EC064";
	public void display() {
		String College = "ABC Engineering College";
		System.out.println("Name : "+Name+" "+"Roll No:"+RollNo+" "+"college: "+College);
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.display();

	}

}
