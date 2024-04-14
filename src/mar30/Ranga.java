package mar30;

public class Ranga {
public static void addition(int a, int b)
{
	int c=a+b;
	System.out.println(c);
}
public static String verify_String(String str1, String str2)
{
	String res;
	if(str1.equalsIgnoreCase(str2))
	{
		res= "Both Strings are equal";
	}
	else
	{
		res= "Both Strings are not equal";
	}
	return res;
}
public static boolean compare_Values(int x, int y)
{
	if(x==y)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		// call the method
		Ranga.addition(1258, 5842);
	String a =Ranga.verify_String("hello", "sleep");
	System.out.println(a);
	boolean x =	Ranga.compare_Values(100, 100);
	System.out.println(x);
		

	}

}
