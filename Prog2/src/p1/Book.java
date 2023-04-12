package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Book {
	
	String name;
	String author;
	String publisher;
	double price;
	
	public Book(String n, String a, String pub, double p) {
		this.name = n;
		this.author =a;
		this.publisher=pub;
		this.price=p;
	}
	
	static void display(Book B){
		
		
		System.out.println(B.name);
		System.out.println(B.author);
		System.out.println(B.publisher);
		System.out.println(B.price);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java", "Ananjay", "Arihant", 100.34);
		Book b2 = new Book("C++", "Arya", "Arihant", 90.34);
		Book b3 = new Book("Python", "Aman", "GYAN", 120.34);
		Book b4 = new Book("C", "Amritanshu", "Arihant", 10.34);
		Book b5 = new Book("Ruby", "Aman", "GYAN", 135.34);
		
		
		
		ArrayList<Book> l1 = new ArrayList<>();
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b5);
		
		for(Book b: l1 ){    
		     display(b);
		  }
		
		Collections.sort(l1, (a1, a2) -> {
			return (int)a1.price - (int)a2.price;
		});
		System.out.println("\n\n");
		
	
		 for(Book b: l1 ) 
		   {    
		     display(b);
		   }
		 
		 
		 HashMap<Integer,Book> map=new HashMap<Integer,Book>();   
		   map.put(1,b1); 
		   map.put(2,b2);    
		   map.put(3,b3);   
		   map.put(4,b4);   
		   map.put(5, b5);
		       
		   System.out.println();   
		   map.forEach((k,v) -> {
			   System.out.print("Key = " + k + ", Value = " );
			   display(v);
			   System.out.println();
		   });

		   
		 Scanner sc = new Scanner(System.in);
		 double entered_price = 0;
			System.out.print("Enter the price range : ");
			entered_price = sc.nextDouble();
			ArrayList<Book> l2 = new ArrayList<>();
			
			for(Book b : l1){
				if (b.price > entered_price) {
					l2.add(b);
				}
			}
			
			 for(Book b: l2 ) 
			   {    
			     display(b);
			   }
			
		   
			
			String author_name="";
			System.out.print("Enter the name of the Author : ");
			author_name = sc.next();

			for(Book b : l1){
				if (b.author.equals(author_name)) {
					display(b);
				}
			}

			
			System.out.println();
			String keyword="";
			System.out.print("Enter the keyword : ");
			keyword = sc.next();
			for(Book b : l1){
				if (b.name.indexOf(keyword)!= -1) {
					display(b);
				}
			}
			
			System.out.println();
			String publisher_name="";
			System.out.print("Enter the name of the publisher : ");
			publisher_name = sc.next();
			for(Book b : l1){
				if (b.publisher.equals(publisher_name)) {
					display(b);
				}
			}
			
			System.out.println();
			System.out.print("Enter the name of the publisher : ");
			publisher_name = sc.next();
			for(Book b : l1){
				if (b.publisher.equals(publisher_name)) {
					b.publisher = "NEW HORIZON";
				}
			}
			
	
			 for(Book b: l1 ) 
			   {    
			     display(b);
			   }
		 
	}

}
