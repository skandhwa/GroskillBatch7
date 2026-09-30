package MyBasics1;

class A31
{
	int len;
	int brd;
	double width;
	
	A31(int l,int b)
	{
		len=l;
		brd=b;
	}
	
	A31(int b,double w)
	{
		len=b;
		width=w;
		
	}
	
	A31(double w,int l,int b)
	{
		len=l;
		brd=b;
		width=w;
	}
	
	void display()
	{
		System.out.println(len +"  "+brd+"  "+width);
	}
	
	
	
	
	
}

public class ParameterizedConstructorEx2 {

	public static void main(String[] args) {
		
		A31 obj=new A31(23,45);
		obj.display();
		
		A31 obj1=new A31(890000,67,65);
		obj1.display();
		
		A31 obj2=new A31(67,90656.67);
		obj2.display();
		
		
		
		
		
		

	}

}
