class TableWhile{
	public static void main(String args[])
	{
		int i=1;
		while(30>=i){
			int j=1;
			while(j<=10){
				System.out.println(i+" x "+j+" = "+i*j);
				j++;
			}
			System.out.println("===================");
				i++;
		}
	}
}