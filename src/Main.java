import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{


    public static void main(String[] args) {
        //Main Frame
        JFrame buttons = new JFrame("Calculator");
        buttons.setSize(600,600);
        buttons.setLocationRelativeTo(null);
        buttons.setBackground(Color.gray);
        buttons.setVisible(true);

        //Button Frame
//        JPanel buttons = new JPanel();

        buttons.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();




        buttons.setVisible(true);
        buttons.setSize(600,500);
        buttons.setBackground(Color.BLACK);
        buttons.setLocation(0,60);

        JButton zero = new JButton();
        zero.setText("0");
        zero.setFont(new Font(null,Font.BOLD,60));
        zero.setVisible(true);
        zero.setSize(70,70);
        gbc.gridx = 0;
        gbc.gridy=0;
        buttons.add(zero,gbc);

        JButton one = new JButton();
        one.setText("1");
        one.setFont(new Font(null,Font.BOLD,60));
        one.setVisible(true);
        one.setSize(60,40);
        gbc.gridx = 1;
        gbc.gridy=1;
        buttons.add(one,gbc);

        JButton two = new JButton();
        two.setText("2");
        two.setFont(new Font(null,Font.BOLD,60));
        two.setVisible(true);
        two.setSize(70,70);
        gbc.gridx = 2;
        gbc.gridy=2;
        buttons.add(two,gbc);

//        JButton three = new JButton();
//        three.setText("3");
//        three.setFont(new Font(null,Font.BOLD,60));
//        three.setVisible(true);
//        three.setSize(70,70);
////        gbc.gridx = 0;
////        gbc.gridy=0;
//
//        JButton four = new JButton();
//        four.setText("4");
//        four.setFont(new Font(null,Font.BOLD,60));
//        four.setVisible(true);
//        four.setSize(70,70);
////        gbc.gridx = 0;
////        gbc.gridy=0;
//
//        JButton five = new JButton();
//        five.setText("5");
//        five.setFont(new Font(null,Font.BOLD,60));
//        five.setVisible(true);
//        five.setSize(70,70);
////        gbc.gridx = 0;
////        gbc.gridy=0;
//
//        JButton six = new JButton();
//        six.setText("6");
//        six.setFont(new Font(null,Font.BOLD,60));
//        six.setVisible(true);
//        six.setSize(70,70);
////        gbc.gridx = 0;
////        gbc.gridy=0;
//
//        JButton seven = new JButton();
//        seven.setText("7");
//        seven.setFont(new Font(null,Font.BOLD,60));
//        seven.setVisible(true);
//        seven.setSize(70,70);
////        gbc.gridx = 0;
////        gbc.gridy=0;
//
//        JButton eight = new JButton();
//        eight.setText("8");
//        eight.setFont(new Font(null,Font.BOLD,60));
//        eight.setVisible(true);
//        eight.setSize(70,70);
////        gbc.gridx = 0;
////        gbc.gridy=0;
//
//        JButton nine = new JButton();
//        nine.setHorizontalAlignment(SwingConstants.CENTER);
//        nine.setText("9");
//        nine.setFont(new Font(null,Font.BOLD,60));
//        nine.setVisible(true);
//        nine.setSize(70,70);
////        gbc.gridx = 0;
////        gbc.gridy=0;

//        buttons.add(zero,gbc);
//        buttons.add(one,gbc);
//        buttons.add(two,gbc);
//        buttons.add(three,gbc);
//        buttons.add(four,gbc);
//        buttons.add(five,gbc);
//        buttons.add(six,gbc);
//        buttons.add(seven,gbc);
//        buttons.add(eight,gbc);
//        buttons.add(nine,gbc);



//        frame.setLayout(new GridLayout(4,3,5,5));

//        frame.pack();


        //comps

        JLabel label = new JLabel();
        label.setVisible(true);

    }
}
