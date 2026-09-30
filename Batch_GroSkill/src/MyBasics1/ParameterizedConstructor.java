package MyBasics1;

class A2
{
	int id;
	String name;
	double salary;
	
	A2(int i,String n)
	{
		id=i;
		name=n;
	}
	
	A2(int j,String m,double s)
	{
		id=j;
		name=m;
		salary=s;
	}
	
	A2(int k,double g)
	{
		id=k;
		salary=g;
	}
	
	void display()
	{
		System.out.println(id+"  "+name+"  "+salary);
	}
	
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		A2 obj=new A2(1234,"Hello");
		obj.display();
		
		
		A2 obj1=new A2(5678,"Hi",900000);
		obj1.display();
		
		A2 obj2=new A2(9876,896666);
		obj2.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
