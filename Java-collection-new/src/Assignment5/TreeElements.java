package Assignment5;


import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeElements {

    public  static void main(String[] args)
    {
        TreeSet<String> name =new TreeSet<>(Collections.reverseOrder());
        name.add("ASHOK");
        name.add("SUNIL");
        name.add("KUMAR");



        String query="ASHOK";

        boolean flag=false;

        Iterator<String > it= name.iterator();

        while(it.hasNext())
        {
            if(it.next().equals(query))
            {
                flag=true;
                break;
            }
        }

        if(flag)
        {
            System.out.println(query +" present in  the tree set");
        }
        else
        {
            System.out.println(query +" not present in the tree set");
        }

    }
}
