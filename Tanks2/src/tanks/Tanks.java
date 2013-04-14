package tanks;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tanks extends JFrame {

    JLabel statusbar;


    public Tanks() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);

        setSize(200, 400);
        setTitle("Tanks");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

    public static void main(String[] args) {

        Tanks game = new Tanks();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    } 
}