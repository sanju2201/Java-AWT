import java.awt.*;
import java.awt.event.*;

public class Frame4 extends Frame implements ActionListener {
    Button b1;
    Label l1, l2, l3;
    Choice ch1, ch2, ch3;

    Frame4() {
        setLayout(null);

        b1 = new Button("Total");
        add(b1);
        b1.setBounds(250, 220, 80, 30);
        b1.addActionListener(this);

        l1 = new Label("Marks_01");
        add(l1);
        l1.setBounds(100, 50, 80, 30);

        l2 = new Label("Marks_02");
        add(l2);
        l2.setBounds(100, 100, 80, 30);

        l3 = new Label("Marks_03");
        add(l3);
        l3.setBounds(100, 150, 80, 30);

        ch1 = new Choice();
        ch1.add("100");
        ch1.add("90");
        ch1.add("80");
        add(ch1);
        ch1.setBounds(250, 50, 80, 30);

        ch2 = new Choice();
        ch2.add("100");
        ch2.add("90");
        ch2.add("80");
        add(ch2);
        ch2.setBounds(250, 100, 80, 30);

        ch3 = new Choice();
        for (int i = 100; i > 0; i = i - 10) {
            ch3.add(i + "");
        }
        // ch3.add("100");
        // ch3.add("90");
        // ch3.add("80");
        add(ch3);
        ch3.setBounds(250, 150, 80, 30);

    }

    public static void main(String[] args) {
        Frame4 fr = new Frame4();
        fr.setSize(425, 300);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String st1 = ch1.getSelectedItem();

            int a = Integer.parseInt(st1);
            int b = Integer.parseInt(ch2.getSelectedItem());
            int c = Integer.parseInt(ch3.getSelectedItem());
            System.out.println(a + b + c);

        }

    }

}
