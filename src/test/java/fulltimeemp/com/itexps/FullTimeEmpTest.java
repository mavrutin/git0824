/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package fulltimeemp.com.itexps;

import com.itexps.training.finaljavaproject.FullTimeEmployee;
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
public class FullTimeEmpTest {
    FullTimeEmployee fulltimeemp;
    
    public FullTimeEmpTest() {
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
        fulltimeemp = new FullTimeEmployee(1, "Emma", "Green", "egreen@bank.com", "fulltime", 1234);
    }
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
        public void testFullTimeEmpID(){
            assertEquals(1, fulltimeemp.getId());
        }    
    
    @Test
        public void testFullTimeEmpFName(){
            assertEquals("Emma", fulltimeemp.getFirst());
        }
    
    @Test
        public void testFullTimeEmpLName(){
            assertEquals("Green", fulltimeemp.getLast());
        }
    
    @Test
        public void testFullTimeEmpEmail(){
            assertEquals("egreen@bank.com", fulltimeemp.getEmail());
        }
        
    @Test
        public void testFullTimeEmpType(){
            assertEquals("fulltime", fulltimeemp.getType());
        } 
        
    @Test
        public void testFullTimeEmpSalary(){
            assertEquals(1234, fulltimeemp.getSalary());
        }    
}
