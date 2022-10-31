package ElementAdding;

import java.awt.*;

public class CheckBox1 extends Frame {
    Button b1;
    Checkbox c1, c2, c3;

    CheckBox1() {
        GridLayout g = new GridLayout(4, 1);
        setLayout(g);
        b1 = new Button("OK");
        c1 = new Checkbox("C");
        c2 = new Checkbox("C++");
        c3 = new Checkbox("Java");
        add(c1);
        add(c2);
        add(c3);
        add(b1);

    }

    public static void main(String[] args) {
        CheckBox1 cb = new CheckBox1();
        cb.setSize(200, 300);
        cb.setVisible(true);
    }
}
