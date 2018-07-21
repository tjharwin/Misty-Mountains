
/**
 * The Mountain class stores and retreives information about the name and height (in meters) of the
 * a mountain.
 * 
 * @author Thomas Harwin
 * @version 1.0
 */
public class Mountain
{
    private String mountainName;
    private int mountainHeight;

    /**
     * Constructor for objects of class Mountain
     * 
     * @param Takes the name (String) of a mountain and the height (int) in 
     * meters.
     */
    public Mountain(String name, int meters)
    {
        mountainName = name;
        mountainHeight = meters;
    }

    /**
     * Method for returning the name of a mountain.
     * 
     * @return A string of text.
     */
    public String getName()
    {
        return mountainName;
    }
    
    /**
     * Method for returning the height of a mountain.
     * 
     * @return An integer.
     */
    public int getHeight()
    {
        return mountainHeight;
    }
    
 }
