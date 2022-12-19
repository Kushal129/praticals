import java.util.Scanner;

public class  p2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of item in decimal form -- ");
        float price = sc.nextFloat();
        int paisa = (int) (price * 100);
        System.out.println("Price in paisa:= " + paisa + " paisa");
   }
}


