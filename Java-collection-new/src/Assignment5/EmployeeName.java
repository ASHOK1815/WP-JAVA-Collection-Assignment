package Assignment5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeName {
    public static void main(String[] args)
    {
        LinkedHashSet<String> employeeName = new LinkedHashSet<>();

        employeeName.add("ASHOK");
        employeeName.add("SUNIL");
        employeeName.add("JAVED");
        employeeName.add("ASHUTOSH");
        employeeName.add("KUMAR");


         Iterator<String> it= employeeName.iterator();

         while(it.hasNext())
         {
             System.out.println(it.next()+" ");
         }


    }

}
