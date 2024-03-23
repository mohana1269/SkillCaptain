import java.util.*;


public class Day8ListInterface {
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Grocery List Manager:");
                System.out.println("1.Add Item:");
                System.out.println("2.Remove Item:");
                System.out.println("3.Print the Grocery List :");
                System.out.println("4.Check the item existence:");
                System.out.println("5.Clear Grocery List:");
                System.out.println("6.Exit");

                System.out.print("Enter the numbers from 1 to 6:  ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        addItem(scanner);
                        break;
                    case 2:
                        removeItem(scanner);
                        break;
                    case 3:
                        printGroceryList();
                        break;
                    case 4:
                        checkItemExistence(scanner);
                        break;
                    case 5:
                        clearGroceryList();
                        break;
                    case 6:
                        System.out.println("Thank you for using GroceryList Manager!!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice entered. Enter the number between 1 to 6 :");

                }
            }catch (InputMismatchException e){
                System.out.println("Entered incorrect format, Please enter valid Integer choice between 1 to 6 : ");
                scanner.nextLine();
            }
        }
    }
     private static void addItem(Scanner scanner) {
        System.out.print("Please enter the item to add: ");
        String item = scanner.nextLine();

        if (groceryList.contains(item)) {
            System.out.println("Item already exists in the grocery list.");
        } else {
            groceryList.add(item);
            System.out.println("Item added successfully.");
        }
        System.out.println();
    }
    private  static void removeItem(Scanner scanner){
        System.out.print("Please enter the item to be removed : ");
        String item = scanner.nextLine();
        boolean removed = groceryList.remove(item);
        if(removed) {
            System.out.println("Item removed Successfully");
        }else {
            System.out.println("Item not found  in the Grocery list ");
        }
        System.out.println();
    }
    private static void printGroceryList(){
        if(groceryList.isEmpty()) {
            System.out.println("Grocery List is Empty");
        }else{
            System.out.println("GroceryList: ");
            for(int i=0;i<groceryList.size();i++){
                System.out.println((i+1) + "." + groceryList.get(i));
            }
        }
        System.out.println();
    }
    private static void checkItemExistence(Scanner scanner){
        System.out.print("Enter the item to check : ");
        String item = scanner.nextLine();
        boolean exists = groceryList.contains(item);
        if(exists){
            System.out.println("The Item is already exists in the Grocery List ");
        }else{
            System.out.println("The Item is not in the Grocery List");
        }
        System.out.println();
    }
    private static void clearGroceryList(){
        groceryList.clear();
        System.out.println("The list is cleared");
        System.out.println();
    }
}