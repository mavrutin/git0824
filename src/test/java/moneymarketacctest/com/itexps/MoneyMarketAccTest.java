/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package moneymarketacctest.com.itexps;

import com.itexps.training.finaljavaproject.MoneyMarketAccount;
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
public class MoneyMarketAccTest {
    MoneyMarketAccount moneymarketacc;
    
    public MoneyMarketAccTest() {
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
        moneymarketacc = new MoneyMarketAccount(34567, "7", "MMA", 1);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testMoneyMarketAccBalance(){
        assertEquals(34567, moneymarketacc.getMma_balance());
    }
    
    @Test
    public void testMoneyMarketAccNum(){
        assertEquals("7", moneymarketacc.getAccount_no());
    }
    
    @Test
    public void testMoneyMarketAccType(){
        assertEquals("MMA", moneymarketacc.getAccount_type());
    }
    
    @Test
    public void testMoneyMarketCustID(){
        assertEquals(1, moneymarketacc.getAssociated_customer_ID());
    }
    
    
}
