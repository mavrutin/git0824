/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package checkaccounttest.com.itexps;

import com.itexps.training.finaljavaproject.CheckingAccount;
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
public class CheckingAccountTest {

    CheckingAccount checkacc;

    public CheckingAccountTest() {
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
        checkacc = new CheckingAccount(50, "6", "SA", 3);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testCheckAccountBalance() {
        assertEquals(50, checkacc.getCa_balance());
    }
    
    @Test
    public void testCheckAccountNum() {
        assertEquals("6", checkacc.getAccount_no());
    }
    
    @Test
    public void testCheckAccountType() {
        assertEquals("SA", checkacc.getAccount_type());
    }
    
    @Test
    public void testCheckAccountCustID() {
        assertEquals(3, checkacc.getAssociated_customer_ID());
    }
}
