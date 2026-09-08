
import java.util.Scanner;

public class ClassEnrollment{
        public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student Name: ");
        String myString1 = scanner.nextLine();

        System.out.print("Subject Code: ");
        String myString2 = scanner.nextLine();
        
        System.out.print("Subject Title: ");
        String myString3 = scanner.nextLine();
        
        System.out.print("Units: ");
        int myInt1 = scanner.nextInt();
        
        System.out.print("Section: ");
        char myChar = scanner.next().charAt(0);

        
        System.out.println();
        System.out.println( "Name: " + myString1);
        System.out.println( "Subject Code: " + myString2);
        System.out.println( "Subject: " + myString3);
        System.out.println( "Units: " + myInt1);
        System.out.println( "Section: " + myChar);
        scanner.close();
      
    }    
    
}
