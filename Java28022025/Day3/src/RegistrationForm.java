import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

interface Name{
    void setName(String name);
}
interface Email{
    void setEmail(String email);
}
interface Password{
    void setPassword(String password);
}
interface Mobile{
    void setMobile(String mobile);
}
interface Address{
    void setAddress(String address);
}
interface Validate{
    boolean validate(String str, String pattern);
}

class NewUser implements Name, Email, Password, Mobile, Address, Validate{
    private String name;
    private String email;
    private String password;
    private String mobile;
    private String address;
    
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public boolean validate(String str, String pattern){
        Pattern p = Pattern.compile(this.password);
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public void display(String str){
        if(validate(String str, String pattern)){
            System.out.println("Name: "+name);
            System.out.println("Email: "+email);
            System.out.println("Password: "+password);
            System.out.println("Mobile: "+mobile);
            System.out.println("Address: "+address);
        }
        else{
            System.out.println("Wrong Password, Try Again!");
        }
    }
}

public class RegistrationForm{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for New User Registration, 2 to Display User Details:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Enter Name:");
                String name = scanner.nextLine();
                System.out.println("Enter Email:");
                String email = scanner.nextLine();
                System.out.println("Enter Password:");
                String password = scanner.nextLine();
                System.out.println("Enter Mobile:");
                String mobile = scanner.nextLine();
                System.out.println("Enter Address:");
                String address = scanner.nextLine();

                NewUser user = new NewUser();
                user.setName(name);
                user.setEmail(email);
                user.setPassword(password);
                user.setMobile(mobile);
                user.setAddress(address);
                break;

            case 2:
                System.out.println("Enter Password to Display Details:");
                String inputPassword = scanner.nextLine();
                user.display(inputPassword);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        // NewUser user = new NewUser();
        // user.setName("Oimayak Panja");
        // user.setEmail("aim2022@gmail.com");
        // user.setPassword("Aim@2022");
        // user.setMobile("9876543210");
        // user.setAddress("Kolkata");



        // if(){
        //     user.display();
        // }
        // else{
        //     System.out.println("Wrong Password, Try Again!");
        // }
    }
}