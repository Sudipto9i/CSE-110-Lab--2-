public class Student{
	String name;
	int age;
	double grade;
	public Student(String N,int A,double G){
		name = N;
		age = A;
		grade = G;
	}
	public static void main(String[]args){
		Student s1 = new Student("Alice",20,85.5);
		Student s2 = new Student("Bob",18,92.0);
		s1.StudentDetails();
		s2.StudentDetails();
	}
	public void StudentDetails(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
	}
}