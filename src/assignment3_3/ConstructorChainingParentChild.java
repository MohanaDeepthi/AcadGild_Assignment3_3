package assignment3_3;//package name

class Parent{//Parent class
	public Parent(){//Parent class default constructor
		System.out.println("default parent");
	}
	
	public Parent(int i){//Parent class single argument constructor
		this();//calling parent class constructor
		System.out.println("Parent single argument constructor");
	}
}

class Child extends Parent{//child class extending parent class
	public Child(){//child class default constructor
		this(10);//calling child class single argument constructor
		System.out.println("child class default constructor");
	}
	
	public Child(int j){//child class single argument constructor
		super(j);//calling parent class single argument constructor
		System.out.println("Child class single argument constructor");
	}
}

public class ConstructorChainingParentChild {///Demo class main method
	@SuppressWarnings("unused")//suppress warnings
	public static void main(String args[]){//main method
		
		Child c1 = new Child();//instantiating child class object
	}
	


}
