/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.addition1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Siyathandaza
 */
public class AddtwoNumbersTest {
    
   private int num1,num2;
       private  int sum= num1+num2;
    
    @Before
    public void setUp() {
        num1=5;
        num2=5;
    }
    
    @Test
    public void testEquality() {
        assertEquals(num1,num2);
    }
     @Test
    public void testIdentity() {
        assertSame(num1,num2);
    }
     @Test
    public void testFail() {
        assertEquals(num1,num2);
        fail("It should fail");
    }
     @Test(timeout=0)
    public void testTimeout() {
        assertEquals(num1,num2);
    }
     @Test
     @Ignore
       public void testDisabling() {
        assertEquals(num1,num2);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
