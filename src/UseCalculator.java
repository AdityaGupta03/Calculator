import java.util.Scanner;

public class UseCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan =  new Scanner(System.in);
        boolean finished = false;
        while( !finished ) {
            System.out.println("Add, Subtract, Multiply, or Factorial?");
            String input = scan.next();
            input = input.toLowerCase();
            switch (input) {
                case "add" -> {
                    System.out.println("Enter the first number: ");
                    int x = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the second number: ");
                    int y = scan.nextInt();
                    scan.nextLine();
                    int result = calc.add(x, y);
                    System.out.println("Here is the result: " + result);
                }
                case "subtract" -> {
                    System.out.println("Enter the first number: ");
                    int x = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the second number: ");
                    int y = scan.nextInt();
                    scan.nextLine();
                    int result = calc.subtract(x, y);
                    System.out.println("Here is the result: " + result);
                }
                case "multiply" -> {
                    System.out.println("Enter the first number: ");
                    int x = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the second number: ");
                    int y = scan.nextInt();
                    scan.nextLine();
                    int result = calc.multiply(x, y);
                    System.out.println("Here is the result: " + result);
                }
                case "factorial" -> {
                    System.out.println("Enter the first number: ");
                    int x = scan.nextInt();
                    scan.nextLine();
                    int result = calc.factorial(x);
                    System.out.println("Here is the result: " + result);
                }
                default -> System.out.println("Please enter a valid command.");
            }
            System.out.println("Would you like to use the calculator again? Y or N");
            String tryAgain = scan.next();
            tryAgain = tryAgain.toLowerCase();
            if (tryAgain.equals("n")) {
                finished = true;
            }
        }
        System.out.println("Thanks for using the calculator!");
    }
}
