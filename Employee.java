public class Employee{
	String name,id;
	double salary;
	public Employee(String N ,String I , double S){
		name = N;
		id = I;
		salary = S;
	}
	public static void main(String[]args){
		Employee e1 = new Employee("Alice","E123",45000.0);
		Employee e2 = new Employee("Bob","E124",35000.0);
		e1.Employeeclass();
		e2.Employeeclass();
	}
	public void Employeeclass(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
}