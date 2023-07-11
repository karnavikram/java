package Progrmas;
import java.util.Scanner;
class Demo{
	public void positiveOrNot(int n)
	{
		if(n>0)
		{
			System.out.println(n + " is positive number ");
		}
		else
			System.out.println(n + " is negative number ");
		
	}
}

public class PositiveOrNegative {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Demo d=new Demo();
	d.positiveOrNot(n);

}
}
