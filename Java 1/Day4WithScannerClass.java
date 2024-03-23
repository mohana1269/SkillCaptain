import java.util.Scanner;

public class Day4WithScannerClass {
        public static void main(String[] args) {
            largerNumber();
        }
      public static void largerNumber() {
          int largerNumber;
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the first number: ");
          int number1 = scanner.nextInt();

          System.out.print("Enter the second number: ");
          int number2 = scanner.nextInt();

          if (number1 > number2) {
              largerNumber = number1;
          } else {
              largerNumber = number2;
          }

          System.out.println("The larger number is: " + largerNumber);

          scanner.close();

      }

}
