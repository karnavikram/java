package Progrmas;
public class RangeOfPrime {
	public static void main(String[] args) {
		int a=1;
		int b=100;
		for(int i=a;i<=b;i++)
			if (isPrime(i))
				System.out.print(i+" ");
	}

	static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<n;i++)
			if(n%i==0)
			{
				return false;
			}
		return true;

}
}