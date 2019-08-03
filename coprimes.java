class p
{
public static void main(String ar[])
{
	int a=2,b=7,i,gcd=0;
	for(i=0;(i<=a && i<=b);i++)
	{
	if((a % i == 0) && (b % i == 0))
	{
	   gcd=i;
	}
	}
	if(gcd==1)
	{
	System.out.print(a+","+b+"are co primes");
	}
}
}	