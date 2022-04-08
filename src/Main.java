/*
Rashid Imtiaz
4/1/22
CMSC 330
Project 1
 */

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        //Main Frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.white);
        frame.setVisible(true);


        //Button panel
        JPanel buttons = new JPanel();
        buttons.setSize(600, 600);
        buttons.setBackground(Color.white);
        buttons.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        buttons.setLocation(0, 60);
        buttons.setVisible(true);

        //label panel
        JLabel text = new JLabel();
        text.setBackground(Color.white);
        text.setSize(600, 50);
        text.setLocation(0, 0);
        text.setVisible(true);
        text.setText("Calculation time!");

        //Label panel
        JPanel textBox = new JPanel();
        textBox.add(text);
        textBox.setBackground(Color.white);
        textBox.setBorder(BorderFactory.createLineBorder(Color.black));
        textBox.setVisible(true);


        //Buttons
        JButton zero = new JButton();
        zero.setText("0");
        zero.setFont(new Font(null, Font.BOLD, 60));
        zero.setVisible(true);
        zero.setSize(70, 70);
        gbc.gridx = 1;
        gbc.gridy = 4;
        buttons.add(zero, gbc);

        JButton one = new JButton();
        one.setText("1");
        one.setFont(new Font(null, Font.BOLD, 60));
        one.setVisible(true);
        one.setSize(60, 40);
        gbc.gridx = 0;
        gbc.gridy = 3;
        buttons.add(one, gbc);

        JButton two = new JButton();
        two.setText("2");
        two.setFont(new Font(null, Font.BOLD, 60));
        two.setVisible(true);
        two.setSize(70, 70);
        gbc.gridx = 1;
        gbc.gridy = 3;
        buttons.add(two, gbc);

        JButton three = new JButton();
        three.setText("3");
        three.setFont(new Font(null, Font.BOLD, 60));
        three.setVisible(true);
        three.setSize(70, 70);
        gbc.gridx = 2;
        gbc.gridy = 3;
        buttons.add(three, gbc);

        JButton four = new JButton();
        four.setText("4");
        four.setFont(new Font(null, Font.BOLD, 60));
        four.setVisible(true);
        four.setSize(70, 70);
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttons.add(four, gbc);

        JButton five = new JButton();
        five.setText("5");
        five.setFont(new Font(null, Font.BOLD, 60));
        five.setVisible(true);
        five.setSize(70, 70);
        gbc.gridx = 1;
        gbc.gridy = 1;
        buttons.add(five, gbc);

        JButton six = new JButton();
        six.setText("6");
        six.setFont(new Font(null, Font.BOLD, 60));
        six.setVisible(true);
        six.setSize(70, 70);
        gbc.gridx = 2;
        gbc.gridy = 1;
        buttons.add(six, gbc);

        JButton seven = new JButton();
        seven.setText("7");
        seven.setFont(new Font(null, Font.BOLD, 60));
        seven.setVisible(true);
        seven.setSize(70, 70);
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttons.add(seven, gbc);

        JButton eight = new JButton();
        eight.setText("8");
        eight.setFont(new Font(null, Font.BOLD, 60));
        eight.setVisible(true);
        eight.setSize(70, 70);
        gbc.gridx = 1;
        gbc.gridy = 0;
        buttons.add(eight, gbc);

        JButton nine = new JButton();
        nine.setHorizontalAlignment(SwingConstants.CENTER);
        nine.setText("9");
        nine.setFont(new Font(null, Font.BOLD, 60));
        nine.setVisible(true);
        nine.setSize(70, 70);
        gbc.gridx = 2;
        gbc.gridy = 0;
        buttons.add(nine, gbc);


        //Adding panels into Jframe
        frame.add(buttons);
        frame.add(textBox);
        frame.setMinimumSize(frame.getSize());
        frame.pack();
    }
}
