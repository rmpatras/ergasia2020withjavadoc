import java.util.ArrayList;

/**
 * Provides all necessary information we'll need for questions and answers while we are playing the game
 * @author Rigas Batras
 * @version 11.0.8
 */
public class Category {
    private ArrayList<String> Questions;
    private ArrayList<String> Answers;

    History hist;
    Technology tech;
    Food food;
    Sports sports;
    Language lang;

    private Round m;
    private Player player;


    private int maxH;
    private int maxT;
    private int maxF;
    private int maxS;
    private int maxL;

    private int hQremov;
    private int tQremov;
    private int fQremov;
    private int sQremov;
    private int lQremov;

    /**
     *Constructor of the class and initialization of the variables we ll need
     */
    public Category(){
        Questions=new ArrayList<>();
        Answers=new ArrayList<>();

        hist=new History();
        tech=new Technology();
        food=new Food();
        sports=new Sports();
        lang=new Language();

        setQuestions();
        setAnswers();

        m=new Round();
        player=new Player();


        maxH=15;
        maxT=30;
        maxF=45;
        maxS=60;
        maxL=75;

        hQremov=0;
        tQremov=0;
        fQremov=0;
        sQremov=0;
        lQremov=0;

    }

    /**
     * Initialization of all questions we gonna have for a game
     */
    public void setQuestions() {

        for (int i = 0; i < hist.getHistQSize(); i++) {
            Questions.add(hist.getHistQ(i));
        }

        for (int i=0;i< tech.getTechQSize();i++){
            Questions.add(tech.getTechQ(i));
        }
        for (int i = 0; i < food.getFoodQSize(); i++) {
            Questions.add(food.getFoodQ(i));
        }

        for (int i=0;i< sports.getSportQSize();i++){
            Questions.add(sports.getSportQ(i));
        }
        for(int i=0;i< lang.getLangQSize();i++){
            Questions.add(lang.getLangQ(i));
        }
    }

    /**
     * Initialization of all answers we gonna have for a game
     */
    public void setAnswers() {
        for(int i=0;i< hist.getHistASize();i++) {
            Answers.add(hist.getHistA(i));
        }

        for(int i =0;i< tech.getTechASize();i++){
            Answers.add(tech.getTechA(i));
        }

        for (int i = 0; i < food.getFoodASize(); i++) {
           Answers.add(food.getFoodA(i));
        }

        for (int i=0;i< sports.getSportASize();i++){
            Answers.add(sports.getSportA(i));
        }
        for(int i=0;i< lang.getLangASize();i++){
            Answers.add(lang.getLangA(i));
        }

    }

    /**
     * Method that represents all the questions
     * @return an Arraylist that contains all the questions we have
     */
    public ArrayList<String> getQuestions(){return Questions;}

    /**
     * Method that represents all the answers
     * @return an Arraylist that contains all the answers we have
     */
    public ArrayList<String> getAnswers(){return  Answers;}

    /**
     *Gets back a specific question in a specific position
     * @param position  represents the position of the question we want to get
     * @return a string that represents the question in the position we asked for
     */
    public String getQuestion(int position) { return Questions.get(position); }

    /**
     *Gets back a specific answer in a specific position
     * @param position  represents the position of the answer we want to get
     * @return a string that represents the answer in the position we asked for
     */
    public String getAnswer(int position){ return Answers.get(position); }

    /**
     *Dependent a list of questions have left to be displayed,returns the size of it
     * @param quest represents the Arraylist of the questions
     * @return an integer that represents the number of the questions we still have,so we can keep playing
     */
    public int QuestionsSize(ArrayList<String> quest){ return quest.size(); }



    /**
     * Changes the maximum size of each type of category according to the position of the last question we saw.
     And informs the whole list  so it can keep track of the correct type of category the next question belongs to ,
     in the next round  in-game
     * @param k represents the position in the list of questions of the last question that
     has been dsplayed on our screen
     */
    public void changeMax(int k){
        if(k<maxH) {
            maxH--;
            maxT--;
            maxF--;
            maxS--;
            maxL--;
        }
        else if(k<maxT){
            maxT--;
            maxF--;
            maxS--;
            maxL--;
        }
        else if(k<maxF){
            maxF--;
            maxS--;
            maxL--;
        }
        else if(k<maxS){
            maxS--;
            maxL--;
        }
    }

    /**
     *Displays the type of the category we are gonna play,according the position of the question
     it gonna be displayed and according if this type of category has any questions left to display
     or they player has answered in all of them.And updates how many questions have left in each type of category
     * @param k represents the position  of the next question
     */
    public void TypeOfCategory(int k){


        if (k <this.maxH && hQremov <15) {
            System.out.printf("\tΚΑΤΗΓΟΡΙΑ: ΙΣΤΟΡΙΑ%n");
            hQremov+=1;
        } else if (k <maxT && tQremov <15) {
            System.out.printf("\tΚΑΤΗΓΟΡΙΑ: ΤΕΧΝΟΛΟΓΙΑ%n");
            tQremov+=1;
        } else if (k <maxF && fQremov <15){
            System.out.println("ΚΑΤΗΓΟΡΙΑ: ΦΑΓΗΤΟ-ΠΟΤΟ");
            fQremov+=1;
        } else if (k <maxS && sQremov <15){
            System.out.println("ΚΑΤΗΓΟΡΙΑ:  ΑΘΛΗΤΙΚΑ");
            sQremov+=1;
        } else if (k <maxL && lQremov <15){
            System.out.println("ΚΑΤΗΓΟΡΙΑ: ΓΛΩΣΣΑ");
            maxL--;
            lQremov+=1;
        }
        else
        {
            System.out.println("No more available questions");
        }

        System.out.println();

        changeMax(k);

        System.out.println();
    }


    /**
     * Displays the answers according the question has been shown, in a random way and after it reads the answer
     from player,checks if it was  correct or not,and informs the rest of the game to adapt the player's score.
     * @param k represents the position of the question that has been displayed
     * @return a boolean that represents if the answer that the player gave was the correct or not.
     */
    public boolean TemporaryAnswers(int k){
        ArrayList<String> play1ans = new ArrayList<>();
        ArrayList<String> currentAns = new ArrayList<>();
        for (int j = k * 4; j < (k * 4) + 4; j++) {
            currentAns.add(getAnswer(j));
        }

        for (int j = 0; j < 4; j++) {
            int l=m.randomNumber(currentAns.size());
            System.out.printf("%d: \t %s %n", j + 1, currentAns.get(l));
            play1ans.add(currentAns.get(l));
            currentAns.remove(l);
        }
        System.out.println();

        String playAnswer =player.getAnswer();
        while (!m.ValidAnswer(playAnswer)) {
            playAnswer =player.getAnswer();
        }
        int playersAnswer = Integer.parseInt(playAnswer);

        System.out.println();

        boolean correctAnswer = false;

        if (play1ans.get(playersAnswer - 1).equals(getAnswer((k * 4)))) {
            System.out.printf("\tΣΩΣΤΑ!!!!! %n");
            correctAnswer = true;
        } else {
            System.out.printf("Η ΣΩΣΤΗ ΑΠΑΝΤΗΣΗ ΗΤΑΝ Η : %s %n ", getAnswer((k * 4)));
        }


        return correctAnswer;

    }

    /**
     * Updates the list of questions after a question has been displayed.
     * @param quest represents the Arraylist of all questions that are still available in-game.
     * @param position shows the position of the question we are gonna remove
     * @return an Arraylist that has no longer questions that already has been displayed
     */
    public ArrayList<String> RemoveQuestion(ArrayList<String> quest,int position){
        quest.remove(position);
        return quest;
    }

    /**
     * Updates the list of answers according the last question the player answered.
     * @param answ represents the Arraylist of all answers that are still available in-game.
     * @param position represents the position of the first answer in the list that matches
     the question that the player last answered.
     * @return an Arraylist that has no longer answers that already has been displayed
     */
    public ArrayList<String> RemoveAnswers(ArrayList<String> answ,int position){

        for (int j = position * 4, ind = 0; j < (position * 4) + 4; j++, ind++) {
            answ.remove(j - ind);
        }
        return answ;

    }
}
