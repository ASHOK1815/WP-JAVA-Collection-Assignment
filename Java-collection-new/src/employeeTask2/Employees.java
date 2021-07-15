package employeeTask2;

public class Employees {

    private  int id;
    private  String name;
    private  String address;
    private  int salary;

    public Employees(int id ,String name,String address,int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
