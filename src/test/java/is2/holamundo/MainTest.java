package is2.holamundo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        //System.out.println("Before Class");
    }

    @Before
    public void setUp() {
        //System.out.println("Before Test Case");
        System.setOut(new PrintStream(outContent));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAppConstructor() {
        try {
            new Main();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain() {
        
        Main.main(null);
        try {
            assertEquals("*Hola Mundo Java*" + System.getProperty("line.separator") , outContent.toString() );
        } catch (AssertionError e) {
            fail("\"Mensaje\" no es \"*Hola Mundo Java*\"");
           // System.out.println("El out es : " +outContent.toString() +"XXX" );
        }
    }

    @After
    public void tearDown() {
        System.setOut(null);
       // System.out.println("After Test Case");
    }

    @AfterClass
    public static void tearDownClass() {
        //System.out.println("After Class");
    }
    
}
