import java.util.*;
public class Book {

	String name;
	String author;
	String pdate;
	double price;
	
	public Book(String n, String a, String d, double p) {
		this.name = n;
		this.author =a;
		this.pdate=d;
		this.price=p;
	}
	
	static void display(Book B){
		System.out.println(B.name);
		System.out.println(B.author);
		System.out.println(B.pdate);
		System.out.println(B.price);
		System.out.println();
	}
 
	public static void main(String[] args) {
		Book b1 = new Book("Java", "Ananjay", "12-02-2005", 100.34);
		Book b2 = new Book("C++", "Arya", "12-02-2005", 100.34);
		Book b3 = new Book("Python", "Aman", "12-02-2005", 100.34);
		Book b4 = new Book("C", "Amritanshu", "12-02-2005", 100.34);
		
		ArrayList<Book> l1 = new ArrayList<>();
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		
		
	
		 for(Book b: l1 ) 
		   {    
		     display(b);
		   }
		 
		 
		 HashMap<Integer,String> map=new HashMap<Integer,String>();   
		   map.put(1,"One"); 
		   map.put(2,"Two");    
		   map.put(3,"Three");   
		   map.put(4,"Four");   
		       
		   System.out.println();  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}
	
	

}




