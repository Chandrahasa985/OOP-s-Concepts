package Abstraction;

abstract class sum {
	abstract void sum1(int i, int j);
	void sum2(int k, int l) {
		System.out.println(k+l);
	}
}
class addition extends sum{
	void sum1(int i, int j) {
		System.out.println(i+j);
	}
}

public class Abstract {

	public static void main(String[] args) {
		

	addition S = new addition();
		S.sum1(3, 3);
		S.sum2(2, 2);
	}

}
