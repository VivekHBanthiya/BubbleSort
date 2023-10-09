import java.util.Random;
public class Main {
    //Function to display array
    public static void PrintArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Bubble Sort function
    public static void BubbleSort(int[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            /*
            arr.length-i-1 because in each iteration we will placed post the greatest no in nth position
            so by using i-1 we are telling program to no to compare last element which we already sorted
             */
            for(int j=0; j< arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                { //Swapping j with j+1 because j is grater than j+1
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        PrintArray(arr);
    }
    public static void main(String[] args)
    {
        Random random = new Random(); //to use random number as an input
        int[] arr = new int[10]; // creating array of size 10
        for (int i=0; i< arr.length-1; i++)
        {
            arr[i] = random.nextInt(100); //taking random number under range of 100
        }

        System.out.print("Before :");
        PrintArray(arr); // printing array before sorting

        System.out.println("--------------------------------------------------------------------------");
        System.out.print("After :");
        BubbleSort(arr);
        System.out.print("--------------------------------------------------------------------------");
    }
}