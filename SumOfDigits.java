package Progrmas;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		digit(a,temp,sum);
	}
	public static void digit(int n,int temp,int sum)
	{
		while(temp>0)
		{
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println(sum);
	}

}
