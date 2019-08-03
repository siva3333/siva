class p1
{
public static void main(String ar[])
{
	int a=2,b=3,r;
	r=a%b;
	while(r!=0)
	{
	  a=b;
	b=r;
	r=a%b;
	}
	if(r==1)
	{
	System.out.print("give are coprimes");
	}
}
}
