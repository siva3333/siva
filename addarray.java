class addar
{
public static void main(String ar[])
{
	int a[]={1,2,3,4,5};
	int b[]={5,9,1,4,3};
	int c[]=new int[10];
	int i;
	for(i=0;i<a.length;i++)
	{
	  c[i]=a[i]+b[i];
	}
for(i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
}
}