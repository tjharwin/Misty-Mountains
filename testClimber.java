
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testClimber.
 *
 * @author  Thomas Harwin
 * @version 1.0
 */
public class testClimber
{
    private Mountain mountain1;
    private Mountain mountain2;
    private Mountain mountain3;
    private Mountain mountain4;
    private Mountain mountain5;
    private Mountain mountain6;
    private Mountain mountain7;
    private Mountain mountain8;
    private Mountain mountain9;
    private Climber climber1;
    private Climber climber2;
    private Climber climber3;
    private ArrayList<Mountain> testMountains;
    
    /**
     * Default constructor for test class testClimber
     */
    public testClimber()
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
        mountain2 = new Mountain("Mountain B", 1000);
        mountain3 = new Mountain("Mountain C", 1500);
        mountain4 = new Mountain("Mountain D", 1000);
        mountain5 = new Mountain("Mountain E", 1500);
        mountain6 = new Mountain("Mountain F", 2000);
        mountain7 = new Mountain("Mountain G", 1500);
        mountain8 = new Mountain("Mountain H", 2000);
        mountain9 = new Mountain("Mountain I", 2500);
        climber1 = new Climber("Bob", 25, "Male");
        climber2 = new Climber("Jack", 30, "Male");
        climber3 = new Climber("Jill", 35, "Female");
        climber1.addMountain(mountain1);
        climber1.addMountain(mountain2);
        climber1.addMountain(mountain3);
        climber2.addMountain(mountain4);
        climber2.addMountain(mountain5);
        climber2.addMountain(mountain6);
        climber3.addMountain(mountain7);
        climber3.addMountain(mountain8);
        climber3.addMountain(mountain9);
        testMountains = new ArrayList<Mountain>();
        testMountains.add(mountain2);
        testMountains.add(mountain3);
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
    public void testGetHighestMountain()
    {
        //Tests expected to succeed
        assertEquals(mountain3, climber1.getHighestMountain());
        assertEquals(mountain6, climber2.getHighestMountain());
        assertEquals(mountain9, climber3.getHighestMountain());
        
        //Tests expected to fail
        assertEquals(mountain2, climber1.getHighestMountain());
        assertEquals(mountain5, climber2.getHighestMountain());
        assertEquals(mountain8, climber3.getHighestMountain());
    }

    @Test
    public void testGetAverageMountainHeight()
    {
        //Tests expected to succeed
        assertEquals(1000, climber1.getAverageMountainHeight());
        assertEquals(1500, climber2.getAverageMountainHeight());
        assertEquals(2000, climber3.getAverageMountainHeight());
        
        //Tests expected to fail
        assertEquals(1250, climber1.getAverageMountainHeight());
        assertEquals(1750, climber2.getAverageMountainHeight());
        assertEquals(2250, climber3.getAverageMountainHeight());
    }


    @Test
    public void testGetHeightGreaterThan()
    {
        //Test expected to succeed        
        assertEquals(testMountains, climber1.getHeightGreaterThan(750));
        
        //Test expected to fail
        assertEquals(testMountains, climber1.getHeightGreaterThan(1500));
    }
}













