import java.util.Scanner;
    class test{
        public static void main(String[]args){
        Scanner src=new Scanner (System.in);
        System.out.println("Enter the no of passsenger:");
        int n=src.nextInt();
        src.nextLine();
        String[]name=new String[n];
        String[]age=new String[n];
        String[]gender=new String[n];
        String[]mobile=new String[n];
        String[]email=new String[n];
        String[]date=new String[n];
        String[]boarding_Point=new String[n];
        String[]destination=new String[n];
        String[]bus_no=new String[n];

        for (int i=0;i<n;i++){
    System.out.println("==Enter the passenger details== ");
    System.out.println("Enter the name");
    name[i]=src.nextLine();
    System.out.println("Enter the age");
    age[i]=src.nextLine();
    System.out.println("Enter the gender");
    gender[i]=src.nextLine();
    System.out.println("Enter the mobile no");
    mobile[i]=src.nextLine();
    System.out.println("enter the email");
    email[i]=src.nextLine();
    System.out.println("Enter the date");
    date[i]=src.nextLine();
    System.out.println("Enter the brarding point");
    boarding_Point[i]=src.nextLine();
    System.out.println("Enter the destination");
    destination[i]=src.nextLine();
    System.out.println("Enter the bus no");
    bus_no[i]=src.nextLine();    

        }

}
}