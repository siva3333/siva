import java.util.*;
class strbuffer
{
public static void main(String ar[])
{
	String str="siva prasad reddy";
	StringBuffer o=new StringBuffer(str);
	System.out.println(o.capacity());
	System.out.println(o.append("garlapati"));
	System.out.println(o.insert(1,"sai"));
	System.out.println(o.replace(1,4,"zzz"));
	System.out.println(o.delete(1,4));
	System.out.println(o.reverse());
	System.out.println(o.substring(4));
}
