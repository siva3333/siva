class prime
{
public static void main(String ar[])
{
	int i,j,z;
	for(i=0;i<=100;i++)
	{
	z=0;
	  for(j=2;j<i;j++)
	  {
	    if(i%j==0)
	    {
	     z=1;
	    }
	  }
	   if(z==0)
	   {
	     System.out.println(i+"is prime number");
	    }
	}
}
}
	