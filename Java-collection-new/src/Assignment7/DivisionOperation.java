package Assignment7;

//        Write a Program with a division method who receives two integer numbers and performs the division operation.
//        The method should declare that it throws ArithmeticException. This exception should be handled in the main method.


import java.util.Scanner;

public class DivisionOperation {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        try{

            double result=firstNumber/secondNumber;
            System.out.println("The division of the two number is  "+ result);
        }catch (ArithmeticException e)
        {
            System.out.println("Denominator can't be zero");
        }



    }


}
