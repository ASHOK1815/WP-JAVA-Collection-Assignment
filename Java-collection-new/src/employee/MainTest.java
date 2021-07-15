package employee;

public class MainTest {

    public static void main(String[] args) {

        Employee empObj=new Employee(6735,"ASHOK","rupender20@gmail.com",'M',60000);
        Employee empObj1=new Employee(6705,"JAVED_ALI","javedali0563@gmail.com",'M',60002);
        Employee empObj2=new Employee(2467,"SUNIL","sunilvashist45@gmail.com",'M',60003);

        EmployeeDB employeeDB=new EmployeeDB();

        employeeDB.addEmployee(empObj);
        employeeDB.addEmployee(empObj1);
        employeeDB.addEmployee(empObj2);

        for(Employee employee:employeeDB.listAll())
        {
            System.out.println(employee.getEmployeeDetails());
            System.out.println();
        }

        employeeDB.deleteEmployee(6705);


        System.out.println(employeeDB.showPaySlip(6735));



    }
}
