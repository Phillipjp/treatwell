/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treatwell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phillipperks
 */
public class TreatwellTest {
    
    public TreatwellTest() {
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
     * Tests the hight of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleHeight() throws Exception {
        System.out.println("testBuildRectangleHeight");
        int h = 4;
        int w = 5;
        int expResult = h;
        int result = Treatwell.buildRectangle(h, w).length;
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println("");
        assertEquals(expResult, result);
        
    }
    
    /**
     * Tests the width of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleWidth() throws Exception {
        System.out.println("testBuildRectangleWidth");
        int h = 4;
        int w = 5;
        int expResult = w;
        int result = Treatwell.buildRectangle(h, w)[0].length;
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println("");
        assertEquals(expResult, result);
        
    }
    
    /**
     * Tests the character in the top left corner of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleTopLeftChar() throws Exception {
        System.out.println("testBuildRectangleTopLeftChar");
        int h = 4;
        int w = 5;
        String expResult = "┌";
        String result = Treatwell.buildRectangle(h, w)[0][0];
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println("");
        assertEquals(expResult, result);
        
    }
    
    /**
     * Tests the character in the top right corner of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleTopRightChar() throws Exception {
        System.out.println("testBuildRectangleTopRightChar");
        int h = 4;
        int w = 5;
        String expResult = "˥";
        String result = Treatwell.buildRectangle(h, w)[0][w-1];
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println("");
        assertEquals(expResult, result);
        
    }
    
    /**
     * Tests the character in the bottom left corner of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleBottomLeftChar() throws Exception {
        System.out.println("testBuildRectangleBottomLeftChar");
        int h = 4;
        int w = 5;
        String expResult = "˪";
        String result = Treatwell.buildRectangle(h, w)[h-1][0];
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println("");
        assertEquals(expResult, result);
        
    }
    
    /**
     * Tests the character in the bottom right corner of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleBottomRightChar() throws Exception {
        System.out.println("testBuildRectangleBottomRightChar");
        int h = 4;
        int w = 5;
        String expResult = "┘";
        String result = Treatwell.buildRectangle(h, w)[h-1][w-1];
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println("");
        assertEquals(expResult, result);
        
    }
    
    /**
     * Tests the minimum value for the h parameter for the 
     * buildRectangle method, of class Treatwell.
     */
    @Test(expected = IllegalDimensionsException.class)
    public void testBuildRectangleMinimumhValue() throws Exception {
        System.out.println("testBuildRectangleMinimumhValue");
        System.out.println("");
        int h = -1;
        int w = 5;
        String [][] result = Treatwell.buildRectangle(h, w);
        
        
    }
    
    /**
     * Tests the minimum value for the w parameter for the 
     * buildRectangle method, of class Treatwell.
     */
    @Test(expected = IllegalDimensionsException.class)
    public void testBuildRectangleMinimumwValue() throws Exception {
        System.out.println("testBuildRectangleMinimumwValue");
        System.out.println("");
        int h = 4;
        int w = -1;
        String [][] result = Treatwell.buildRectangle(h, w); 
    }
    
    /**
     * Tests the centre characters in the left columns of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleLeftColumn() throws Exception {
        System.out.println("testBuildRectangleLeftColumn");
        int h = 4;
        int w = 5;
        String [] expResult = new String [h-2];
        String [] []rectangle = Treatwell.buildRectangle(h, w);
        
        for(int i=0; i<expResult.length;i++){
            expResult[i] = "|";
        }
        String [] result = new String [h-2];
        for(int i=0;i<result.length; i++){
            result[i]=rectangle[i+1][0];
        }
        System.out.print("Expected: ");
        for(int i=0; i<expResult.length;i++){
            System.out.print(expResult[i]);
        }
        System.out.println("");
        System.out.print("Result: ");
        for(int i=0; i<expResult.length;i++){
            System.out.print(result[i]);
        }
        System.out.println("");
        System.out.println("");
        assertArrayEquals(expResult, result);
        
    }
    
    /**
     * Tests the centre characters in the right columns of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleRightColumn() throws Exception {
        System.out.println("testBuildRectangleRightColumn");
        int h = 6;
        int w = 5;
        String [] expResult = new String [h-2];
        String [] []rectangle = Treatwell.buildRectangle(h, w);
        
        for(int i=0; i<expResult.length;i++){
            expResult[i] = "|"; 
        }
        String [] result = new String [h-2];
        for(int i=0;i<result.length; i++){
            result[i]=rectangle[i+1][w-1];
        }
        System.out.print("Expected: ");
        for(int i=0; i<expResult.length;i++){
            System.out.print(expResult[i]);
        }
        System.out.println("");
        System.out.print("Result: ");
        for(int i=0; i<expResult.length;i++){
            System.out.print(result[i]);
        }
        System.out.println("");
        System.out.println("");
        assertArrayEquals(expResult, result);
        
    }
    /**
     * Tests the centre characters in the bottom row of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleBottomRow() throws Exception {
        System.out.println("testBuildRectangleBottomRow");
        int h = 6;
        int w = 5;
        String [] expResult = new String [w-2];
        String [] []rectangle = Treatwell.buildRectangle(h, w);
        
        for(int i=0; i<expResult.length;i++){
            expResult[i] = "-"; 
        }
        String [] result = new String [w-2];
        for(int i=0;i<result.length; i++){
            result[i]=rectangle[h-1][i+1];
        }
        System.out.print("Expected: ");
        for(int i=0; i<expResult.length;i++){
            System.out.print(expResult[i]);
        }
        System.out.println("");
        System.out.print("Result: ");
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]);
        }
        System.out.println("");
        System.out.println("");
        assertArrayEquals(expResult, result);
        
    }
    /**
     * Tests the centre characters in the top row of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleTopRow() throws Exception {
        System.out.println("testBuildRectangleTopRow");
        int h = 6;
        int w = 5;
        String [] expResult = new String [w-2];
        String [] []rectangle = Treatwell.buildRectangle(h, w);
        
        for(int i=0; i<expResult.length;i++){
            expResult[i] = "-"; 
        }
        String [] result = new String [w-2];
        for(int i=0;i<result.length; i++){
            result[i]=rectangle[0][i+1];
        }
        System.out.print("Expected: ");
        for(int i=0; i<expResult.length;i++){
            System.out.print(expResult[i]);
        }
        System.out.println("");
        System.out.print("Result: ");
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]);
        }
        System.out.println("");
        System.out.println("");
        assertArrayEquals(expResult, result);
        
    }
    
    
    /**
     * Tests the characters in the centre of the array returned from the 
     * buildRectangle method, of class Treatwell.
     */
    @Test
    public void testBuildRectangleCentre() throws Exception {
        System.out.println("testBuildRectangleCentre");
        int h = 6;
        int w = 5;
        String [][] expResult = new String [h-2][w-2];
        String [] []rectangle = Treatwell.buildRectangle(h, w);
        
        for(int i=0; i<expResult.length;i++){
            for(int j=0; j<expResult[i].length;j++){
                expResult[i][j] = " "; 
            }
        }
        String [][] result = new String [h-2][w-2];
        for(int i=0;i<result.length; i++){
            for(int j=0; j<result[i].length;j++){
                result[i][j]=rectangle[i+1][j+1];
            }
        }
        System.out.print("Expected: ");
        for(int i=0; i<expResult.length;i++){
            for(int j=0; j<expResult[i].length;j++){
                System.out.print(expResult[i][j]);
            }
        }
        System.out.println("");
        System.out.print("Result: ");
        for(int i=0; i<expResult.length;i++){
            for(int j=0; j<result[i].length;j++){
                System.out.print(result[i][j]);
            }
        }
        System.out.println("");
        System.out.println("");
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of printRectangle method, of class Treatwell.
     */
    @Test
    public void testPrintRectangle() throws IllegalDimensionsException {
        System.out.println("printRectangle");
        int h = 4;
        int w = 5;
        String[][] rectangle = Treatwell.buildRectangle(h, w);
        Treatwell.printRectangle(rectangle);
        System.out.println("");
    }

    
    
}
