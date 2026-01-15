import java.util.Scanner;

public class Print_User_Name 

{

    public static void main(String[] args)
    
    {
        // Create Scanner Object To Read Input:
        Scanner scanner = new Scanner(System.in);

        // Prompt The User
        System.out.print("Enter your name: ");

        // Read The Input
        String name = scanner.nextLine();

        // Print The Name
        System.out.println("Hello, " + name + "!");

        // Close The Scanner
        scanner.close();
    }
}
