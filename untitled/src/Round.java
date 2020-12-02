import java.util.Random;

/**
 *Represents a round in-game and has necessary methods for different informations we might need about him
 *@author Orfeas Galanos
 * @version 11.0.8
*/
public class Round {
    private int round;
    Player player;

    /**
     * Constructor of the class
     */
    public Round(){
        round=1;
        player=new Player();
    }

    /**
     * Provides information about the current round of the game
     * @return an integer that represents the current round we are while we are playing the game
     */
    public int getRound(){return round;}

    /**
     * Changes the current round to his new value after a round we play
     */
    public void changeRound() {
        round+=1;
    }

    /**
     * Generates a random number
     * @param size represents the maximum value minus 1 of the random number we will get
     * @return an integer between 0 and the maximum value we set
     */
    public int randomNumber(int size){
        Random num=new Random();
        int k=num.nextInt(size);
        return  k;
    }

    /**
     * Shows the type of the current round we are
     * @return an integer that represents the type of the round
     */
    public int TypeOfRound(){
        int typeOfGame =randomNumber(2);

        System.out.printf("ΤΥΠΟΣ ΓΥΡΟΥ :");
        if (typeOfGame == 0) {
            System.out.printf("\tΓΡΗΓΟΡΗ ΑΠΑΝΤΗΣΗ!!!!%n");
        } else {
            System.out.printf("\tΠΟΝΤΑΡΙΣΜΑ!!!!%n");
        }
        System.out.println();
        return typeOfGame;
    }

    /**
     * Verifies if the bet that player typed is valid or not
     * @param playerBet the "value" of player's bet
     * @return a boolean that represents if the bet is valid for the game or not
     */
    public boolean ValidBet(String playerBet){
        if (playerBet.equals("250") || playerBet.equals("500") || playerBet.equals("750") || playerBet.equals("1000")) {
            return true;
        }
        System.out.println("Πόνταρε 250,500,750 ή 1000");
        return false;
    }


    /**
     * Verifies if the answer that player typed is valid or not
     * @param playerAnswer  represents what player typed as an answer
     * @return a boolean that represents if the answer is valid for the game or not
     */
    public boolean ValidAnswer(String playerAnswer){
       if ((!playerAnswer.equals("1") && !playerAnswer.equals("2") && !playerAnswer.equals("3") && !playerAnswer.equals("4"))) {
            System.out.println("Μη αποδεκτός αριθμός,πληκτρολόγησε ξανα ");
            return false;
        }
        return true;
    }

}
