/*
*/

import javax.swing.*;
import java.awt.*;

public class FirstGUI{
    public static void main(String[] args) {
        Color indigo = new Color(75, 0, 130);
        Color violet = new Color(127, 0, 255);

        JPanel[] panels = new JPanel[7];

        Color[] colors = new Color[]{
            Color.red, Color.pink, Color.yellow, Color.green, Color.blue, indigo, violet};


        //declaring variable; creating JFrame
        JFrame firstFrame = new JFrame("Our first frame");
        //determine how the program terminates
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pick the size
        firstFrame.setSize(500, 700);
        //make visible
        firstFrame.setVisible(true);

        JPanel background = new JPanel();
        //set color
        background.setBackground(Color.orange);
        //add panel to the frame
        firstFrame.add(background);

        //make frame setVisible
        for (int i = 0; i<7; i++){
            panels[i] = new JPanel();
            panels[i].setBackground(colors[i]);
            panels[i].setPreferredSize(new Dimension(300, 50));
            background.add(panels[i]);

        }



    }
}
