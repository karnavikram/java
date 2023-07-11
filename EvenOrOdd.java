package Progrmas;
import java.util.*;
class Demo1{
	public void evenOrOdd(int n)
	{
		if(n%2==0)
		{
			System.out.println(n + " is even number");
		}
		else
			System.out.println("n + is odd number");
	}
}

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Demo1 d=new Demo1();
		d.evenOrOdd(n);
		
	}

}
