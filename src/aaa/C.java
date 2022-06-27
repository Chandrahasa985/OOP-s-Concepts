package aaa;


class CC extends AA{
	void info() {
		System.out.println(" Child 2 Class Method");
	}
}

public class C {
	public static void main(String args[]) {
		AA P3 = new BB();
		P3.info();
	}

}
