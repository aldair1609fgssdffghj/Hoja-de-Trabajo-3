/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaSort;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class QuickSortTest {
    
    public QuickSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of quick_srt method, of class QuickSort.
     */
    @Test
    public void testQuick_srt() {
        int[] a = {10,8,7,9,4,5,2,1,3,6};
        QuickSort instance = new QuickSort(a);
        int[] expResult = {1,2,3,4,5,6,7,8,9,10};
        int[] result = instance.getArray();
        Assert.assertArrayEquals(expResult,result);
        //fail("The test case is a prototype.");
    }
    
}
