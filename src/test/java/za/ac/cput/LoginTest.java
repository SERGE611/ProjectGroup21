/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;
import java.util.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author michael
 */
public class LoginTest {
    
   private Login University1;
   private Login University2;
   private Login University3;
   private Login University4;
   
    @BeforeEach
    public void setUp()
    {
        University1=new Login();
        University2=University3;
        University4=new Login();
        
    }
    
 
    @Test
    public void testEquality() 
    {
        assertEquals(University2,University3);
    }
    @Test
    public void testIdentity() 
    {
        assertEquals(University2,University3);
    }
     
    @Test
    public void test() 
    {
        assertEquals(University2,University3);
        
    }
    @Test
    public void FailingTest()
    {
        int num=2,num1=3;
        int total=75;
        fail("deliberately made the test fail");
        
    }
    
    @Disabled
    @Test
    public void testDiasabled()
    {
        System.out.println("the test is Diasable");
        
    }
    
    @Test
    @Timeout(2000)
    public void timeoutTest()
    {
        while(true);
    }
            
            
    
    
    
}
