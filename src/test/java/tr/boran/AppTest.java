package tr.boran;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testAdd() {
       // System.out.println("add");
        Integer a = 15;
        Integer b = 15;
        Integer expResult = 30;
        Integer result = App.add(a, b);
        assertEquals(expResult, result);
        assertEquals(null, App.add(15, null));
        assertEquals(null, App.add(null, 15));
        assertEquals(null, App.add(null, null));
        System.out.println("result: "+result+", "+ "expected result: "+expResult );
    }
}
