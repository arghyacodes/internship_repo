public class MethodChaining{
	public static void main(String[] args)
	{
		Head obj = new Head();
		obj.method1();
	}
}
class Head{
	public void method1(){
		System.out.println("Method 1\n");
		method2();
	}

	public void method2(){
		System.out.println("Method 2\n");
		method3();
	}

	public void method3(){
		System.out.println("Method 3\n");
		method4();
	}

	public void method4(){
		System.out.println("Method 4\n");
		methodN();
	}

	public void methodN(){
		System.out.println("Method N");
	}
}