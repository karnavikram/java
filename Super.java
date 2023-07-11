package Progrmas;
class Animal{
	String color="white";
}
class Dog extends Animal{
	String color="black";
	void color() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Super {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.color();
	}

}
