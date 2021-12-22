/*
  * header stuff
*/

import java.awt.*;
import javax.swing.*;

public class ButtonsSample{

  public static void main(String[] args) {

    // custom colors
    Color purple = new Color(148,0,211);
    Color royalBlue = new Color(6, 5, 223);
    Color gold = new Color(207, 181, 59);
    Color green = new Color(34,139,34);

    //custom font
    Font royalFont = new Font("Times New Roman", Font.BOLD, 62);
    Font textFont = new Font("Courier", Font.PLAIN, 48);

    JFrame frame = new JFrame("Random Stuff");
    frame.setSize(800, 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // background
    JPanel background = new JPanel(new BorderLayout());
    background.setBackground(purple);
    frame.add(background);

    //sub panels
    JPanel subpanel1 = new JPanel();
    subpanel1.setBackground(royalBlue);
    subpanel1.setPreferredSize(new Dimension(550, 100));
    background.add(subpanel1, BorderLayout.NORTH);

    // label
    JLabel label = new JLabel("ROYAL");
    label.setForeground(gold);
    label.setFont(royalFont);
    subpanel1.add(label);

    // label
    ImageIcon harryStyles = new ImageIcon("harry_styles_small.jpg");
    JLabel harry = new JLabel(harryStyles);
    background.add(harry, BorderLayout.CENTER);

    //text field
    JTextField text = new JTextField(25);
    text.setFont(textFont);
    background.add(text, BorderLayout.SOUTH);
    text.setForeground(Color.red);
    text.setBackground(gold);

    // button
    JPanel buttonPanel = new JPanel(new GridLayout(2, 2));
    background.add(buttonPanel, BorderLayout.WEST);
    JButton button1 = new JButton("click me");
    buttonPanel.add(button1);
    JButton button2 = new JButton("click me");
    buttonPanel.add(button2);
    JButton button3 = new JButton("restart");
    buttonPanel.add(button3);

    // filler panel
    JPanel rightPanel = new JPanel();
    rightPanel.setBackground(green);
    background.add(rightPanel, BorderLayout.EAST);

    //make frame visible
    frame.setVisible(true);


  }

}
