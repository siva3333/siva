import java.util.*;
class cla
{
 /*
	int n;
	void display()
	{
		System.out.print(n);
	}
	void read()
	{
		 System.out.print("enter the number");
 		Scanner o=new Scanner(System.in);
 		n=o.nextInt();
	}
	public static void main(String ar[])
	{
 		cla o=new cla();
 		o.read();
 		o.display();
 		o.n=50;
 		o.display();
	}
*/
int eid;
String name=new String();
int salary;
	void display()
	{
   		System.out.print(name);
   		System.out.print(eid);
   		System.out.print(salary);
	}
	void read()
	{
		Scanner o=new Scanner(System.in);
		System.out.print("enter name & id & salary");
		name=o.next();
		eid=o.nextInt();
		salary=o.nextInt();
	}
	public static void main(String ar[])
	{
		cla o=new cla();
		o.read();
		o.display();
	}
}

