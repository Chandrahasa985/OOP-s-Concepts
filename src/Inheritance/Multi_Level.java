package Inheritance;

class Calc
{
	public int add(int i, int j)
{
	return i+j;
}
	
}
class Calcadv extends Calc
{
	public int add(int i, int j, int k)
	{
		return i+j+k;
	}
	public int sub(int i, int j)
{
	return i-j;
	
	
}
	
}
class Calcpro extends Calcadv
{
	public int multi(int i, int j)
{
	return i*j;
}
	
}

public class Multi_Level {

	public static void main(String[] args) {
		
		
		Calcpro C1 = new Calcpro();
		int result1 = C1.add(5, 4, 7);
		int result2 = C1.sub(5, 4);
		int result3 = C1.multi(5, 4);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
