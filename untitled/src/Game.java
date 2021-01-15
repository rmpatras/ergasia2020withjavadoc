import java.util.ArrayList;

/**
 * Represents the whole game and when it should end
 * @author Rigas Batras
 * @version 11.0.8
 */
public class Game {

    private Player play1;
    private Player play2;

    /**
     * Constructor of the class
     */
    public Game(){
        play1=new Player();
        play2=new Player();
    }

    /**
     *Represents the begin of the game.Shows each time what type of category is the question
     we going to see and considering this informs the points the player got or lost in this round and also provides
     that a question won't display second time in the same game
     */
    public void Play(int pl){

        System.out.println("Δώσε όνομα: ");
        String name= play1.getAnswer();
        System.out.println();
        if(pl==2){
            System.out.println("Δώσε όνομα παίκτη 2: ");
            String name2= play2.getAnswer();
            System.out.println();

        }

        Round round=new Round();
        Category categ=new Category();
        ArrayList<String> AllQuestions= categ.getQuestions();
        ArrayList<String> AllAnswers=categ.getAnswers();

        boolean EndOfGame=false;
        int CurrentRound=round.getRound();
        int TP=play1.getTotalPoints();
        int TP2;
        if(pl==2){
            TP2=play2.getTotalPoints();
        }
        while (!EndOfGame) {

            int sumOfAns1,sumOfAns2;
            int round1=round.TypeOfRound();

            for (int numOfQuest = 0; numOfQuest <6; numOfQuest++) {

                int k = round.randomNumber(categ.QuestionsSize(AllQuestions));

                System.out.println();

                categ.TypeOfCategory(k);
                System.out.println();


                String playerBet ="0";

                int bet=0;
                if (round1== 1) {
                    System.out.println("Πόνταρε 250,500,750 ή 1000");

                    playerBet = play1.getAnswer();

                    while (!round.ValidBet(playerBet)) {
                        playerBet = play1.getAnswer();
                    }

                    bet = Integer.parseInt(playerBet);
                }
                else if(round1==4 && numOfQuest==0 ){
                    sumOfAns1=0;
                    sumOfAns2=0;
                }
                System.out.println(categ.getQuestion(k));


                String[] curans=categ.curansers(k);
                boolean CorrectAnswer=categ.TemporaryAnswers(k,curans,1);

                if (CorrectAnswer && (round1== 0)) {
                    TP=play1.ChangeTotalPoints(1000);
                } else if (CorrectAnswer && (round1== 1)) {
                    TP=play1.ChangeTotalPoints(bet);
                } else if (!CorrectAnswer && (round1== 1)) {
                    TP=play1.ChangeTotalPoints(-bet);
                }
                /*else if (CorrectAnswer && (round1==4)){
                    play1.

                }

                 */
                categ.RemoveAnswers(AllAnswers,k);

                System.out.println();

                categ.RemoveQuestion(AllQuestions,k);


                System.out.println();
                System.out.println();
                System.out.println();
            }

            round.changeRound();
            CurrentRound=round.getRound();
            EndOfGame=FinishGame(CurrentRound);
        }

        System.out.printf("%s Score: %d %n",name,TP);
        System.out.println("Thanks for playing.Hope see you again");
    }

    /**
     *
     * @param round represents the current round we are in-game
     * @return a boolean value that depends if the game must finish or not
     */
    public boolean FinishGame(int round){
        if(round>=7){
            return true;
        }
        return false;
    }



}
