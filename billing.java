import java.util.Scanner;
class product{
    String productid;
    String productname;
    double price;
    double quantity;

    void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price");
        double price = scan.nextDouble();
        System.out.println("Enter the Quantity");
        int quantity = scan.nextInt();
        double totalprice = price*quantity;
        System.out.println("TOTAL AMOUNT"+totalprice);
    }
}
class billing{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        product obj1 = new product();
        System.out.println("Enter the product id");
        obj1.productid = scan.nextLine();
        System.out.println("Enter the product name");
        obj1.productname = scan.nextLine();
        System.out.println("PRODUCT NAME : "+obj1.productname);
        System.out.println("PRODUCT ID :"+obj1.productid);
        obj1.main();
        
    }
}
