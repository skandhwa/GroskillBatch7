package MyBasics1;

class A5
{

	void display(int a,int b)
	{
		int r=a+b;
		System.out.println(r);
	}
	
	void sum(int x,int y,int z)
	{
		int p=x+y+z;
		System.out.println(p);
	}
}



public class MethodsEx2 {

	public static void main(String[] args) {
		
		A5 obj=new A5();
		obj.display(12, 20);
		
		obj.sum(13, 14,15);
		

	}

}
