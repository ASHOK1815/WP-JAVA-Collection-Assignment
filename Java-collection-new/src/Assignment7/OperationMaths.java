package Assignment7;

//Write a class MathOperation which accepts integers from command line. Create an array using these parameters.
//        Loop through the array and obtain the sum and average of all the elements. Display the result.
//        Check for various exceptions that may arise like ArithmeticException, NumberFormatException,
//        and so on. For example: The class would be invoked as follows:
//
//        C:>java MathOperation 1900, 4560, 0, 32500


public class OperationMaths {

    public static void main(String[] args) {

        int []arr = new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            try {
                  arr[i]=Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e)
            {
                System.out.println(e.getClass());
            }

        }

        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }

        try {
            System.out.println("The sum of all element of the array " + sum);
            System.out.println("The average of element of the array " + (double)sum/arr.length);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getClass());
        }


    }
}
