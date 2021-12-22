import java.awt.*;
import javax.swing.*;
import java.awt.Insets;

public class HarryStylesGui{

    // attributes
    private Color purple, royalBlue, gold;
    private Font royalFont;
    private JFrame frame;
    private JPanel background, subpanel1;
    private Insets inset;
    private JLabel label, harry;
    private ImageIcon harryStyles;

    //methods

    //----------------------------------------------
    // main method
    //----------------------------------------------
    public static void main(String[] args) {
        new HarryStylesGui();

    }

    public HarryStylesGui(){

        //custom font
        setColorsAndFont();

        setBackground();

        //sub panels
        setSubpanel();
        background.add(subpanel1);



        frame = new JFrame("Random Stuff");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // background


        //sub panels




        // label
        label = new JLabel("ROYAL");
        label.setForeground(gold);
        label.setFont(royalFont);
        subpanel1.add(label);
        subpanel1.setBounds(inset.left + 0, inset.top + 20, 500, 80);

        // label
        harryStyles = new ImageIcon("harry_styles.jpg");
        harry = new JLabel(harryStyles);
        harry.setBounds(inset.left + 0, inset.top + 120, 800, 600);
        background.add(harry);

        //make frame visible
        frame.setVisible(true);

    }

    //----------------------------------------------
    // sets the color values
    //----------------------------------------------
    public void setColorsAndFont(){
        // custom colors
        purple = new Color(148,0,211);
        royalBlue = new Color(6, 5, 223);
        gold = new Color(207, 181, 59);
        royalFont = new Font("Times New Roman", Font.BOLD, 62);
    }

    //----------------------------------------------
    // sets the background
    //----------------------------------------------
    public void setBackground(){
        background = new JPanel();
        background.setBackground(purple);
        frame.add(background);
        background.setLayout(null);
        Insets inset = background.getInsets();
    }

    //----------------------------------------------
    // sets the subpanel
    //----------------------------------------------
    public void setSubpanel(){
        subpanel1 = new JPanel();
        subpanel1.setBackground(royalBlue);
        //subpanel1.setPreferredSize(new Dimension(550, 100));
        background.add(subpanel1);
        subpanel1.setBounds(inset.left + 0, inset.top + 20, 500, 80);

    }

}
