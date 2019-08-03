import java.util.*;
class index
{
public static void main(String ar[])
{
	Scanner o=new Scanner(System.in);
	String a=o.nextLine();
	int i=a.indexOf(".");
	int l=a.length();
	int r=l-i-1;
	System.out.println("no.of digits before . "+i);
	System.out.println("no.of digits after .  "+r);
}
}