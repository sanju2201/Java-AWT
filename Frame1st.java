
import java.awt.*;

public class Frame1st extends Frame {
    Button b1, b2;
    TextField t1, t2;
    Choice c1, c2;
    Checkbox r1, r2, r3;
    CheckboxGroup cbg, cbg1;
    Label l1, l2;

    Frame1st() {
        setLayout(null);
        // Creating Button
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        add(b1);
        add(b2);
        b1.setBounds(50, 70, 80, 30);
        b2.setBounds(150, 70, 80, 30);

        // Creating TextField
        t1 = new TextField("Text1");
        t2 = new TextField("Text2");
        add(t1);
        add(t2);
        t1.setBounds(50, 120, 80, 30);
        t2.setBounds(150, 120, 80, 30);

        // Adding Choice
        c1 = new Choice();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        add(c1);
        c1.setBounds(50, 180, 80, 30);

        c2 = new Choice();
        // c2.add("a");
        // c2.add("b");
        // c2.add("c");
        // c2.add("d");
        for (int i = 0; i <= 100; i++) {
            c2.add(i + "");
        }
        add(c2);
        c2.setBounds(150, 180, 80, 30);

        // Adding Radio Button Optional for Selection

        cbg = new CheckboxGroup();
        r1 = new Checkbox("Male", cbg, true);
        r2 = new Checkbox("Female", cbg, false);
        r3 = new Checkbox("Child", cbg, false);
        add(r1);
        add(r2);
        add(r3);

        r1.setBounds(30, 220, 80, 30);
        r2.setBounds(130, 220, 80, 30);
        r3.setBounds(230, 220, 80, 30);

        cbg1 = new CheckboxGroup();
        r1 = new Checkbox("Schhol", cbg1, true);
        r2 = new Checkbox("College", cbg1, false);
        r3 = new Checkbox("Office", cbg1, false);

        add(r1);
        add(r2);
        add(r3);

        r1.setBounds(30, 270, 80, 30);
        r2.setBounds(130, 270, 80, 30);
        r3.setBounds(230, 270, 80, 30);

    }

    public static void main(String[] args) {
        Frame1st f = new Frame1st();
        f.setSize(500, 500);
        f.setVisible(true);

    }

}
