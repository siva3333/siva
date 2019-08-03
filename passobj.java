class passobj
{
int a,b;
	passobj()
	{	
 	a=10;
	b=20;
	}
	void display()
	{
	System.out.print(a+" "+b);
	}
	public static void main(String ar[])
	{
	 int a=5,b=30;
	System.out.print(a+" "+b);
	passobj o=new passobj();
	o.display();
	System.out.print(a+" "+b);
	}
}