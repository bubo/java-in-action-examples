package jia.begins.examples.intro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author <a href="mailto:bozhidar@drow.bg">Bozhidar Batsov</a>
 */
public class HeySwing {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setTitle("Java Rules!");
        frame.setSize(200, 200);

        JButton button = new JButton("Press me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Swing power!");
            }
        });

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
