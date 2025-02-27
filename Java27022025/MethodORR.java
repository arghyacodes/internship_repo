class Parent{
	public void getInfo()
	{
		System.out.println("Get info from Parent");
	}
}
class Child extends Parent
{
	public void getInfo()
	{
		System.out.println("Get info from Child");
	}
}

public class MethodORR{
	public static void main (String[] args)
	{
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		
		obj1.getInfo();
		obj2.getInfo();
	}
}