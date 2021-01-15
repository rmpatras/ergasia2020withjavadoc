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
