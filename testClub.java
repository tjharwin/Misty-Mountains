
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testClub.
 *
 * @author  Thomas Harwin
 * @version 1.0
 */
public class testClub
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
    private Club club1;

    /**
     * Default constructor for test class testClub
     */
    public testClub()
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
        testMountains.add(mountain3);
        testMountains.add(mountain5);
        testMountains.add(mountain6);
        testMountains.add(mountain7);
        testMountains.add(mountain8);
        testMountains.add(mountain9);
        club1 = new Club("Misty Mountains");
        club1.addClimber(climber1);
        club1.addClimber(climber2);
        club1.addClimber(climber3);
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
    public void testGetHighestRecordedAvgClimber()
    {
        //Test expected to succeed
        assertEquals(climber3, club1.getHighestRecordedAvgClimber());
        
        //Test expected to fail
        assertEquals(climber1, club1.getHighestRecordedAvgClimber());
    }

    @Test
    public void testGetHighestMountainInClub()
    {   
        //Test expected to succeed
        assertEquals(mountain9, club1.getHighestMountainInClub());
        
        //Test expected to fail
        assertEquals(mountain8, club1.getHighestMountainInClub());
    }

    @Test
    public void testGetMountainsGreaterThanInClub()
    {
        //Test expected to succeed
        assertEquals(testMountains, club1.getMountainsGreaterThanInClub(1250));
        
        //Test expected to fail
        assertEquals(testMountains, club1.getMountainsGreaterThanInClub(1750));
        
        //Test to see if mountains 'equal to' succeeds or fails
        assertEquals(testMountains, club1.getMountainsGreaterThanInClub(1500));
    }
}



