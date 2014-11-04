package myGitSandbox;

public class MyGitSandbox 
{

	static Integer MAX = Integer.MAX_VALUE;
	static Integer MIN = Integer.MIN_VALUE;
	static String stuff = "stuff";
	public static void main(String[] args)
	{
		System.out.println("Hello, OLE team!");
		printMax();
		printMin();
		printString(stuff);
	}
	public static void printMax()
	{
		System.out.println(MAX);
	}
	public static void printMin()
	{
		System.out.println(MIN);
		
	}
	public static void printString(String s)
	{
		System.out.println(s);
	}

}
