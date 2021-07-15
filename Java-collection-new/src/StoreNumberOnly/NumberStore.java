package StoreNumberOnly;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList list= new ArrayList();
        list.add(1);
        list.add(2.0);
        list.add(2.02);
        list.add("1");
        list.add("wow");

        ArrayList<Number> store = new ArrayList<>();

        for(int i=0;i<list.size();i++)
        {
            try{
                      System.out.println((Number) list.get(i));
                        store.add((Number) list.get(i));
               }
            catch (Exception e)
                {
                        System.out.println("Please enter number only!!!");
                }

            }


    }
}
