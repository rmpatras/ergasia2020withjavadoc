import java.util.ArrayList;

/**
 *Class with Sports-themed questions and answers and methods that provide information we might need about them
 * @author Orfeas Galanos
 * @version 11.0.8
 */
public class Sports {

    private ArrayList<String> SportQ;
    private ArrayList<String> SportA;

    /**
     * Constructor of the Sports class that initialize  questions and answers
     */
    public Sports() {
        SportQ = new ArrayList<>();

        SportQ.add("Σε ποιό αγώνισμα κέρδισε χρυσό μετάλιο ο Σπύρος Λούης");
        SportQ.add("Με πόσους παίχτες αγωνίζεται κάθε ομάδα στο μπάσκετ");
        SportQ.add("Πόσες περιόδους έχει ένας αγώνας μπάσκετ");
        SportQ.add("Μασκότ για τους Ολυμπιακούς αγώνες του 2004 ήταν οι");
        SportQ.add("Πότε ιδρύθηκε ο Παναθηναϊκός");
        SportQ.add("Έδρα της ποδοσφαιρικής ομάδας του Ολυμπιακού είναι...");
        SportQ.add("Σε ποιό αγώνισμα είναι χρυσός ολυμπιονίκης ο Λ. Πετρούνιας");
        SportQ.add("Πότε έγιναν οι πιό πρόσφατοι Ολυμπιακοί Αγώνες της Αθήνας");
        SportQ.add("Σε ποιά Ιταλική πόλη εδρεύει η ποδοσφαιρική ομάδα Λάτσιο");
        SportQ.add("Ποιά είναι η μόνη ελληνική ομάδα που έχει συμμετάσχει σε τελικό Κυπέλλου Πρωταθλητριών");
        SportQ.add("Σε ποιά πόλη βρίσκεται το στάδιο Γουέμπλεϊ");
        SportQ.add("Ποιά ομάδα αναδείχθηκε πρωταθλήτρια Ελλάδας στο ποδόσφαιρο την αγωνιστική περίοδο 2018-2019");
        SportQ.add("Ποιά είναι η πρώτη ελληνική ομάδα που κατέκτησε το κύπελλο της Ευρωλίγκα το 1996");
        SportQ.add("Ποιά είναι η συντομογραφία του ποδοσφαιρικού τμήματος της Barcelona");
        SportQ.add("Ποιό άθλημα είναι η χειροσφαίριση");


        SportA = new ArrayList<>();

        SportA.add("Μαραθώνιο");
        SportA.add("Άλμα εις μήκος");
        SportA.add("200 μέτρα");
        SportA.add("Σφαιροβολία");
        SportA.add("5");
        SportA.add("6");
        SportA.add("4");
        SportA.add("10");
        SportA.add("4");
        SportA.add("3");
        SportA.add("5");
        SportA.add("6");
        SportA.add("Φοίβος-Αθηνά");
        SportA.add("Δίας-Ήρα");
        SportA.add("Φοίβος-Άρτεμη");
        SportA.add("Άρης-Αφροδίτη");
        SportA.add("1908");
        SportA.add("1926");
        SportA.add("1896");
        SportA.add("1945");
        SportA.add("το Γ. Καραϊσκάκης");
        SportA.add("η Λεωφόρος");
        SportA.add("το Καυτατζόγλειο");
        SportA.add("η Τούμπα");
        SportA.add("Κρίκοι");
        SportA.add("Κολύμβηση");
        SportA.add("Μαραθώνας");
        SportA.add("Άλμα επί κοντώ");
        SportA.add("2004");
        SportA.add("2007");
        SportA.add("2000");
        SportA.add("2008");
        SportA.add("Ρώμη");
        SportA.add("Μιλάνο");
        SportA.add("Γένοβα");
        SportA.add("Νάπολη");
        SportA.add("Παναθηναϊκός");
        SportA.add("Ολυμπιακός");
        SportA.add("Λάρισα");
        SportA.add("ΑΕΚ");
        SportA.add("Λονδίνο");
        SportA.add("Εδιμβούργο");
        SportA.add("Μαδρίτη");
        SportA.add("Βερολίνο");
        SportA.add("ΠΑΟΚ");
        SportA.add("ΑΕΚ");
        SportA.add("Ολυμπιακός");
        SportA.add("Παναθηναϊκός");
        SportA.add("Παναθηναϊκός");
        SportA.add("ΠΑΟΚ");
        SportA.add("Ολυμπιακός");
        SportA.add("ΑΕΚ");
        SportA.add("FCB");
        SportA.add("CBF");
        SportA.add("CFB");
        SportA.add("BFC");
        SportA.add("Χάντμπολ");
        SportA.add("Βόλεϊ");
        SportA.add("Ποδόσφαιρο");
        SportA.add("Μπάσκετ");

    }

    /**
     * Method about a specific question
     * @param position shows in which position is the question we want to get
     * @return a string that represents a specific question from the arraylist
     */
    public String getSportQ(int position){
        return SportQ.get(position);
    }

    /**
     * Method about a specific answer
     * @param position shows in which position is the answer we want to get
     * @return a string that represents a specific answer from the arraylist
     */
    public String getSportA(int position){
        return SportA.get(position);
    }

    /**
     * Method about the number of the Sports-themed questions
     * @return an integer that represents the number of Sports questions we have
     */
    public int getSportQSize(){
        return SportQ.size();
    }

    /**
     * Method about the number of the Sports-themed answers
     * @return an integer that represents the number of Sports answers we have
     */
    public int getSportASize(){
        return SportA.size();
    }

}