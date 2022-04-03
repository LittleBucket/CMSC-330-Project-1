import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.gray);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(4,3,1,1));

    }
}
