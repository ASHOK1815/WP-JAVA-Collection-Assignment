package Assignment7;

//Write a program that takes as input the size of the array and the elements in the array.
// The program then asks the user to enter a particular index and prints the element at that index.
// This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception.
// In the catch block, print the class name of the exception thrown.


//        Sample Input and Output 1:
//        Enter the number of elements in the array
//        3
//        Enter the elements in the array
//        20
//        90
//        4
//        Enter the index of the array element you want to access
//        2
//        The array element at index 2 = 4
//        The array element successfully accessed

//        Sample Input and Output 2:
//
//        Enter the number of elements in the array
//        3
//        Enter the elements in the array
//        20
//        90
//        4
//        Enter the index of the array element you want to access
//        6


import java.util.Scanner;

public class ExceptionHandleInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number of elements in the array");
        int number = scanner.nextInt();
        int []arr = new  int[number];

        System.out.println("Enter the elements in the array");

        for(int i=0;i<number;i++)
        {
            arr[i]=scanner.nextInt();
        }


        try{

            System.out.println("Enter the index you want to access");
            int index = scanner.nextInt();
            System.out.println("Element present at the " + index +" index is " + arr[index]);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of index Exception generated");
        }


    }
}
