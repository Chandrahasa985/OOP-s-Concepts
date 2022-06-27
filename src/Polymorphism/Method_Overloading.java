package Polymorphism;

class addition{
	void add(int i, int j) {
		int result=i+j;
		System.out.println("Addition of two numbers:" + result);
	}
	int add(int x, int y, int z) {
		int result = x+y+z;
		return result;
	}
}

public class Method_Overloading {

	public static void main(String[] args) {
		
		// Method Overloading also called as Static Polymorphism or Compile Time Polymorphism
		// Rule No.1 :- Method Name Should Be Same.
		// Rule No.2 :- No.Of Parameters Should Not Be Same, If it is Same 
		//              the Parameter Type Should not be Same.
		// Rule No.3 :- The Return type of the method May or May not be Same.
		
		addition a=new addition();
		a.add(1000, 1500);
		System.out.println("Addition of three numbers:" +a.add(1500, 15, 1200));
	}

}
