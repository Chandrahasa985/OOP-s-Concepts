package Polymorphism;

class parent{
	void info() {
		System.out.println(" Parent Class Method");
	}
}
class child1 extends parent {
	void info() {
		System.out.println(" Child 1 Class Method");
	}
}
class child2 extends parent{
	void info() {
		System.out.println(" Child 2 Class Method");
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		
		// Method Overriding also called as Dynamic Polymorphism or Run Time Polymorphism
		// Rule No.1 :- We will use Method Overriding concept inside the Inheritance
		//              where there is Parent Class and Child Classes.
		// Rule No.2 :- The Method Name Should be Same both in Parent Class (Super Class) and 
		//              Child Classes (Sub Class).
		// Rule No.3 :- The Return type of the method Should be Same both in Parent
		//              Class (Super Class) and Child Classes (Sub Class).
		// Rule No.4 :- No.Of Parameters Should Be Same 
		//              and the Parameter Type also Should be Same.
		
		parent p1 = new parent();
		p1.info();
		parent p2 = new child1();
		p2.info();
		parent p3 = new child2();
		p3.info();
		
	
	}

}
