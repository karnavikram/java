package Progrmas;
import java.util.*;
public class GreatestOfThree {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	Greater(a,b,c);

}
static void Greater(int a,int b,int c)
{
	if(a>b && a>c)
	{
		System.out.println("a is greater which is " +a);
	}
	else if (b>a && b>c)
	{
		System.out.println("b is greater which is " +b);
	}
	else
		System.out.println("c is greater which is " +c);
	
}
}
