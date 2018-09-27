package week3;

import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    public void testMax(){
        assertEquals(6,Week3.max(2,6));
        assertEquals(7,Week3.max(4,7));
        assertEquals(90,Week3.max(45,90));
        assertEquals(180,Week3.max(32,180));
        assertEquals(6,Week3.max(1,6));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testMin(){
        int[] array;
        array[0]=1;
        array[1]=2;
        array[2]=3;
        assertEquals(1,Week3.minOfArray(array));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testBMI
    {
        double weight;
        double height;
        assertEquals("Thieu can",Week3.calculateBMI());
    }
}
