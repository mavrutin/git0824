/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import accounttest.com.itexps.*;
import com.itexps.training.finaljavaproject.Account;
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
public class AccountTest {
    Account acc;
    
    
    public AccountTest() {
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
        acc = new Account("1", "CA", 1 );
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testAccountNum(){
        assertEquals("1", acc.getAccount_no());        
    }
    
    @Test
    public void testAccountType(){
        assertEquals("CA", acc.getAccount_type());        
    }
    
    @Test
    public void testAccountCustID(){
        assertEquals(1, acc.getAssociated_customer_ID());        
    }
    
}
