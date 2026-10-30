import java.util.Scanner;
class book{
    int bookid;
    String bookname;
    String author;
    double price;

    void details(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the book name : ");
        String name = scan.nextLine();
        System.out.println("Enter the Book ID");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Author");
        String auname = scan.nextLine();
        System.out.println("BOOK NAME :"+name);
        System.out.println("BOOK ID :"+id);
        System.out.println("AUTHOR NAME :"+auname);
    }
    void calculate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price");
        double price = scan.nextDouble();
        System.out.println("enter the totalbook");
        int totalbook = scan.nextInt();
        double totalamount = totalbook*price;
        System.out.println("TOTAL BOOK :"+totalbook);
        System.out.println("PRICE :"+price);
        System.out.println("TOTAL AMOUNT"+totalamount);


    }

}
class multiple{
    public static void main(String[] args){
        book obj1 = new book();
        obj1.details();
        obj1.calculate();

    }
}
