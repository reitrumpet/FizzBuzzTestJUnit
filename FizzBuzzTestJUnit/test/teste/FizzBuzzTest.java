package teste;

import model.FizzBuzz;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author rei-medeiros
 */


public class FizzBuzzTest {
    
    private FizzBuzz fb;
    
    public FizzBuzzTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        fb = new FizzBuzz();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void oneReturnsOne(){
        assertEquals("1", fb.evaluate(1));
    }
    
    @Test
    public void twoReturnsTwo(){
        assertEquals("2", fb.evaluate(2));
    }
    
    @Test
    public void threeReturnsFizz(){
        assertEquals("Fizz", fb.evaluate(3));
    }
    
    @Test
    public void fiveReturnsBuzz(){
        assertEquals("Buzz", fb.evaluate(5));
    }
    
    @Test
    public void sixReturnsFizz(){
        assertEquals("Fizz", fb.evaluate(6));
    }
    
    @Test
    public void tenReturnsBuzz(){
        assertEquals("Buzz", fb.evaluate(10));
    }
    
    @Test
    public void fifteenReturnsFizzBuzz(){
        assertEquals("FizzBuzz", fb.evaluate(15));
    }
    
    @Test
    public void thirtyReturnsFizzBuzz(){
        assertEquals("FizzBuzz", fb.evaluate(30));
    }
    
    @Test
    public void sixtyReturnsFizzBuzz(){
        assertEquals("FizzBuzz", fb.evaluate(60));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
