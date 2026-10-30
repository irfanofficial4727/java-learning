import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int unit = scan.nextInt();
        double bill;
        if(unit>100){
            bill  = unit*2;

        }
        else if(unit>100 && unit <= 200){
            bill = 100*2+(unit-100)*3;
        }
        else{
            bill = 100*2+100*3+(unit-200)*5;
          }
          System.out.println("name : "+name);
          System.out.println("Unit consumed : "+unit);
          System.out.println("total bill : "+bill);

    }
}