import java.awt.*;

public class ButLabTextField1 extends Frame {

    Button b1, b2;
    Label l1, l2;
    TextField t1, t2;

    ButLabTextField1() {
        GridLayout g = new GridLayout(3, 2);
        setLayout(g);
        b1 = new Button("Sign in");
        b2 = new Button("Sign up");
        l1 = new Label("Enter UserName");
        l2 = new Label("Passward");
        t1 = new TextField("Text1");
        t2 = new TextField("Text2");
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);

    }

    public static void main(String[] args) {
        ButLabTextField1 x = new ButLabTextField1();
        x.setSize(1000, 500);
        x.setVisible(true);

    }

}
