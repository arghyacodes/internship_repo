public class Program3 {
    public int method1(int x, int y) //if we dont use obj method below we have to declare it as static
    {
        System.out.println("Method 1 processing...");
        return (x*y);
    }
    public static void main(String[] args)
    {
        Program3 obj = new Program3(); //We dont have to use static keyword in method
        System.out.println(obj.method1(10,5));
    }
}

/*
 * Type of methods-
 * 1> with argument and return value
 * 2> no argument no return value
 * 3> argument but no return value
 * 4> no argument but return value
 */