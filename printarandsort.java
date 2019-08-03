class sortarr
{
public static void main(String ar[])
{
	int a[]={10,20,5,6,19,30};
	int i,min,j,s,t;
	for(int z:a)
	{
	  System.out.println(z);
	}
	for(i=0;i<a.length;i++)
	{
	min=1000000;
	s=0;
	  for(j=i;j<a.length;j++)
	  {
	     if(a[j]<min)
	     {
		min=a[j];
		s=j;
	     }
	   }
	  t=a[i];
	  a[i]=a[s];
	  a[s]=t;  	
	}
	System.out.print("sorted array is");
	for(int z:a)
	{
	   System.out.println(z);
	}
}
}