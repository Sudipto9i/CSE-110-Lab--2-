public class Car{
	String make , model;
	int year;
	double price;
	public Car(String M,String Mo,int Y,double P){
		make = M;
		model = Mo;
		year = Y;
		price = P;
	}
	public static void main(String[]args){
		Car c1 = new Car("Tesla","Model S",2023,75000.0);
		Car c2 = new Car("Honda","Civic",2022,20000.0);
		c1.CarDetails();
		c2.CarDetails();
	}
	public void CarDetails(){
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
		System.out.println(price);
	}
}