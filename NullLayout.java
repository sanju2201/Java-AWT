import java.awt.*;

public class NullLayout extends Frame {
    Button b1, b2, b3;

    NullLayout() {
        setLayout(null);
        b1 = new Button("Ok");
        b2 = new Button("CANCEL");
        b3 = new Button("SUBMIT");
        add(b1);
        add(b2);
        add(b3);

        b1.setBounds(100, 70, 80, 30);
        b2.setBounds(190, 70, 80, 30);
        b3.setBounds(100, 110, 170, 30);

    }

    public static void main(String[] args) {
        NullLayout nl = new NullLayout();
        nl.setSize(500, 200);
        nl.setVisible(true);
    }

}
