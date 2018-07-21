

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testMountain.
 *
 * @author  Thomas Harwin
 * @version 1.0
 */
public class testMountain
{
    private Mountain mountain1;

    /**
     * Default constructor for test class testMountain
     */
    public testMountain()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        mountain1 = new Mountain("Mountain A", 500);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCreateMountain()
    {
        assertEquals(500, mountain1.getHeight());
        assertEquals("Mountain A", mountain1.getName());
    }
}

