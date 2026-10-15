import java.util.Scanner;
class vowels{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            String word =scan.nextLine();
            int vowelscount = 0;
            int constantcount = 0;
            for(int i=0;i<word.length();i++){
                 char y = Character.toLowerCase(word.charAt(i));
                 if(y=='a'|| y=='e'|| y=='i'|| y=='o'||y=='u'){
                    System.out.println(y+"");
                    vowelscount++;
                 }
                 else{
                    System.out.println("constant");
                 }
        }
    }
}