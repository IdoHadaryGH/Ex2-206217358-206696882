package Ex2_206217358_206696882;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Question 1, Section C - Rigorous Test for the test case from section B :-)
     */
    @Test
    public void Ex2_1_Class_A_min() {
    	String expected = "A";
    	String actual = App.convertsNumberToCharacter(90);
    	assertEquals(expected, actual);
    }
    @Test
    public void Ex2_2_Class_A_minPlusOne() {
    	String expected = "A";
    	String actual = App.convertsNumberToCharacter(91);
    	assertEquals(expected, actual);
    }
    @Test
    public void Ex2_3_Class_A_nominal() {
    	String expected = "A";
    	String actual = App.convertsNumberToCharacter(97);
    	assertEquals(expected, actual);
    }
    @Test
    public void Ex2_4_Class_A_max() {
    	String expected = "A";
    	String actual = App.convertsNumberToCharacter(100);
    	assertEquals(expected, actual);
    }
    @Test
    public void Ex2_5_Class_A_maxMinusOne() {
    	String expected = "A";
    	String actual = App.convertsNumberToCharacter(99);
    	assertEquals(expected, actual);
    }

}
