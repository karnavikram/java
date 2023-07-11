package Progrmas;
import java.util.*;
public class ArmstrongProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		String p=Integer.toString(a);
		if(a==0) {
			System.out.println("Armstrong");
		}
		while(temp>0)
		{
			int digit=temp%10;
			sum+=(int)(Math.pow(digit,p.length()));
			temp=temp/10;
		}
		if(a==sum)
		{
			System.out.println(a+" is a armstrong number");
		}
		else
		{
			System.out.println(a+" is not a armstrong number");
		}
		
	}

}
