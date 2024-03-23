//1. Create an array of 5 integer values with the any elements: like [10, 5, 15, 7, 20].
//2. Calculate and print the sum of all the values in the array.
//3. Calculate and print the average (mean) of the values in the array.
//4. Find and print the maximum value among the elements in the array.
//5. Find and print the minimum value among the elements in the array.


public class Day7Arrays {

    public static void main(String[] args) {
          sumofArrayOfIntergers();
          averageOfArrayValues();
          maximumValue();
          minimumValue();

    }
    public static void sumofArrayOfIntergers(){
            int integerArray[] = {12, 14, 16, 18, 20};

            System.out.println("Array length is :" + integerArray.length);
            int sum=0;
            for(int i=0;i<integerArray.length;i++){
                sum =sum+integerArray[i];
            }
        System.out.println("Sum of array of Integers are :" + sum);
    }
    public static void averageOfArrayValues(){
        int integerArray[]={10,20,30,40,50,60};

        int sum=0;
        int mean=0;
        for(int i=0;i<integerArray.length;i++){
            sum=sum+integerArray[i];
            mean=sum/integerArray.length;
        }
        System.out.println("The mean of all the values are: " + mean);
    }
    public static void maximumValue(){
        int integerArray[]={34,76,94,83,65};
        int maximumValue=integerArray[0];

        for(int i=0; i<integerArray.length;i++) {
            if (integerArray[i] > maximumValue) {
                maximumValue = integerArray[i];
            }
        }
        System.out.println("The Minimum Value is : " + maximumValue);
    }
    public static void minimumValue(){
        int integerArray[]={5,8,3,9,4};
        int minimumValue=integerArray[0];

        for(int i=0;i<integerArray.length;i++) {
            if(integerArray[i]<minimumValue) {
             minimumValue=integerArray[i];
            }
        }
        System.out.println("The Minimum Value is :" + minimumValue);
    }
}
