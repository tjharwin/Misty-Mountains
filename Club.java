import java.util.ArrayList;

/**
 * The Club class stores and retreives information about all the climbers in 
 * the club. It features methods to return the climber with the highest average 
 * height climbed, the highest mountain recorded across the climbers and a list
 * of all mountains over a given height.
 * 
 * @author Thomas Harwin
 * @version 1.0
 */
public class Club
{
    private ArrayList<Climber> clubClimbers;
    private String clubName;

    /**
     * Constructor for objects of class Club.
     */
    public Club(String name)
    {
       clubClimbers = new ArrayList<Climber>();
    } 
    
    /**
     * Method for adding a climber to the club.
     * 
     * @param Takes an instance of climber.  
     */
    public void addClimber (Climber climber)
    {
        clubClimbers.add(climber);
    }
      
    /**
     * Method for returning a list of climbers in the club.
     * 
     * @return An array list of climbers.
     */
    public ArrayList<Climber> getClubClimbers()
    {
        return clubClimbers;
    } 
    
    /**
     * A method which returns the climber who has recorded the highest average 
     * mountain height within the club.
     * 
     * @return An instance of climber.
     */
    public Climber getHighestRecordedAvgClimber()
    {
        Climber highestAverageClimber = null;
        int highestAverage = 0;
        
        for (Climber climber : clubClimbers){
            if (climber.getAverageMountainHeight() > highestAverage){
                highestAverage = climber.getAverageMountainHeight();
                highestAverageClimber = climber;
            }
        }
        
        return highestAverageClimber;
    }
    
    /**
     * A method which returns the highest mountain recorded across all members 
     * of the club.
     * 
     * @return An instance of mountain.
     */
    public Mountain getHighestMountainInClub()
    {
        int highest = 0;
        Mountain highestMountainInClub = null;
                
        for(Climber climber : clubClimbers){
            Mountain currentMountain = climber.getHighestMountain();
            if(currentMountain.getHeight() > highest){
                highest = currentMountain.getHeight();
                highestMountainInClub = currentMountain;
            }     
        }
        
        return highestMountainInClub; 
    }
    
    /**
     * A method which returns a list of all mountains recorded by the climbers 
     * within a club which have a height greater than a given level.
     * 
     * @param Takes height (int) as a parameter.
     * 
     * @return An array list of mountains.
     */
    public ArrayList<Mountain> getMountainsGreaterThanInClub(int height)
    {
        ArrayList<Mountain> mountainsGreaterThanInClub = new ArrayList<Mountain>();
        
        for (Climber climber : clubClimbers){
            mountainsGreaterThanInClub.addAll(climber.getHeightGreaterThan(height));                
            }
        
        return mountainsGreaterThanInClub;
    }
}

    

