package MyBasics1;

class A6
{
	
	double sum(int a,float b)
	{
		double x=a+b;
		return x;
		
	}
	
	double sub(int c,int d)
	{
		return c-d;
	}
}


public class MethodEx3 {

	public static void main(String[] args) {
		
		A6 obj=new A6();
	System.out.println(obj.sum(23, 89.76f));	
	
	System.out.println(obj.sub(45, 23));   
		
		
	}

}
