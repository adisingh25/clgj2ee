package arko_friends;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class af {



		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			ArrayList<Integer> af=new ArrayList<>();
			System.out.println("enter no of elements");
			int n=sc.nextInt();
			int ele;
			for(int i=0;i<n;i++){
				ele=sc.nextInt();
				af.add(ele);
			}
			
			System.out.println(af);
			System.out.println("itreation through list gives ");
			Iterator itr =af.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			System.out.println("enter index of element that is to be removed");
			int del =sc.nextInt();
			af.remove(del);
			System.out.println(af);
			System.out.println("enter the element to find its index");
			int i=sc.nextInt();
			i=af.indexOf(i)+1;
			System.out.println("index of element is "+i);
			System.out.println("size of array list");
			System.out.println(af.size());
			ArrayList<Integer> af2=new ArrayList<>();
			af2=(ArrayList)af.clone();
			System.out.println("the cloned list is :");
			System.out.println(af2);
			Collections.sort(af2);
			System.out.println("the sorted list is :");
			System.out.println(af2);
		}

	}


