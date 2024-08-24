/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package parttimeemptest.com.itexps;

import com.itexps.training.finaljavaproject.PartTimeEmployee;
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
public class PartTimeEmployeeTest {
    PartTimeEmployee parttimeemp;
    
    
    public PartTimeEmployeeTest() {
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
        parttimeemp = new PartTimeEmployee(1, "John", "Doe", "jdoe@abc.com", "parttime", 25);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testPartTimeEmpID(){
        assertEquals(1, parttimeemp.getId());
    }
    
    @Test
    public void testPartTimeEmpFirst(){
        assertEquals("John", parttimeemp.getFirst());
    }
    
    @Test
    public void testPartTimeEmpLast(){
        assertEquals("Doe", parttimeemp.getLast());
    }
    
    @Test
    public void testPartTimeEmpEmail(){
        assertEquals("jdoe@abc.com", parttimeemp.getEmail());
    }
    
    @Test
    public void testPartTimeEmpType(){
        assertEquals("parttime", parttimeemp.getType());
    }
    
    @Test
    public void testPartTimeEmpWages(){
        assertEquals(25, parttimeemp.getHourlyRate());
    }
    
}
