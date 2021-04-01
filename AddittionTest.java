/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculate1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
/**
 *
 * @author:Zukisa Molisi
 * @std:217089062
 */
public class AddittionTest {
   private int num1;
   private int num2;
   
    @BeforeEach
    public void setUp() {
        
    }
    
        @Test
        public void testEquality(){
        assertEquals(num1,num2);
    }
       @ Test
        public void testIdentity(){
        assertSame(num1,num2);
    
    }
        @Test
        
        public void testFail(){
        assertEquals(num1,num2);    
        fail("This test must fail");
        
        }
        @Test
        @ Disabled
        public void disablingTest(){
        assertEquals(num1,num2);
    
}       @Test
        @Timeout(1000)
        public void testWithTimeout(){
        assertSame(num1,num2);
                
        }
    
}