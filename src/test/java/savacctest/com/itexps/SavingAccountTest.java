/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package savacctest.com.itexps;

import com.itexps.training.finaljavaproject.SavingAccount;
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
public class SavingAccountTest {
    SavingAccount savacc;
    
    public SavingAccountTest() {
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
        savacc = new SavingAccount(456, "1", "SA", 5);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testSavAccBalance(){
        assertEquals(456, savacc.getSa_balance());        
    }
    
    @Test
    public void testSavAccNum(){
        assertEquals("1", savacc.getAccount_no());        
    }
    
    @Test
    public void testSavAccType(){
        assertEquals("SA", savacc.getAccount_type());        
    }
    
    @Test
    public void testSavAccCustID(){
        assertEquals(5, savacc.getAssociated_customer_ID());        
    }
}
