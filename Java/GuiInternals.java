/*
  * header stuff
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiInternals extends JPanel{
  //inherits all methods and attributes of JPanel

  // attributes (additional to what exist in a JPanel)
  private JButton button1, button2, button3;
  private JTextField text;
  private JLabel label, harry;
  private ImageIcon harryStyles;


  //method (additional to JPanel methods )
  public GuiInternals(){

    Consequences listener = new Consequences();
      // ^This is an object that allows us to listen to respponsive elements

    // custom colors
    Color purple = new Color(148,0,211);
    Color royalBlue = new Color(6, 5, 223);
    Color gold = new Color(207, 181, 59);
    Color green = new Color(34,139,34);

    //custom font
    Font royalFont = new Font("Times New Roman", Font.BOLD, 62);
    Font textFont = new Font("Courier", Font.PLAIN, 48);

    // NOT IN BACKGROUND!!!
    // JFrame frame = new JFrame("Random Stuff");
    // frame.setSize(800, 800);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // background
    //JPanel background = new JPanel(new BorderLayout()); <-- class IS bacground!
    //background.setBackground(purple); <-- method is in class, technically
    setBackground(purple);
    //frame.add(background); <--- NOT IN BACKGROUND

    //sub panels
    JPanel subpanel1 = new JPanel();
    subpanel1.setBackground(royalBlue);
    subpanel1.setPreferredSize(new Dimension(550, 100));
    //background.add(subpanel1, BorderLayout.NORTH);
    add(subpanel1, BorderLayout.NORTH);

    // label
    JLabel label = new JLabel("ROYAL");
    label.setForeground(gold);
    label.setFont(royalFont);
    subpanel1.add(label);

    // label
    ImageIcon harryStyles = new ImageIcon("harry_styles_small.jpg");
    JLabel harry = new JLabel(harryStyles);
    //background.add(harry, BorderLayout.CENTER);
    add(harry, BorderLayout.CENTER);

    //text field
    JTextField text = new JTextField(25); //RESPONSIVE!!
    text.setFont(textFont);
    //background.add(text, BorderLayout.SOUTH);
    add(text, BorderLayout.SOUTH);
    text.setForeground(Color.red);
    text.setBackground(gold);

    // button
    JPanel buttonPanel = new JPanel(new GridLayout(2, 2));
    //background.add(buttonPanel, BorderLayout.WEST);
    add(buttonPanel, BorderLayout.WEST);
    JButton button1 = new JButton("click me");
    buttonPanel.add(button1);
    JButton button2 = new JButton("click me");
    buttonPanel.add(button2);
    JButton button3 = new JButton("restart");
    buttonPanel.add(button3);
    JButton button4 = new JButton("click me");
    buttonPanel.add(button4);

    // filler panel
    JPanel rightPanel = new JPanel();
    rightPanel.setBackground(green);
    //background.add(rightPanel, BorderLayout.EAST);
    add(rightPanel, BorderLayout.EAST);

    //make frame visible
    //frame.setVisible(true); <-- there is no frame!

  }

  private class Consequences implements ActionListener {

      public void actionPerformed(ActionEvent event){
          if (event.getSource() == button1){
              text.setText("Something");
          }
          else if (event.getSource() == text){
              label.setText(text.getText());
          }
          else if (event.getSource() == button2){
              harryStyles = new ImageIcon("Dirty-Harry-2.jpg");
              harry.setIcon(harryStyles);
          }
          else if (event.getSource() == button3){
              harryStyles = new ImageIcon("harry_styles_small.jpg");
              harry.setIcon(harryStyles);
              label.setText("ROYAL");
              text.setText("");
          }
          else{
              label.setFont(textFont);
              label.setColor(green);
          }
      }

  }

}
