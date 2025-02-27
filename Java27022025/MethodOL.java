public class MethodOL{
	public void add(int a, int b) {
		System.out.println("\nInt add "+a+b);
	}
	public void add(char a, char b) {
		System.out.println("\nString add "+a+b);
	}
	public void add(double a, double b) {
		System.out.println("\nFloat add "+a+b);
	}
	
	public static void main(String[] args) {
		MethodOL obj = new MethodOL();
		
		obj.add(10, 5);
		obj.add('a','b');
		obj.add(3.35, 2.25);
	}
}
