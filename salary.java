import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Employee_id = scan.nextLine();
        String name = scan.nextLine();
        scan.nextLine();
        int Basic_salary = scan.nextInt();
        double HRA = Basic_salary*0.20;
        double DA = Basic_salary*0.10;
        double PF = Basic_salary*0.12;
        double gs = Basic_salary+HRA+DA;
        double ns = gs-PF;
        System.out.println("Employee id : "+Employee_id);
        System.out.println("Employee name : "+name);
        System.out.println("Basic salary : "+Basic_salary);
        System.out.println("HRA : "+HRA);
        System.out.println("DA : "+DA);
        System.out.println("PF :"+PF);
        System.out.println("Gross salary : "+gs);
        System.out.println("Net Salary : "+ns);
    }
}
