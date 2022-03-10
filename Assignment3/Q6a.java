class Q6a
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
		}
	}
}