package cyber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTest {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JFrame Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Create a button
        JButton button = new JButton("Push");
        button.setBounds(100, 70, 100, 30);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello");
            }
        });

        // Add button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}