import java.util.Scanner;
import java.util.ArrayList;

/**
 * The ClubStats class features the main method of Misty Mountains program. It
 * presents the user with a menu printed to the console which allows them to
 * access a number of features which include:
 * 
 *  -Adding a new climber to the club.
 *  -Adding details of a new mountain climbed to the record a climber.
 *  -Providing various statistics including  the  climber  who  has  recorded  
 *   the  highest  average mountain height, the highest mountain recorded by a
 *   club member and all mountains recorded with a height greater than a given 
 *   level. 
 * 
 * @author Thomas Harwin
 * @version 1.0
 */
public class ClubStats
{   
    public static void main(String[] args)
    {   
        System.out.println("***********************************************************************************************");
        System.out.println("     #     #                         #     #                                                   ");
        System.out.println("     ##   ## #  ####  ##### #   #    ##   ##  ####  #    # #    # #####   ##   # #    #  ####  ");
        System.out.println("     # # # # # #        #    # #     # # # # #    # #    # ##   #   #    #  #  # ##   # #      ");
        System.out.println("     #  #  # #  ####    #     #      #  #  # #    # #    # # #  #   #   #    # # # #  #  ####  ");
        System.out.println("     #     # #      #   #     #      #     # #    # #    # #  # #   #   ###### # #  # #      # ");
        System.out.println("     #     # # #    #   #     #      #     # #    # #    # #   ##   #   #    # # #   ## #    # ");
        System.out.println("     #     # #  ####    #     #      #     #  ####   ####  #    #   #   #    # # #    #  ####  ");
        System.out.println("                                                  *,                                           ");
        System.out.println("                                               ,%(  /%.                                        ");
        System.out.println("                                             ,@&.    .%                                        ");
        System.out.println("                                            %%.        %#.           (/.                       ");
        System.out.println("                                      .(&@@#             *#.      ,%(   (/                     ");
        System.out.println("                                    *%.  &*                .%   .%,      .%.                   ");
        System.out.println("                      ,/(         .%.  .%.                   %./(         .%&%%*               ");
        System.out.println("                   /&(   /@%*   ,@(   #&.             .&%&,  #%                 ((             ");
        System.out.println("                *%%         .(@#    ,&,             ,   .#@&.                  %@*#@.          ");
        System.out.println("             ,%@*            *(    .,             #@%.      ,%                   //  .@(       ");
        System.out.println("           %&.              (@                  (&           ,&.                 /,     &(     ");
        System.out.println("        ,(,                &%.                 ,               #.                .       ,&*   ");
        System.out.println("     */.                 */                                                                %@* ");
        System.out.println("                                                                                               ");
        System.out.println("***********************************************************************************************");
        System.out.println("                                                                                               ");
        System.out.println("                                        ===Welcome===                                          ");
        System.out.println("                       Please select from one of the following options                         ");
        System.out.println("                                                                                               ");
        System.out.println("            --> (1) Add a new climber to the club                                              ");
        System.out.println("            --> (2) Add the details of a mountain to an existing climber                       ");
        System.out.println("            --> (3) Provide details of the  climber  who  has  recorded  the                   ");
        System.out.println("                    highest  average mountain height                                           ");
        System.out.println("            --> (4) Provide details of the highest mountain recorded by a club                 ");
        System.out.println("                    member                                                                     ");
        System.out.println("            --> (5) Provide all mountains recorded with a height greater than                  ");
        System.out.println("                    a given level                                                              ");
        System.out.println("            --> (6) List all climbers in the club                                              ");
        System.out.println("            --> (7) Print the menu to the console                                              ");
        System.out.println("            --> (8) Exit                                                                       ");
        System.out.println("                                                                                               ");
        
        Club club = new Club("Misty Mountains");
        Scanner reader = new Scanner(System.in);
        int userInput = 6;
        System.out.println("Select an option and press the return key.");
    
        do {
            userInput = Integer.parseInt(reader.nextLine());
            switch (userInput){
                case 1:
                    //Creates a new instance of class Climber and adds them to the club.
                   
                    System.out.println("Enter the climber's name:");
                    String name = reader.nextLine();
                    System.out.println("Enter the climber's age:");
                    int age = Integer.parseInt(reader.nextLine());
                    System.out.println("Enter the climber's gender:");
                    String gender = reader.nextLine();
                    
                    Climber newClimber = new Climber(name, age, gender);
                    club.addClimber(newClimber);
                    
                    System.out.println("Climber \"" + name + "\" has been created!");
                    System.out.println("Select another option and press the return key. Enter (7) to see the menu again.");  
                    break;
                    
                case 2:
                    //Adds the details of a mountain to an existing climber.
                    
                    System.out.println("Enter the climber's name for whom you wish to record a new mountain for:");
                    String scannedName = reader.nextLine();
                    boolean foundClimber = false;
                    
                    for(Climber climber : club.getClubClimbers()){
                        if(scannedName.equals(climber.getName())){
                            foundClimber = true;
                            System.out.println("Enter the mountain's name:");
                            String mountainName = reader.nextLine();
                            System.out.println("Enter the mountain's height:");
                            int mountainHeight = Integer.parseInt(reader.nextLine());
                            
                            Mountain newMountain = new Mountain(mountainName, mountainHeight);

                            climber.addMountain(newMountain);
                            System.out.println("\"" + mountainName + "\"" + " has been added to the list of mountains climbed by " + "\"" + climber.getName() + "\"");
                        }
                    }
                    
                    if (foundClimber == false){
                        System.out.println("Error! Climber not found. Please enter an existing climber.");
                    }
                    
                    System.out.println("Select another option and press the return key. Enter (7) to see the menu again.");  
                    break;
                
                case 3:
                    //Provides details of the  climber  who  has  recorded  the
                    //highest average mountain height.
                                     
                    System.out.println("The climber who has recorded the highest average mountain height is \"" + club.getHighestRecordedAvgClimber().getName() + "\".");
                    System.out.println("Select another option and press the return key. Enter (7) to see the menu again.");  
                    break;
            
                case 4:
                    //Provides details of the highest mountain recorded by a club
                    //member.
                    
                    System.out.println("The highest mountain recorded by a club member is \"" + club.getHighestMountainInClub().getName() + "\" at " + club.getHighestMountainInClub().getHeight() + " meters.");
                    System.out.println("Select another option and press the return key. Enter (7) to see the menu again.");  
                    break;
        
                case 5:
                    //Provides all mountains recorded with a height greater than
                    //a given level.
                    
                    System.out.println("Enter a height:");
                    int height = Integer.parseInt(reader.nextLine());
                    ArrayList<Mountain> mountainsGreaterThanInClub = club.getMountainsGreaterThanInClub(height);
                    System.out.println("The mountains recorded with a height above " + height + " meters are as follows:");
                    for(Mountain mountain : mountainsGreaterThanInClub){
                    System.out.println(mountain.getName());    
                    }
                    System.out.println("Select another option and press the return key. Enter (7) to see the menu again.");  
                    break;
                    
                   
                case 6:
                    //Prints a list of all climbers in the club
                    
                    System.out.println("The climbers in the club are as follows:");
                    System.out.println("=============================");
                    System.out.println("- Name ---- Age ---- Gender -");
                    System.out.println("=============================");
                    ArrayList<Climber> clubClimbers = club.getClubClimbers();
                    for(Climber climber : clubClimbers){
                    System.out.println(climber.getName() + " ---- " + climber.getAge() + " ---- " + climber.getGender());
                    }
                    System.out.println("-----------------------------");
                    System.out.println("Select another option and press the return key. Enter (7) to see the menu again.");  
                    break;
                              
                case 7:
                    //Prints the menu to the console
                    
                    System.out.println("                                                                                               ");
                    System.out.println("            --> (1) Add a new climber to the club                                              ");
                    System.out.println("            --> (2) Add the details of a mountain to an existing climber                       ");
                    System.out.println("            --> (3) Provide details of the  climber  who  has  recorded  the                   ");
                    System.out.println("                    highest  average mountain height                                           ");
                    System.out.println("            --> (4) Provide details of the highest mountain recorded by a club                 ");
                    System.out.println("                    member                                                                     ");
                    System.out.println("            --> (5) Provide all mountains recorded with a height greater than                  ");
                    System.out.println("                    a given level                                                              ");
                    System.out.println("            --> (6) List all climbers in the club                                              ");
                    System.out.println("            --> (7) Print the menu to the console                                              ");
                    System.out.println("            --> (8) Exit                                                                       ");
                    System.out.println("                                                                                               ");
                    System.out.println("Select another option and press the return key.");  
                    break;
                        
                case 8:
                    //Exits the program
                    
                    System.out.println("Thank you for using Misty Mountains. Happy hiking!");
                    break;
                    
                default:
                    //Prompts the user to enter a legal value between 1 and 6.
                    
                    System.out.println("Input not recognised. Please select one of the options (1-8).");
                    break;  
            } 
        } while (userInput !=8);
    }
}
