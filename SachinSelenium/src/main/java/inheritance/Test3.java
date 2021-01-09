package inheritance;

public class Test3 extends Test2
{
	int a=500;
	public void m()
	{
		int a=1000;
		System.out.println("M method");
		
		System.out.println(super.a);
		System.out.println();
		
		System.out.println(this.a);
		System.out.println();
		
		System.out.println(a);
	}

	
}
