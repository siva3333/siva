import java.util.*;
class strtokenizer
{
public static void main(String ar[])
{
	String str="siva ,prasad,reddy garlapati,venkat,sai,reddy";
	StringTokenizer o=new StringTokenizer(str,",");
	System.out.println(o.hasMoreTokens());
	System.out.println(o.countTokens());
	System.out.println(o.nextToken());
	System.out.println(o.nextToken());
	System.out.println(o.countTokens());
	System.out.println(o.nextElement());
}
}	