import java.util.Scanner;
class Vishnu{
    String ebid;
    String name;
    int unit;
    double price;
    


void input(){
    Scanner scan = new Scanner(System.in);
    String ebid = scan.nextLine();
    String name = scan.nextLine();
    int unit = scan.nextInt();
    if(unit<=200){
        double price = 0;
    }
    else if(unit>200 && unit<=500){
        double price = unit*3;
    }
    else{
        double price = unit*5;
    }
    System.out.println(ebid);
    System.out.println(name);
    System.out.println(unit);
    System.out.println("total bill"+price);
}
}
class ganesh{
    String ebbil;
    String name;
    String unit;


void output(){
    Scanner scan = new Scanner(System.in);
    String ebid = scan.nextLine();
    String name = scan.nextLine();
    String unit = scan.nextLine();
    System.out.println(ebid);
    System.out.println(name);
    System.out.println(unit);

}
}
class ebbill{
    public static void main(String[] args) {
        Vishnu obj1 = new Vishnu();
        obj1.input();
        
    }
}

