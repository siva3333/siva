import java.util.*;
import java.lang.Math;
class random
{
public static void main(String ar[])
{
Scanner c=new Scanner(System.in);
Random o=new Random();
Random o1=new Random(50);
Random o2=new Random(50);
int i=o.nextInt();
int i3=o1.nextInt();
int i4=o2.nextInt();
int i2=o.nextInt(9);
System.out.print("enter the min and max limit");
int min=c.nextInt();
int max=c.nextInt();
double x=(Math.random()*(max-min))+min;
System.out.println(x);
double d=o.nextDouble();
float f=o.nextFloat();
double s=Math.random();
System.out.println(i+" "+i2+" "+d+" "+f+" "+s);
System.out.println(i3+" "+i4);
}
}