package Assignment6;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EmployeesTestingClass {

    @Test
    public void testingConcat() {
        Employees employees = new Employees();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ASHOK");
        arrayList.add("SUNIL");
        arrayList.add("KUMAR");
        arrayList.add("JAVED");

        assertEquals("FOUND",employees.findName(arrayList,"ASHOK"));
    }

}
