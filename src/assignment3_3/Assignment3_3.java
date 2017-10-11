/*Create a program to demonstrate Constructor Chaining. Between the same class
and between the child and parent class.*/

package assignment3_3;//package name

class ConstructorChaining{//class to demo constructor chaining
	
	public ConstructorChaining(){//default constructor
		System.out.println("this is default constructor");
	}
	
	public ConstructorChaining(int i){//single argument constructor
		this();//calling default constructor using this keyword
		System.out.println("this is second constructor");
	}
	public ConstructorChaining(int i,int j){//third constructor
		this(i);//calling single argument constructor using this keyword 
		System.out.println("this is third constructor");
	}
	
}



public class Assignment3_3 {//main method class
	
	public static void main(String args[]){//main method
		@SuppressWarnings("unused")//suppress warnings
		ConstructorChaining cc1=new ConstructorChaining(10, 20);//instantiating third constructor
	}
	
	

}
