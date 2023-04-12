package p1;

import java.io.InputStream;
import java.util.Scanner;

class Demo extends Thread {
	static void help(char s) {
		if(s=='0') System.out.println("Zero");
		if(s=='1') System.out.println("One");
		if(s=='2') System.out.println("Two");
		if(s=='3') System.out.println("Three");
		if(s=='4') System.out.println("Four");
		if(s=='5') System.out.println("Five");
		if(s=='6') System.out.println("Six");
		if(s=='7') System.out.println("Seven");
		if(s=='8') System.out.println("Eight");
		if(s=='9') System.out.println("Nine");
	}
	Demo() {
		 Scanner sc = new Scanner(System.in);
		try {
			String num;
			System.out.println("Enter a number of 4 digits : ");
			num = sc.next();
			if(num.length()==4){
				for(int i=0; i<4;  i++) {
					help(num.charAt(i));
				}
			}
			else {
				 throw new ArithmeticException("Number has less than 4 digits.");  
			}
		}
		catch(Exception e) {
			System.out.println("Caught Exception : " + e.getMessage());
		}
	}
}

class Demo2 extends Thread {

	Demo2 () {
	int count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the word : ");
	String word = sc.next();
	
	
	for(int i=0; i<word.length(); i++){
		if(word.charAt(i)=='a'|| word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
			count++;
		}
	}
	System.out.println("The number of vowels are : " + count);
	
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo2 d2 = new Demo2();
		d2.start();
		d1.start();
		
	}

}
