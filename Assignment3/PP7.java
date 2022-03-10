class PP7
{
	public static void main(String args[])
	{
		for(int i=9;i>=0;i--)
		{
			for(int j=9-i;j>=1;j--)
			{
			
				System.out.print(" ");
			}
			
			for(int k=0;k<=(i-1);k++)
			{
			
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
}