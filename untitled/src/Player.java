import java.util.Scanner;

/**
 * Class about a player.This class provides methods about answers from player and manipulate his in-game score
 * @author Orfeas Galanos
 * @version 11.0.8
 */
public class Player {

    private Scanner reader;
    private int totalPoints;

    /**
     * Constructor of the class
     */
    public Player(){
        reader=new Scanner(System.in);
        totalPoints=0;
    }

    /**
     * Method that expect to read something from the keyboard
     * @return a string that represents what the player typed
     */
    public String getAnswer(){
        String answer;
        answer=reader.nextLine();
        return answer;
    }

    /**
     * Method that gets the player's score
     * @return an integer that represents the score of the player during the game
     */
    public int getTotalPoints(){
        return totalPoints;
    }

    /**
     * Update the current score of the player considering the new points he got
     * @param points
     * @return an integer who represent the current score updated
     */
    public int ChangeTotalPoints(int points){
        totalPoints+=points;
        return getTotalPoints();
    }

}
