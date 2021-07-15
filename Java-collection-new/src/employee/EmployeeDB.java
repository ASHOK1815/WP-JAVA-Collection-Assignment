package employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {

    ArrayList<Employee> employeDB=new ArrayList<>();


    boolean addEmployee(Employee e)
    {
        return employeDB.add(e);
    }

    boolean deleteEmployee(int eCode)
    {
        boolean removed=false;

        Iterator<Employee> it=employeDB.iterator();

        while(it.hasNext())
        {
            Employee emp=it.next();

            if(emp.getEmpId()==eCode)
            {
                removed=true;
                it.remove();
            }


        }

        return removed;
    }

    String showPaySlip(int eCode)
    {
        String paySlip = "Invalid employee id";

        for (Employee e : employeDB) {
            if (e.getEmpId() == eCode) {
                paySlip = "Pay slip for employee id " + eCode + " is " +
                        e.getEmpSalary();
            }
        }

        return paySlip;

    }

    Employee[] listAll()
    {
        Employee[] empArray = new Employee[employeDB.size()];
        for (int i = 0; i < employeDB.size(); i++)
            empArray[i] = employeDB.get(i);
        return empArray;
    }

}
