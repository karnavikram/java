package Progrmas;
import java.util.*;
public class PalinDrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a,rev=0;
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(a==rev)
		{
			System.out.println(a+" is palin ");
		}
		else
			System.out.println(a+" is not palin");
	}

}
