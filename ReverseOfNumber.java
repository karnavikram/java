package Progrmas;
import java.util.*;
public class ReverseOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int rev=0;
		reverse(a,temp,rev);
	}
	public static void reverse(int n,int temp,int rev)
	{
		while(n>0)
		{
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
			
		}
		System.out.println("reverse of a number is "+rev );
	}

}
