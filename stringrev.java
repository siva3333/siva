import java.util.*;
class stringrev
{
public static void main(String ar[])
{
	Scanner o=new Scanner(System.in);
	String s1=o.nextLine();
	int i,j=0;
	char b[]=new char[20];
	for(i=s1.length()-1;i>=0;i--)
	{
	    b[j]=s1.charAt(i);
	    j++;
	}
	String s2=new String(b);
	System.out.print(s2);
}
}