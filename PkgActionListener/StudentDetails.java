package PkgActionListener;

import java.awt.*;
import java.awt.event.*;

public class StudentDetails extends Frame implements ActionListener {

    Button b1, b2;
    Label l1, l2, l3, l4, l5;
    TextField t1, t2;
    Checkbox r1, r2, r3, r4, r5;
    CheckboxGroup cbg1, cbg2;
    Choice ch1;

    StudentDetails() {
        setLayout(null);
        // Button
        b1 = new Button("Save");
        b2 = new Button("Exit");

        add(b1);
        b1.setBounds(400, 340, 100, 30);
        add(b2);
        b2.setBounds(550, 340, 100, 30);
        // Register the button to perform Action

        b1.addActionListener(this);
        b2.addActionListener(this);

        // Label
        l1 = new Label("Name");
        l2 = new Label("Mob.No.");
        l3 = new Label("Gender");
        l4 = new Label("Course");
        l5 = new Label("Branch");

        add(l1);
        l1.setBounds(100, 100, 100, 30);
        add(l2);
        l2.setBounds(400, 100, 100, 30);
        add(l3);
        l3.setBounds(100, 160, 100, 30);
        add(l4);
        l4.setBounds(100, 220, 100, 30);
        add(l5);
        l5.setBounds(100, 280, 100, 30);

        // TextField
        t1 = new TextField("Text1");
        t2 = new TextField("Text2");

        add(t1);
        t1.setBounds(250, 100, 100, 30);
        add(t2);
        t2.setBounds(550, 100, 100, 30);

        // Radio Button Choice

        cbg1 = new CheckboxGroup();
        r1 = new Checkbox("Male", cbg1, true);
        r2 = new Checkbox("Female", cbg1, false);

        add(r1);
        r1.setBounds(250, 160, 100, 30);
        add(r2);
        r2.setBounds(400, 160, 100, 30);

        cbg2 = new CheckboxGroup();
        r3 = new Checkbox("C", cbg2, true);
        r4 = new Checkbox("C++", cbg2, false);
        r5 = new Checkbox("Java", cbg2, false);

        add(r3);
        r3.setBounds(250, 220, 100, 30);
        add(r4);
        r4.setBounds(400, 220, 100, 30);
        add(r5);
        r5.setBounds(550, 220, 100, 30);

        ch1 = new Choice();
        ch1.add("CS & IT");
        ch1.add("Mechnical");
        ch1.add("ET&T");
        ch1.add("Electrical");
        ch1.add("Civil");

        add(ch1);
        ch1.setBounds(250, 280, 150, 30);

    }

    public static void main(String[] args) {
        StudentDetails f2 = new StudentDetails();
        f2.setSize(750, 450);
        f2.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("You Have Click on Save Button");
        }
        if (e.getSource() == b2) {
            System.out.println("You have Click on Exit Button");

        }

    }

}
