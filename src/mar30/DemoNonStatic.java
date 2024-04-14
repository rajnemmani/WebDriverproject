package mar30;

public class DemoNonStatic {
int x,y,z;
public void add()
{
	x=8569;
	y=89;
	z=x+y;
	System.out.println(z);
}
public void division()
{
	x=9870;
	y=158;
	z=x/y;
	System.out.println(z);
}
	public static void main(String[] args) {
		// Create Reference object to call non static methods
		DemoNonStatic a = new DemoNonStatic();
		a.add();
		a.division();

	}

}
