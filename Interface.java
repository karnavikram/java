package Progrmas;
interface A
{
	int a=20;
	String name="vikram";
	void show();
	void config();
	
}
class B implements A{
	public void show() {
		System.out.println("its showing.....");
	}
	public void config()
	{
		System.out.println("its cofigure....");
	}
}
public class Interface {
	public static void main(String[] args) {
		A obj;
		obj=new B();
		obj.show();
		obj.config();
		System.out.println(A.name);
		System.out.println(A.a);
	}

}
