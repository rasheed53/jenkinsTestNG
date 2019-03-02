/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Hashim
 */
public class LoginPageTestNGTest {
    
    LoginPage login;
    
    public LoginPageTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        login = new LoginPage();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testUsername() {
        login.setUsername("hrasheed");
        assertEquals("hrasheed", login.getUsername());
    }
    
    @Test
    public void testPassword() {
        login.setPassword("temp123");
        assertEquals("temp123", login.getPassword());
        
    }
}
