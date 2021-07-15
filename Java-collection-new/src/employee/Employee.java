package employee;

public class Employee {

    private int empId;
    private String empName;
    private String empEmail;
    private char empGender;
    private float empSalary;

    public Employee(int empId,String empName,String empEmail,char empGender,float empSalary)
    {
        this.empId=empId;
        this.empName=empName;
        this.empEmail=empEmail;
        this.empGender=empGender;
        this.empSalary=empSalary;

    }

    public String getEmployeeDetails() {

        return "Employee [EmpId=" + empId + ", EmpName=" + empName + ", EmpEmail=" + empEmail
                + ", EmpGender=" + empGender + ", EmpSalary=" + empSalary + "]";
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public char getEmpGender() {
        return empGender;
    }

    public void setEmpGender(char empGender) {
        this.empGender = empGender;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }


}
