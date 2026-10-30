import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the product name");
        String product_name = scan.nextLine();
        System.out.println("Enter the price");
        double price = scan.nextDouble();
        double discount = 0;
        if(price<1000){
            discount =0.00;
             }
        if(price<5000){
            discount =price*0.10;
        }
        else{
            discount = price*0.20;
        }
        double finalprice = price - discount;
        System.out.println("Product name  :"+product_name);
        System.out.println("Original price :"+price);
        System.out.println("Discount amount : "+discount);
        System.out.println("Final price : "+finalprice);

    }
}
