package week3;
import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(6,Week3.max(2,6));
        assertEquals(7,Week3.max(4,7));
        assertEquals(90,Week3.max(45,90));
        assertEquals(180,Week3.max(32,180));
        assertEquals(6,Week3.max(1,6));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMin(){
        int[] array = {1,2,3};
        int[] array2 = {1,-10,3,-10};
        int[] array3 = {14,234,-234};
        int[] array4 = {54,43,65};
        int[] array5 = {1,2,6,-5,3};
        assertEquals(1,Week3.minOfArray(array));
        assertEquals(-10,Week3.minOfArray(array2));
        assertEquals(-234,Week3.minOfArray(array3));
        assertEquals(43,Week3.minOfArray(array4));
        assertEquals(-5,Week3.minOfArray(array5));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testBMI(){
        assertEquals("Thieu can",Week3.calculateBMI(55,1.75));
        assertEquals("Binh thuong",Week3.calculateBMI(60,1.75));
        assertEquals("Thua can",Week3.calculateBMI(75,1.75));
        assertEquals("Beo phi",Week3.calculateBMI(80,1.75));
        assertEquals("Thieu can",Week3.calculateBMI(55,1.75));
    }
}
