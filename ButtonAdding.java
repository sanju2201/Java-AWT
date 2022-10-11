import java.awt.*;

public class ButtonAdding extends Frame {
    Button b1, b2;

    ButtonAdding() {
        // GridLayout
        GridLayout g = new GridLayout(1, 2);
        setLayout(g);
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        ButtonAdding x = new ButtonAdding();
        x.setSize(1000, 1000);
        x.setVisible(true);
    }
}
