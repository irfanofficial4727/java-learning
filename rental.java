import java.util.Scanner;
class Car{
    String carname;
    String carnumber;
    

    void calculate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter thee number of days");
        double days = scan.nextDouble();
        System.out.println("Enter the rentfee");
        double rentfee = scan.nextDouble();
        double totalammount = days*rentfee;
        System.out.println("DAYS : "+days);
        System.out.println("RENT FEES : "+rentfee);
        System.out.println("TOTAL AMOUNT : "+totalammount);
    }
    class rental{
        public static void main(String[] args){
            Car obj1 = new Car();
            obj1.carname = "BMW";
            obj1.carnumber = "12345";
            obj1.calculate();
            System.out.println("CAR NAME : "+obj1.carname);
            System.out.println("CAR NUMBER :"+obj1.carnumber);
        }
    }

}