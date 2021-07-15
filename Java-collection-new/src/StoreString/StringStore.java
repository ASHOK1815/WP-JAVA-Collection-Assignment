package StoreString;

import java.util.ArrayList;
import java.util.Iterator;

public class StringStore {


    public static  void printAll(ArrayList<String>  arrayList)
    {

        Iterator<String> it= arrayList.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ASHOK");
        arrayList.add("JAVED");
        arrayList.add("SUNIL");

        printAll(arrayList);

    }
}
