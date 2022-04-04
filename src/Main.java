import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {
        //Main Frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.gray);
        frame.setVisible(true);

        //Button Frame
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridBagLayout(4,3,5,5));
        buttons.setVisible(true);
        buttons.setSize(600,500);
        buttons.setBackground(Color.BLACK);
        buttons.setLocation(0,60);
        JButton zero = new JButton();
        zero.setText("0");
        zero.setFont(new Font(null,Font.BOLD,60));
        zero.setVisible(true);
        zero.setSize(70,70);
        JButton one = new JButton();
        one.setText("1");
        one.setVisible(true);
        one.setSize(60,40);
        JButton two = new JButton();
        two.setText("2");
        two.setVisible(true);
        two.setSize(60,40);

        JButton three = new JButton();
        JButton four = new JButton();
        JButton five = new JButton();
        JButton six = new JButton();
        JButton seven = new JButton();
        JButton eight = new JButton();
        JButton nine = new JButton();
        buttons.add(zero);
        buttons.add(one);

        frame.add(buttons);
        comps

    }
}
