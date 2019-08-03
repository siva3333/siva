import java.util.*;
class strcr
{
public static void main(String ar[])
{
	String s1="Hai";
	String s7="hai";
	String s2= new String();
	s2="hello";
	String s3=new String("siva prasad");
	char str[]={'h','a','i'};
	String s4=new String(str);
	Scanner ob=new Scanner(System.in);
	String s5;
	s5=ob.nextLine();
	System.out.print(s1+s2+s3+s4+s5);
	System.out.println(s1.compareTo(s7));
	System.out.println(s1.equals(s4));
	System.out.println(s1.compareToIgnoreCase(s4));
	System.out.println(s1.equalsIgnoreCase(s4));
	System.out.println(s1.charAt(1));
	System.out.println(s1.hashCode());
	System.out.println(s1.substring(0,1));
	System.out.println(s1.length());
	System.out.println(s1.startsWith("s"));
	String r=s1.replace("a","b");
	System.out.println(r);
	String j=s3.replaceFirst("a","b");
	System.out.println(j);
	System.out.println(s1.concat(s3));
	System.out.println(s1.contains("i"));
	System.out.println(s1.indexOf("i"));
	System.out.println(s1.toUpperCase());
}
}