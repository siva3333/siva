import java.util.*;
class conprimitive
{
public static void main(String ar[])
{
//object to primitive
 int ob=new Integer(10);//auto boxing
 int b=ob;
System.out.println(b);
System.out.println(ob);
//primitive to object
 int a=20;
  int ob1=Integer.valueOf(a);
System.out.println(a);
System.out.println(ob1);
//new update from jdk5
Integer ob2=a;
System.out.print(ob2);
}
}