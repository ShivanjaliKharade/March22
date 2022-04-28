class GCD{
	static String GCD(int n)
{
    // base case
    if (n == 1)
        return "int";
	
		return  "gcd(int, " +GCD(n - 1)+ ")";
}
	public static void main(String [] arg){
		int n = 5;
    System.out.println(GCD(n));
	}
}
