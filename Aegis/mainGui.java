import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainGui {

    public static void main(String[] args) {

        // Create Frame (Window)
        JFrame frame = new JFrame("Swing Button Example");

        // Create Label to display message
        JLabel label = new JLabel("", JLabel.CENTER);

        // Create Button
        JButton button = new JButton("Click Me");

        // Set layout for frame
        frame.setLayout(new BorderLayout());

        // Add button click event using ActionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("I AM CLICKED");
            }
        });

        // Add button and label to frame
        frame.add(button, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}