import java.util.ArrayList;

/**
 * The Climber class stores and retreives information about the climber including their age, gender
 * and a list of mountains that they have climbed. 
 * 
 * @author Thomas Harwin
 * @version 1.0
 */
public class Climber
{
    private String climberName;
    private int climberAge;
    private String climberGender;
    private ArrayList<Mountain> mountainsClimbed;
            
    /**
     * Constructor for objects of class Climber.
     */
    public Climber(String name, int age, String gender)
    {
        climberName = name;
        climberAge = age;
        climberGender = gender;
        mountainsClimbed = new ArrayList<Mountain>();
    }
     
    /**
     * Method for returning the name of the climber.
     * 
     * @return A String of text.
     */
    public String getName()
    {
        return climberName;
    }
    
    /**
     * Method for returning the age of the climber.
     * 
     * @return An integer.
     */
    public int getAge()
    {
        return climberAge;
    }
    
    /**
     * Method for returning the gender of the climber.
     * 
     * @return A String of text.
     */
    public String getGender()
    {
        return climberGender;
    }
    
    /**
     * Method adding a mountain to the list of mountains which a climber has
     * climbed.
     * 
     * @param Takes an instance of mountain.
     */
    public void addMountain (Mountain mountain)
    {
        mountainsClimbed.add(mountain);
    }
    
    /**
     * Method for returning the highest mountain climbed by the climber.
     * 
     * @return An instance of mountain.
     */ 
    public Mountain getHighestMountain()
    {
        int highest = 0;
        Mountain highestMountain = null;
        
        for(Mountain mountain : mountainsClimbed){
            if(mountain.getHeight() > highest){
                highest = mountain.getHeight();
                highestMountain = mountain;
            }
        }       
        return highestMountain;    
    }
        
    /**
     * Method for returning the average mountain height across all the mountains 
     * climbed by a climber.
     * 
     * @return An integer.
     */
    public int getAverageMountainHeight()
    {
        int sum = 0;
        
        for(Mountain mountain : mountainsClimbed){
            sum = sum + mountain.getHeight();
        }
        
        int average = sum / mountainsClimbed.size();
    
        return average;  
    }
  
    /**
     * Method for returning a list of all mountains recorded by the climber 
     * with a height greater than a given level.
     * 
     * @param  Takes height (int) as a parameter.
     * 
     * @return An array list of mountains.
     */
    public ArrayList<Mountain> getHeightGreaterThan(int height)
    {
        ArrayList<Mountain> mountainsGreaterThan = new ArrayList<Mountain>();
        
        for(Mountain mountain : mountainsClimbed){
            if (mountain.getHeight() > height){
                mountainsGreaterThan.add(mountain);
            }
        }
        return mountainsGreaterThan;
    
    }
}