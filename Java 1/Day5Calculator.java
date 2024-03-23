import java.util.Scanner;

public class Day5Calculator {
    public static void main(String[] args) {
        int operator;
        double firstNumber,secondNumber;
        double result = 0;
        System.out.println(" 1 - Addition \n 2 - Substraction \n 3 - Multiplication \n 4 - Division");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Operator Number : ");
        operator=sc.nextInt();
        System.out.print("Enter the First number : ");
        firstNumber = sc.nextDouble();
        System.out.print("Enter the Second Number : ");
        secondNumber = sc.nextDouble();

    switch (operator) {
        case 1:
            result = firstNumber + secondNumber;
            break;
        case 2:
            result = firstNumber - secondNumber;
            break;
        case 3:
            result = firstNumber * secondNumber;
            break;
        case 4:
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else
                System.out.println("Cannot perform division by Zero");
            break;
        default:
            System.out.println("Please enter the valid operator");
    }
        System.out.println("The Result is : " + result);
        sc.close();
    }
}
