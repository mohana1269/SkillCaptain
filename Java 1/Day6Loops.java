import java.util.Scanner;

public class Day6Loops {

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();

    }
        public static void forLoop() {
            System.out.println("Printing 1 to 10 using For Loop:");
            for (int i = 1; i <= 10; i++)
                System.out.print(i + " ");
            System.out.println(" \n ");
        }
        public static void whileLoop() {
            System.out.println("Printing even numbers using while loop");
            int j=1;
            while(j<=20){
                if(j%2==0){
                    System.out.print( j + " ");
                }
                j++;
            }
            System.out.print(" \n ");
        }
        public static void doWhileLoop(){
            int number;
            System.out.println("\nPrinting using do-while loop  ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number between 1 to 10 : ");
            number =sc.nextInt();
                if(number<1 || number >10){
                    System.out.println("Please enter valid number");
                    number=sc.nextInt();
                }
            int i=0;
            do{
                i++;
            } while(i==number);
            System.out.println("you have entered: " +number);

        }

}
