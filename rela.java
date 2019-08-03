import java.util.Scanner;
class s
{
	public static void main(String ar[])
	{
	  boolean c;
           Scanner input=new Scanner(System.in);
          int a=input.nextInt();
          int b=input.nextInt();
	  c=a>b;
	  System.out.println("10 is gretaet than 20   "+c);
	  c=a<b;
          System.out.println("10 is less than 20    "+c);
          c=(a!=b);
          System.out.println("10 is not equalto 20   "+c);
	  c=(a==b);
	System.out.println("10 is equal to 20   "+c);
	}
}