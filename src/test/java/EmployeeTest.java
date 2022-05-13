import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void employeeD(){
        var emp =  new Employee();
        emp.setId(1);
        emp.setFirstname("King");

        assertEquals(1,emp.getId());
        assertEquals("King",emp.getFirstname());

    }

}