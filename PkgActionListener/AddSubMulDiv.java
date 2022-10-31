package PkgActionListener;

import java.awt.*;
import java.awt.event.*;

public class AddSubMulDiv extends Frame implements ActionListener {

    Button b1, b2, b3, b4;
    Label l1, l2;
    TextField t1, t2;

    AddSubMulDiv() {
        setLayout(null);

        l1 = new Label("1st Number");
        l2 = new Label("2nd Number");
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

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Multiply");
        b4 = new Button("Divide");
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.setBounds(30, 220, 70, 30);
        b2.setBounds(120, 220, 70, 30);
        b3.setBounds(210, 220, 70, 30);
        b4.setBounds(300, 220, 70, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    public static void main(String[] args) {
        AddSubMulDiv x = new AddSubMulDiv();
        x.setSize(400, 350);
        x.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // System.out.println("A");
            String x = t1.getText();
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(t2.getText());
            System.out.println(a + b);

        }
        if (e.getSource() == b2) {
            // System.out.println("B");
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            System.out.println(a - b);
        }

        if (e.getSource() == b3) {
            // System.out.println("B");
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            System.out.println(a * b);
        }

        if (e.getSource() == b4) {
            // System.out.println("B");
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            System.out.println(a / b);
        }
    }

}
