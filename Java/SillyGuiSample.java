/*
  * header stuff
*/

import java.awt.*;
import javax.swing.*;
import java.awt.Insets;

public class SillyGuiSample{

  public static void main(String[] args) {

    // custom colors
    Color purple = new Color(148,0,211);
    Color royalBlue = new Color(6, 5, 223);
    Color gold = new Color(207, 181, 59);

    //custom font
    Font royalFont = new Font("Times New Roman", Font.BOLD, 62);

    JFrame frame = new JFrame("Random Stuff");
    frame.setSize(800, 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // background
    JPanel background = new JPanel();
    background.setBackground(purple);
    frame.add(background);
    background.setLayout(null);
    Insets inset = background.getInsets();

    //sub panels
    JPanel subpanel1 = new JPanel();
    subpanel1.setBackground(royalBlue);
    //subpanel1.setPreferredSize(new Dimension(550, 100));
    background.add(subpanel1);
    subpanel1.setBounds(inset.left + 0, inset.top + 20, 500, 80);


    // label
    JLabel label = new JLabel("ROYAL");
    label.setForeground(gold);
    label.setFont(royalFont);
    subpanel1.add(label);
    subpanel1.setBounds(inset.left + 0, inset.top + 20, 500, 80);

    // label
    ImageIcon harryStyles = new ImageIcon("harry_styles.jpg");
    JLabel harry = new JLabel(harryStyles);
    harry.setBounds(inset.left + 0, inset.top + 120, 800, 600);
    background.add(harry);

    //make frame visible
    frame.setVisible(true);


  }
}
