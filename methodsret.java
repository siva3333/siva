import java.util.*;
class method
{
	int a;
	void t1(int x)
	{
	  a=x;
	 System.out.print(a);
	}
	int t2(int x)
	{
		a=x;
		return a;
	}
	int t3()
	{
	  a=50;
	 return a;
	}
	public static void main(String ar[])
	{
	   method o=new method();
	   o.t1(20);
	  int c=30;
	  System.out.print(o.t2(c));
	  System.out.print(o.t3());
	}
}