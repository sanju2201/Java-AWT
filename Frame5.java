import java.awt.*;
import java.awt.event.*;

public class Frame5 extends Frame implements ActionListener {
    Button b1;
    Choice ch1, ch2;
    Label l1, l2;

    Frame5() {
        setLayout(null);
        l1 = new Label("Item");
        add(l1);
        l1.setBounds(100, 50, 100, 30);

        l2 = new Label("Quantity");
        add(l2);
        l2.setBounds(100, 100, 100, 30);

        ch1 = new Choice();
        ch1.add("Pizza");
        ch1.add("Pasta");
        add(ch1);
        ch1.setBounds(250, 50, 100, 30);

        ch2 = new Choice();
        ch2.add("1");
        ch2.add("2");
        ch2.add("3");
        add(ch2);
        ch2.setBounds(250, 100, 100, 30);

        b1 = new Button("Totel Price");
        add(b1);
        b1.setBounds(250, 150, 80, 30);
        b1.addActionListener(this);

    }

    public static void main(String[] args) {
        Frame5 fr = new Frame5();
        fr.setSize(400, 300);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int pizzaPrice = 100;
            int pastaPrice = 75;
            if (ch1.getSelectedItem().equals("Pizza")) {
                int a = Integer.parseInt(ch2.getSelectedItem());
                System.out.println(a * pizzaPrice);

            } else if (ch1.getSelectedItem().equals("Pasta")) {
                int a = Integer.parseInt(ch2.getSelectedItem());
                System.out.println(a * pastaPrice);

            }
        }

    }

}
