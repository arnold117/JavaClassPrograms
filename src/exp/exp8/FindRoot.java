package exp.exp8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindRoot {
    private JTextField textField_a;
    private JTextField textField_b;
    private JTextField textField_c;
    private JButton calculateButton;
    private JTextArea textArea1;
    private javax.swing.JPanel JPanel;

    public FindRoot() {
        calculateButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == calculateButton){
                        double a = Double.parseDouble(textField_a.getText());
                        double b = Double.parseDouble(textField_b.getText());
                        double c = Double.parseDouble(textField_c.getText());
                        String str = calRoot(a, b, c);
                        textArea1.append(str);
                    }
                } catch (Exception exception) {
                    textArea1.append("Please Enter the coefficient!!!\n");
                }
            }
        });
    }

    public String calRoot(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        double root1, root2;

        if (a == 0) {
            return "This is not a Binary linear equation!!!\n";
        } else {
            if (delta < 0) {
                return  "No real root!\n";
            } else if (delta == 0) {
                root1 = (-b)/(2*a);
                return  "Have one root: x = " + root1 + ".\n";
            } else {
                root1 = (-b - Math.sqrt(delta))/(2*a);
                root2 = (-b + Math.sqrt(delta))/(2*a);
                return  "Have two roots: x1 = " + root1 + ", and x2 = " + root2 + ".\n";
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FindRoot");
        frame.setContentPane(new FindRoot().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
