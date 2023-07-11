package Progrmas;
import java.util.*;
public class SumOfnNatural {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		for(int i=0;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of n natural numbers is "+ sum);
		
	}


}
