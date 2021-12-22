import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Insets;


public class CalculatorGuduru{
    // attributes

    //methods




    public static void main(String[] args) {


        String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "X", "/", ".", "=", "C"};
        JButton[] buttons = new JButton[17];

        Color purple = new Color(148,0,211);
        Color royalBlue = new Color(6, 5, 223);
        Color white = new Color (255, 255, 255);


        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel background = new JPanel(new BorderLayout());
        background.setBackground(purple);
        frame.add(background);
        Insets inset = background.getInsets();

        background.setLayout(new BoxLayout(background, BoxLayout.Y_AXIS));

        //reference : https://stackoverflow.com/questions/22240066/put-a-jtextfield-on-a-jpanel

        JTextField textField = new JTextField(20);
        textField.setPreferredSize(new Dimension(170, 20));
        background.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel1 = new JPanel();
        background.add(buttonPanel1, BorderLayout.CENTER);
        for (int i = 0; i <= 9; i++){
            buttons[i] = new JButton(numbers[i]);
            buttonPanel1.add(buttons[i]);

        }
        JPanel buttonPanel2 = new JPanel();
        background.add(buttonPanel2, BorderLayout.CENTER);
        for (int i = 0; i <= 5; i++){
            buttons[i+10] = new JButton(numbers[i+10]);
            buttonPanel2.add(buttons[i+10]);

        }

        JPanel colorPanel1 = new JPanel();
        colorPanel1.setBackground(purple);
        background.add(colorPanel1);

        JPanel colorPanel2 = new JPanel();
        colorPanel2.setBackground(royalBlue);
        background.add(colorPanel2);

        ImageIcon texasInstruments = new ImageIcon("texasinstruments.jpeg");
        JLabel texas = new JLabel(texasInstruments);
        background.add(texas);




        frame.setVisible(true);

    }
}
