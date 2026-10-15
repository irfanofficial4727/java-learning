import java.util.Scanner;
public class question4 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        System.out.println("enter the studen name");
       String student_name = scan.nextLine();
        System.out.println("enter the age");
       int age = scan.nextInt();
       scan.nextLine();
        System.out.println("Enter thhe department");
       String department = scan.nextLine();
        System.out.println("enter the email");
       String email = scan.nextLine();
       System.out.println(student_name);
       System.out.println(age);
       System.out.println(department);
       System.out.println(email); 
    }
}
