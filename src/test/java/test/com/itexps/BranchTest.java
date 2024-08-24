/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import branch.com.itexps.*;
import com.itexps.training.finaljavaproject.Branch;
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
public class BranchTest {
    Branch branch;
    
    public BranchTest() {
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
        branch = new Branch(1, "Jane Doe", "1 Street, City, State, 1000", "123-456-7890");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
        @Test
        public void testBranchId(){
            assertEquals(1, branch.getBranch_id());
        }
        
        @Test
        public void testBranchContact(){
            assertEquals("Jane Doe", branch.getBranch_contact());
        }
        
        @Test
        public void testBranchAddress(){
            assertEquals("1 Street, City, State, 1000", branch.getBranch_address());
        }
        
        @Test
        public void testBranchPhone(){
            assertEquals("123-456-7890", branch.getBranch_ph_number());
        }
        
        
}
