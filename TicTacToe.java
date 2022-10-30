import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends Frame implements ActionListener {

    int t = 1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    TicTacToe() {
        setLayout(null);
        b1 = new Button("");
        b1.setBounds(50, 50, 100, 100);
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("");
        b2.setBounds(200, 50, 100, 100);
        add(b2);
        b2.addActionListener(this);

        b3 = new Button("");
        b3.setBounds(350, 50, 100, 100);
        add(b3);
        b3.addActionListener(this);

        b4 = new Button("");
        b4.setBounds(50, 200, 100, 100);
        add(b4);
        b4.addActionListener(this);

        b5 = new Button("");
        b5.setBounds(200, 200, 100, 100);
        add(b5);
        b5.addActionListener(this);

        b6 = new Button("");
        b6.setBounds(350, 200, 100, 100);
        add(b6);
        b6.addActionListener(this);

        b7 = new Button("");
        b7.setBounds(50, 350, 100, 100);
        add(b7);
        b7.addActionListener(this);

        b8 = new Button("");
        b8.setBounds(200, 350, 100, 100);
        add(b8);
        b8.addActionListener(this);

        b9 = new Button("");
        b9.setBounds(350, 350, 100, 100);
        add(b9);
        b9.addActionListener(this);

    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();
        ttt.setVisible(true);
        ttt.setSize(500, 500);

    }

    public void actionPerformed(ActionEvent e) {

    }

}
