import java.util.ArrayList;

/**
 *Class with Language-themed questions and answers and methods that provide information we might need about them
 * @author Orfeas Galanos
 * @version 11.0.8
 */
public class Language {

    private ArrayList<String> LangQ;
    private ArrayList<String> LangA;

    /**
     * Constructor of the Language class that initialize  questions and answers
     */
    public Language() {
        LangQ = new ArrayList<>();

        LangQ.add("Ποιά λέξη ΔΕΝ είναι συνώνυμη με τη 'νηνεμία'");
        LangQ.add("..., χήνα το Γενάρη και παπί τον Αλωνάρη");
        LangQ.add("Πως γράφεται σωστά η λέξη");
        LangQ.add("Τι σημαίνει η λέξη Da στα ρώσικα");
        LangQ.add("Ποιό είναι το σωστό");
        LangQ.add("Τι έχει ο τσιγκούνης στις τσέπες του");
        LangQ.add("Ο Διάβολος έχει πολλά...");
        LangQ.add("Ποιός αγιάζει τα μέσα");
        LangQ.add("Η επιτροπή έκρινε το σπίτι κατάλληλο για διανομή. Το έκρινε δηλαδή...");
        LangQ.add("Σε τι κάρβουνα κάθεται όποιος αγωνιά για κάτι");
        LangQ.add("Συμπληρώστε την παροιμία 'Κάθε πράγμα στον καιρό του και ο κολλιός τον");
        LangQ.add("Πόσα είναι τα φωνήεντα");
        LangQ.add("Έτρεχα. Τι χρόνος είναι");
        LangQ.add("Ποιά ποτίζεται για χάρη του βασιλικού");
        LangQ.add("Ποιό είναι το σωστό");


        LangA = new ArrayList<>();

        LangA.add("Νηοψία");
        LangA.add("Άπνοια");
        LangA.add("Ηρεμία");
        LangA.add("Μπουνάτσα");
        LangA.add("Κότα");
        LangA.add("Κουνέλι");
        LangA.add("Γάτα");
        LangA.add("Κατσίκα");
        LangA.add("Κατηγορία");
        LangA.add("Κατειγορία");
        LangA.add("Κατοιγορία");
        LangA.add("Κατιγορία");
        LangA.add("Ναι");
        LangA.add("Όχι");
        LangA.add("Γειά");
        LangA.add("Αντίο");
        LangA.add("Ισόγειο");
        LangA.add("Εισόγειο");
        LangA.add("Ισόγιο");
        LangA.add("Εισόγιο");
        LangA.add("Καβούρια");
        LangA.add("Φακές");
        LangA.add("Φίδια");
        LangA.add("Μανταλάκια");
        LangA.add("ποδάρια");
        LangA.add("όπλα");
        LangA.add("παιδιά");
        LangA.add("ξαδέρφια");
        LangA.add("Ο σκοπός");
        LangA.add("Ο εχθρός");
        LangA.add("Ο νοικοκύρης");
        LangA.add("Ο πλούτος");
        LangA.add("κατοικήσιμο");
        LangA.add("κατοικημένο");
        LangA.add("κατοχικό");
        LangA.add("κατοικίδιο");
        LangA.add("Αναμμένα");
        LangA.add("Σβηστά");
        LangA.add("Μαύρα");
        LangA.add("Κόκκινα");
        LangA.add("Αύγουστο");
        LangA.add("Μάρτιο");
        LangA.add("Δεκέμβριο");
        LangA.add("Ιούλιο");
        LangA.add("7");
        LangA.add("6");
        LangA.add("5");
        LangA.add("8");
        LangA.add("Παρατατικός");
        LangA.add("Αόριστος");
        LangA.add("Παρακείμενος");
        LangA.add("Ενεστώτας");
        LangA.add("Η γλάστρα");
        LangA.add("Η τριανταφυλλιά");
        LangA.add("Η βεράντα");
        LangA.add("Η κουμαριά");
        LangA.add("Χρησιμοποιώ");
        LangA.add("Χρυσημωποιώ");
        LangA.add("Χρισιμοπιώ");
        LangA.add("Χρησυμοποιώ");

    }

    /**
     * Method about a specific question
     * @param position shows in which position is the question we want to get
     * @return a string that represents a specific question from the arraylist
     */
    public String getLangQ(int position){
        return LangQ.get(position);
    }

    /**
     * Method about a specific answer
     * @param position shows in which position is the answer we want to get
     * @return a string that represents a specific answer from the arraylist
     */
    public String getLangA(int position){
        return LangA.get(position);
    }

    /**
     * Method about the number of the Language-themed questions
     * @return an integer that represents the number of Language questions we have
     */
    public int getLangQSize(){
        return LangQ.size();
    }

    /**
     * Method about the number of the Language-themed answers
     * @return an integer that represents the number of Language answers we have
     */
    public int getLangASize(){
        return LangA.size();
    }

}