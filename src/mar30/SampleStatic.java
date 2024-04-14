package mar30;

public class SampleStatic {
	//global static variables
static int a,b,c;
public static void mul()
{
	a=5896;
	b=3;
	c=a*b;
	System.out.println(c);
}
public static void sub()
{
	a=8596;
	b=8561;
	c=a-b;
	System.out.println(c);
		
}
	public static void main(String[] args) {
		//call static method with class name or method name
		SampleStatic.mul();
		SampleStatic.sub();

	}

}
