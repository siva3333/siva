import java.util.*;
class factrec
{
int fact(int f)
{
	if(f==0)
	{
		return 1;
	}
	else
	{
	return(f*fact(f-1));
	}
}

public static void main(String ar[])
{
int f;
Scanner o=new Scanner(System.in);
int i=o.nextInt();
factrec s=new factrec();
f=s.fact(i);
System.out.print(f);
}
}
