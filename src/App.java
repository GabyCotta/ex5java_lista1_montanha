import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Converter valores");

        Scanner metros= new Scanner(System.in);

System.out.print("Quantos metros você quer converter?");
        Float centimetros= metros.nextFloat();
       
        float cm = centimetros* 100;
        System.out.print("Em centímetros:"+cm);

        
    
    }
}