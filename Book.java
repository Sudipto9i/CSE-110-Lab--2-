public class Book{
	String title,author;
	double price;
	public Book(String T,String A, double P){
		title = T;
		author = A;
		price = P;
	}
	public static void main(String[]args){
		Book b1 = new Book ("Java Programming","John Doe",50.0);
	    Book b2 = new Book("Phython Basics","Jane Smith",20.0);
		b1.BookDetails();
		b2.BookDetails();
	}
	public void BookDetails(){
		System.out.print(title);
		System.out.printau(thor);
		System.out.print(price);
	}
	
}