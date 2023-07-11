package Progrmas;
import java.util.Scanner;

public class SumOfGivenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s=0;
		int res=sum(a, b, s);
		System.out.println("the sum of numbers in a given range is " +res);
	}
	public static int   sum(int a,int b,int s)
	{
		for(int i=a;i<=b;i++)
		{
			s=s+i;
		}
		return s;
	}
}



