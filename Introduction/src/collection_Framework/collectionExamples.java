package collection_Framework;

import java.util.ArrayList;

public class collectionExamples {

	public static void main(String[] args) {
		//Methods of ArrayList
		
		//1. void add()
		//It is used to insert the specified element at the specified position in a list.
		
		ArrayList alist = new ArrayList(); //Same as ArrayList<Object> alist = new ArrayList();
		alist.add("Neha");       //public boolean add (E element)  
		alist.add(Boolean.TRUE);
		alist.add(1, "Ritwik");  //public void add (int index , E element)  
		alist.add(3);
		System.out.println("ArrayList add() first: "+alist);

		//2.public boolean addAll()
		ArrayList alist1 = new ArrayList();
		alist1.add(1);
		alist1.add(2);
		System.out.println("ArrayList add() second: "+alist1);
		System.out.println(alist.addAll(alist1)); //true
		System.out.println("ArrayList addAll(): "+alist);
		
		
		
	}

}
