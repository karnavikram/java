package Progrmas;
public class Demo1{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setAge(int n)
	{
		this.age=n;
	}
}

class Encap {
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.setName("vikram");d1.setAge(23);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
	}

}
