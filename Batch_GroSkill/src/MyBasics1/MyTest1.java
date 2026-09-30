package MyBasics1;

class A
{
	int p=20; //// Instance variable or global variable
	void test()
	{
		int x=10;///local variable
		int r=p+x;
		System.out.println("Hi");
	}
	
	void display()
	{
		int y=20;
		int z=x+y+p;
	}
	
	
}




public class MyTest1 {

	public static void main(String[] args) {
		
		
		A obj=new A();
		obj.test();
		
		
	}

}
