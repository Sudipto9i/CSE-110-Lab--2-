public class Bank{
	String holder;
	double balance;
	public Bank(String H,double B){
		holder = H;
		balance = B;
	}
	public static void main(String[]args){
		Bank b1 = new Bank("John Doe",5000.0);
		Bank b2 = new Bank("Jane Smith",10000.0);
		b1.BankAccount();
		b2.BankAccount();
	}
	public void BankAccount(){
		System.out.println(holder);
		System.out.println(balance);
	}
}