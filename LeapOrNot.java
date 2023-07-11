package Progrmas;
import java.util.*;
public class LeapOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		leap(year);
	}
	static void leap(int n)
	{
		if (n%4==0)
		{
			System.out.println(n + " is a leap year... ");
		}
		else
			System.out.println(n + " is not leap year... ");
	

}
}
