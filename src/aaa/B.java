package aaa;


class BB extends AA {
	void info() {
		System.out.println(" Child 1 Class Method");
	}
}
public class B {
	public static void main(String args[]) {
		AA p1 = new CC();
		p1.info();
	}

}
