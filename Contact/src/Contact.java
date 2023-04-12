import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Contact {

	String name;
	int phnno;
	
	
	public Contact(String n, int phn) {
		this.name=n;
		this.phnno=phn;
	}
	
	static void display(Contact C){
			
			
			System.out.println(C.name);
			System.out.println(C.phnno);
			System.out.println();
		}

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		ArrayList<Contact> arr = new ArrayList<>();
		
		for(int i=0; i<4; i++){
			int p;
			String s;
			System.out.print("Enter the phoneNumber : ");
			p=sc.nextInt();
			System.out.print("Enter the Name : ");
			s=sc.next();
			Contact c1 = new Contact(s,p);
			arr.add(c1);
		}
		

		 for(Contact c: arr ) 
		   {    
		     display(c);
		   }
		
		
		ArrayList<Contact> marr = new ArrayList<>();
		
		for(int i=0; i<3; i++){
			int p;
			System.out.print("Enter the phoneNumber : ");
			p=sc.nextInt();
			Iterator<Contact> it1  = arr.iterator();
			boolean flag=false;
			String missedName="";
			while (it1.hasNext()) {
		            Contact c = it1.next();

		            if (c.phnno == p) {
		                flag=true;
		                missedName=c.name;
		                break;
		            }
		        }
			if(flag){
				Contact c1 = new Contact(missedName,p);
				marr.add(c1);
			}
			else {
				Contact c1 = new Contact("Private Caller",p);
				marr.add(c1);
			}
		}
		
		int p;
		System.out.print("Enter the phoneNumber : ");
		p=sc.nextInt();
		Iterator<Contact> it1  = arr.iterator();
		boolean flag=false;
		String missedName="";
		while (it1.hasNext()) {
	            Contact c = it1.next();

	            if (c.phnno == p) {
	                flag=true;
	                missedName=c.name;
	                break;
	            }
	        }
		if(flag){
			System.out.print("found the number");
			System.out.print(missedName);
		}
		else {
			System.out.print("Cound not find the number");
		}
		
		
		
		
		
		
		
		
		
		
		for(Contact c: marr ) 
		   {    
		     display(c);
		   }
		
		System.out.print("Enter the contact to delete : ");
		int delNum = sc.nextInt();
		
		
		Iterator<Contact> it  = arr.iterator();
		 while (it.hasNext()) {
	            Contact c = it.next();

	            if (c.phnno == delNum) {
	                arr.remove(c);
	                break;
	            }
	        }
		 
		 for(Contact c: arr ) 
		   {    
		     display(c);
		   }
		

	}

}
