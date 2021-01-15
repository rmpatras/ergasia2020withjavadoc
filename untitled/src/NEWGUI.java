import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NEWGUI extends JFrame {

    private JMenuBar menu;
    private JMenu file;
    private JMenu help;
    private JButton newgame;
    private JPanel panel;
    private String name1;
    private boolean CorrectAnswer;

    public NEWGUI(){
        setTitle("BUZZMENO QUIZZ");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        menu=new JMenuBar();
        panel=new JPanel();



        makeFile();
        makeNewGame();
        makeHelp();

        setJMenuBar(menu);
        add(panel);
        setVisible(true);


    }

    public void makeFile(){
        file = new JMenu("Αρχείο");
        menu.add(file);
        JLabel label=new JLabel(" ");
        add(label);
        JMenuItem menuFileOpen = new JMenuItem("Άνοιγμα");
        menuFileOpen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Έκανες κλικ στο άνοιγμα");
                label.setBounds(500,500,label.getPreferredSize().width,label.getPreferredSize().height);
            }
        });
        file.add(menuFileOpen);

        JMenuItem menuFileQuit = new JMenuItem("Έξοδος από το πρόγραμμα");
        menuFileQuit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //
            }
        });
        file.add(menuFileQuit);
    }

    public void makeNewGame(){
        newgame=new JButton("Νεο παιχνιδι");
        menu.add(newgame);
        JButton pl1=new JButton(" ");
        JButton pl2=new JButton(" ");
        newgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl1.setVisible(true);
                pl1.setText("1 ΠΑΙΚΤΗΣ");
                pl1.setBounds(400,200,400,100);

            }
        });
        add(pl1);
        pl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl1.setVisible(false);
                pl2.setVisible(false);
                JLabel l=new JLabel("Πληκτρολογησε ονομα παικτη 1");
                add(l);
                l.setBounds(300,400,200,100);
                JTextField nam1=new JTextField(" ");
                add(nam1);
                nam1.setBounds(500,425,200,50);
                nam1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        name1=nam1.getText();
                        nam1.setVisible(false);
                        l.setVisible(false);
                        startgame(1);
                    }
                });

            }
        });



    }

    public void startgame(int i){
        JLabel result=new JLabel(" ");
        add(result);
        result.setBounds(200,100,300,100);
        result.setFont(Font.decode("Verdana-bold-30"));
        Player play1=new Player();
        Round round=new Round();
        Category categ=new Category();
        ArrayList<String> AllQuestions= categ.getQuestions();
        ArrayList<String> AllAnswers=categ.getAnswers();

        boolean EndOfGame=false;
        int CurrentRound=round.getRound();
        int TP=play1.getTotalPoints();
        while (!EndOfGame) {
            int round1=round.randomNumber(2);

            for (int numOfQuest = 0; numOfQuest <7; numOfQuest++) {

                int k = round.randomNumber(categ.QuestionsSize(AllQuestions));

                System.out.println();


                JLabel tOfCat=new JLabel(" ");
                add(tOfCat);
                tOfCat.setOpaque(true);
                tOfCat.setText(categ.TypeOfCategory(k));
                tOfCat.setBounds(550,25,400,100);
                tOfCat.setFont(Font.decode("Verdana-bold-20"));
                System.out.println();




                JLabel tOfRound=new JLabel(" ");
                add(tOfRound);
                tOfRound.setOpaque(true);
                tOfRound.setBounds(400,5,600,25);
                tOfRound.setFont(Font.decode("Verdana-bold-20"));

                int bet=0;
                if(round1==0){
                    tOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ :  ΣΩΣΤΗ ΑΠΑΝΤΗΣΗ!!!!");
                }
                else if (round1== 1) {
                    tOfRound.setText("ΤΥΠΟΣ ΓΥΡΟΥ :  ΠΟΝΤΑΡΙΣΜΑ!!!!");
                }

                JLabel question=new JLabel(" ");
                add(question);
                question.setOpaque(true);
                question.setBounds(100,350,1000,100);
                question.setFont(Font.decode("Verdana-bold-15"));
                question.setText(categ.getQuestion(k));
                System.out.println(categ.getQuestion(k));


                String[] curAnsw=categ.curansers(k);
                JButton answ1=new JButton(" ");
                JButton answ2=new JButton(" ");
                JButton answ3=new JButton(" ");
                JButton answ4=new JButton(" ");
                add(answ1);
                add(answ2);
                add(answ3);
                add(answ4);

                answ1.setText(curAnsw[0]);
                answ1.setBounds(150,450,500,100);
                answ2.setText(curAnsw[1]);
                answ2.setBounds(650,450,500,100);
                answ3.setText(curAnsw[2]);
                answ3.setBounds(150,550,500,100);
                answ4.setText(curAnsw[3]);
                answ4.setBounds(650,550,500,100);



                answ1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CorrectAnswer=categ.TemporaryAnswers(k,curAnsw,1);

                        if(CorrectAnswer){
                            result.setText("ΣΩΣΤΑ!!!!!");
                            result.setForeground(Color.GREEN);
                            answ1.setOpaque(false);
                        }
                        else {
                            result.setText("ΛΑΘΟΣ!!!!!");
                            result.setForeground(Color.RED);
                            answ1.setOpaque(false);
                        }
                        tOfCat.setVisible(false);
                        tOfRound.setVisible(false);
                        question.setVisible(false);
                        answ1.setVisible(false);
                        answ2.setVisible(false);
                        answ3.setVisible(false);
                        answ4.setVisible(false);
                    }

                });
                answ2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        boolean CorrectAnswer=categ.TemporaryAnswers(k,curAnsw,2);

                        if(CorrectAnswer){
                            result.setText("ΣΩΣΤΑ!!!!!");
                            result.setForeground(Color.GREEN);
                            answ2.setOpaque(false);
                        }
                        else {
                            result.setText("ΛΑΘΟΣ!!!!!");
                            result.setForeground(Color.RED);
                            answ2.setOpaque(false);
                        }
                        tOfCat.setVisible(false);
                        tOfRound.setVisible(false);
                        question.setVisible(false);
                        answ1.setVisible(false);
                        answ2.setVisible(false);
                        answ3.setVisible(false);
                        answ4.setVisible(false);
                    }
                });
                answ3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        boolean CorrectAnswer=categ.TemporaryAnswers(k,curAnsw,3);

                        if(CorrectAnswer){
                            answ3.setOpaque(false);
                            result.setText("ΣΩΣΤΑ!!!!!");
                            result.setForeground(Color.GREEN);
                        }
                        else {
                            result.setText("ΛΑΘΟΣ!!!!!");
                            result.setForeground(Color.RED);
                            answ3.setOpaque(false);
                        }
                        tOfCat.setVisible(false);
                        tOfRound.setVisible(false);
                        question.setVisible(false);
                        answ1.setVisible(false);
                        answ2.setVisible(false);
                        answ3.setVisible(false);
                        answ4.setVisible(false);
                    }
                });
                answ4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        boolean CorrectAnswer=categ.TemporaryAnswers(k,curAnsw,4);

                        if(CorrectAnswer){
                            result.setText("ΣΩΣΤΑ!!!!!");
                            result.setForeground(Color.GREEN);
                            answ4.setOpaque(false);
                        }
                        else {
                            result.setText("ΛΑΘΟΣ!!!!!");
                            result.setForeground(Color.RED);
                            answ4.setOpaque(false);
                        }
                        tOfCat.setVisible(false);
                        tOfRound.setVisible(false);
                        question.setVisible(false);
                        answ1.setVisible(false);
                        answ2.setVisible(false);
                        answ3.setVisible(false);
                        answ4.setVisible(false);
                    }
                });

            }

            round.changeRound();
            CurrentRound=round.getRound();
            EndOfGame=FinishGame(CurrentRound);

        }

    }

    public boolean FinishGame(int round){
        if(round>=7){
            return true;
        }
        return false;
    }





    public void  makeHelp(){
        help=new JMenu("Βοήθεια");
        menu.add(help);
        JLabel lab=new JLabel(" ");
        add(lab);
        JMenuItem instru=new JMenuItem("Οδηγιες παιχνιδιου");
        instru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("odhgies ");
                lab.setBounds(500,500,lab.getPreferredSize().width,lab.getPreferredSize().height);
            }
        });
        help.add(instru);

    }

    public static void main(String[] args){
        NEWGUI g=new NEWGUI();
    }

}
