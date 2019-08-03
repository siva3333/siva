7class mul
{
public static void main(String ar[])
{
	int r=2,co=2;
	int a[][]={{1,2},{4,5}};
	int b[][]={{5,1},{3,4}};
	int c[][]=new int[r][co];
	int i,j,k;
	for(i=0;i<r;i++)
	{
	   for(j=0;j<co;j++)
	    {
		c[i][j]=0;
    		 for(k=0;k<co;k++)
	        {
 			c[i][j]+=a[i][k]*b[k][j];
	        }
		
	    }
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<co;j++)
		{
		    System.out.print(c[i][j]+"   ");
		}
		System.out.println();
	}
}
}