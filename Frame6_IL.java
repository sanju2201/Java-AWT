import java.awt.*;
import java.awt.event.*;

public class Frame6_IL extends Frame implements ItemListener {
    Choice c1;

    Frame6_IL() {
        setLayout(null);
        c1 = new Choice();
        add(c1);
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.setBounds(100, 50, 100, 30);
        c1.addItemListener(this);

    }

    public static void main(String[] args) {
        Frame6_IL fr = new Frame6_IL();
        fr.setSize(400, 300);
        fr.setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            int a = Integer.parseInt(c1.getSelectedItem());
            System.out.println(a);
        }

    }
}
