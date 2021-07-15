package employeeTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Employees> newList = new ArrayList<>();
        Employees employees = new Employees(6735,"ASHOK","RAJASTHAN",60000);
        Employees employees1 = new Employees(6705,"JAVED","KOLKATA",60001);
        Employees employees2 = new Employees(2467,"SUNIL","HARYANA",60002);

        newList.add(employees);
        newList.add(employees1);
        newList.add(employees2);

        System.out.println("Enter the id number you want to search ");
        int value=scanner.nextInt();
        for(int i=0;i<newList.size();i++)
        {
            if(newList.get(i).getId()==value)
            {
                System.out.println("Name "+ newList.get(i).getName()+"  "+"Salary "+newList.get(i).getSalary());
            }

        }
    }
}
