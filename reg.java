import java.util.Scanner;
class Student{
    String name;
    String regno;
    String exam;
    String  department;
    String busno;
}
public class reg{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student obj1 = new Student();
        obj1.name = scan.nextLine();
        obj1.regno = scan.nextLine();
        obj1.exam = scan.nextLine();
        obj1.department = scan.nextLine();
        obj1.busno = scan.nextLine();
        System.out.println("NAME : "+obj1.name);
        System.err.println("REG NO :"+obj1.regno);
        System.out.println("EXAM : "+obj1.exam);
        System.out.println("DEPARTMENT : "+obj1.department);
        System.out.println("BUS NO : "+obj1.busno);



    }


}