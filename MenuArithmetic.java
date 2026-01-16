import java.util.Scanner;

class MenuArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        if (choice >= 1 && choice <= 4) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    if (b != 0) {
                        System.out.println("Result = " + (a / b));
                    } else {
                        System.out.println("Division by zero not possible");
                    }
                    break;
            }

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
