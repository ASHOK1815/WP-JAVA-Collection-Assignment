package SaveEvenNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SaveEvenNumber {

    public static  ArrayList<Integer> SaveEvenNumbers(int N)
    {
        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int i=2;i<=N;i++)
        {
            if(i%2==0)
            {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> printEvenNumbers(ArrayList<Integer> arrayList)
    {
        ArrayList<Integer>arrayList1 = new ArrayList<>();
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i)*2);
            arrayList1.add(arrayList.get(i) *2);
        }


        return arrayList1;
    }


    public static int printEvenNumber(int N,ArrayList<Integer> arrayList)
    {

        for(int i=0;i<arrayList.size();i++)
        {
            if(arrayList.get(i).equals(N))
            {
                return N;
            }
        }

        return 0;

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int N=scanner.nextInt();
        ArrayList<Integer>EvenNumber=SaveEvenNumbers(N);
        ArrayList<Integer>getPrintEvenNumber=printEvenNumbers(EvenNumber);
        System.out.println("Enter the element you want to search for ");
        N=scanner.nextInt();

        System.out.println(printEvenNumber(N,EvenNumber));




    }
}
