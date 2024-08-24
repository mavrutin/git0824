/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package employee.com.itexps;

import com.itexps.training.finaljavaproject.Employee;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Lenovo
 */
public class EmployeeTest {
    Employee employee;
    
    public EmployeeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        employee = new Employee(1, "Ann", "Smith", "asmith@bank.com", "fulltime");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
        @Test
        public void testEmployeeId(){
            assertEquals(1, employee.getId());
        }
        
        @Test
        public void testEmployeeFirst(){
            assertEquals("Ann", employee.getFirst());
        }
        
        @Test
        public void testEmployeeLast(){
            assertEquals("Smith", employee.getLast());
        }
        
        @Test
        public void testEmployeeEmail(){
            assertEquals("asmith@bank.com", employee.getEmail());
        }
        
        @Test
        public void testEmployeeType(){
            assertEquals("fulltime", employee.getType());
        }
    
}
