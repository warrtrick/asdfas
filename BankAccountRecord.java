
import java.util.Scanner;

public class BankAccountRecord{
        public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("James Zedrick O. Montalbo ");
        System.out.println();
        System.out.print("Account Holder: ");
        String myString1 = scanner.nextLine();

        System.out.print("Account Number: ");
        String myString2 = scanner.nextLine();
        
        System.out.print("Account Type: ");
        String myString3 = scanner.nextLine();
        
        System.out.print("Balance: ");
        double myDouble = scanner.nextDouble();
        
        System.out.println();
        System.out.println(  myString1);
        System.out.println(  myString2);
        System.out.println( myString3);
        System.out.println( myDouble);
        scanner.close();
      
    }    
    
}
