
import java.util.Scanner;

public class MovieInformation {
        public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student Name: ");
        String myString1 = scanner.nextLine();

        System.out.print("Subject Code: ");
        String myString2 = scanner.nextLine();
        
        System.out.print("Subject Title: ");
        String myString3 = scanner.nextLine();
        
        System.out.print("Units: ");
        int myInt2 = scanner.nextInt();
        
        System.out.print("Section: ");
        char myChar = scanner.next().charAt(0);

        
        System.out.println();
        System.out.println( "Name " + myString1);
        System.out.println( "Direct" + myString2);
        System.out.println( "Direct" + myString3);
        System.out.println( "Release Year" + myInt1);
        System.out.println( "Release Year" + myChar);
        scanner.close();
      
    }    
    
}
