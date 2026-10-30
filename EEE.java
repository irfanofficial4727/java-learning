import java.util.Scanner;
class ece{
    static String collegename = "Dhanalakshmi srinivasan";
    static String place ="perambalur";
    String name;
    String regno;
    String depart;
    double payment;
    double total=0;

    void studentdetails(){
        System.out.println(collegename);
        System.out.println(place);
        Scanner scan = new Scanner(System.in);
            System.out.println("Name");
             name = scan.nextLine();
            System.out.println("reg no");
             regno = scan.nextLine();
            System.out.println("depart");
             depart = scan.nextLine();

    }
    void payment(){
        Scanner scan = new Scanner(System.in);
        if(depart.equals("ECE")){
        System.out.println("payment");
         payment= scan.nextDouble();
        double gst = 20.0;
         total = payment+gst;
        }
        else{
            System.out.println("choose the correct department");
        }
    }
    void output(){
        System.out.println();
        System.out.println("name"+name);
        System.out.println("reg no"+regno);
        System.out.println("depart"+depart);
        System.out.println("payment"+payment);
        System.out.println("TOTAL "+total);
    }
}
class EEE{
    public static void main(String[] args){
        ece obj1 = new ece();
        obj1.studentdetails();
        obj1.payment();
        obj1.output();
    }
}

