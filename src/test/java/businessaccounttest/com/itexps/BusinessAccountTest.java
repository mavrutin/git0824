/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package businessaccounttest.com.itexps;

import com.itexps.training.finaljavaproject.BusinessAccount;
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
public class BusinessAccountTest {
    BusinessAccount bus_acc;
    
    
    public BusinessAccountTest() {
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
        bus_acc = new BusinessAccount(12345, "34", "BA", 1);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
           
    @Test
    public void testBusAccNum(){
        assertEquals("34", bus_acc.getAccount_no());
    }
    
    @Test
    public void testBusAccType(){
        assertEquals("BA", bus_acc.getAccount_type());
    }
    
    @Test
    public void testBusAccUID(){
        assertEquals(1, bus_acc.getAssociated_customer_ID());
    }
    
    @Test
    public void testBusAccBalance(){
        assertEquals(12345, bus_acc.getBa_balance());
    }
}
