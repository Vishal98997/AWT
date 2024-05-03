import java.awt.*;
import java.awt.event.*;

class SameClassListener implements ActionListener {
    Frame f;
    Button b, b1;
    TextField tf;

    SameClassListener(String s) {
        f = new Frame(s);
        b = new Button("OK");
        b1 = new Button("CANCEL");
        b.setBounds(20, 100, 40, 40);
        b1.setBounds(20, 180, 40, 40);
        b.addActionListener(this);
        b1.addActionListener(this);
        f.add(b);
        f.add(b1);
        tf = new TextField();
        tf.setBounds(20, 40, 100, 40);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Inside actionPerformed");
        if (e.getSource() == b)
            tf.setText("OK");
        if (e.getSource() == b1)
            tf.setText("CANCEL");
    }

    public static void main(String args[]) {
        new SameClassListener("Event Demo");
    }
}
