class Q10
{
	public static void main(String args[])
	{ 
	int A=65;
		for(int i= 4;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++)
			{
				System.out.print((char) (A + k) + " ");
			}
				System.out.println();
		}
	}
}