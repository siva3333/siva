class rec
{
	int l,b;
	public int area()
	{
		return l*b;
	}
	public int perimeter()
	{
	return 2*(l+b);
	}
}
class rectangle
{
public static void main(String ar[])
{
	rec a=new rec();
	a.l=10;
	a.b=20;
	System.out.println("area is "+a.area());
	System.out.print("perimeter is "+a.perimeter());
}
}