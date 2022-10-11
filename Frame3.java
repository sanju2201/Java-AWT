import java.awt.*;
import java.awt.event.*;

public class Frame3 extends Frame implements ActionListener {

    Button b1, b2;
    Label l1, l2;
    TextField t1, t2;

    Frame3() {
        setLayout(null);

        l1 = new Label("Name");
        l2 = new Label("Mob. No.");
        add(l1);
        add(l2);
        l1.setBounds(80, 100, 100, 30);
        l2.setBounds(80, 150, 100, 30);

        t1 = new TextField("Text1");
        t2 = new TextField("Text2");
        add(t1);
        add(t2);
        t1.setBounds(200, 100, 100, 30);
        t2.setBounds(200, 150, 100, 30);

        b1 = new Button("OK");
        b2 = new Button("Cancel");
        add(b1);
        add(b2);
        b1.setBounds(140, 220, 70, 30);
        b2.setBounds(220, 220, 70, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public static void main(String[] args) {
        Frame3 x = new Frame3();
        x.setSize(400, 350);
        x.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // System.out.println("A");

        }
        if (e.getSource() == b2) {
            // System.out.println("B");

        }

    }

}
