class Q13
{
	public static void main(String args[])
	{ 
	int A=65;
		for(int i= 0;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print((char) (A + i) + " ");
			}
				System.out.println();
		}
	}
}