/*class area
{
	void area(int r)
	{
	System.out.println("area of circle"+(3.14)*(r)*(r));	
	}
	void area(int x,int y)
	{
	System.out.println("area of rectangle"+x*y);
	}
	void area(float x,float y)
	{
	float z=(0.5f)*(x)*(y);
	System.out.println("area of trianglr"+z);
	}
}
class areageo
{
public static void main(String ar[])
{
	area o=new area();
	o.area(3);
	o.area(2,3);
	o.area(2.3f,3.3f);
}
}
*/

//another method with default constructor

class area
{
	 area(int r)
	{
	System.out.println("area of circle"+(3.14)*(r)*(r));
	}
	 area(int x,int y)
	{
	System.out.println("area of rectangle"+x*y);
	}
	area(float x,float y)
	{	
	float z=(0.5f)*(x)*(y);
	System.out.println("area of triangle"+z);
	}
}
class areageo
{
public static void main(String ar[])
{
	area circle=new area(3);
	area rectangle=new area(2,3);
	area triangle=new area(2.3f,3.3f);
}
}