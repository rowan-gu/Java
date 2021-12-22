/*
  * header stuff
*/

import java.awt.*;
import javax.swing.*;

public class FrameDriver extends JFrame{


    public static void main(String[] args) {
        new FrameDriver();

    }

    public FrameDriver(){
        //JFrame frame = new JFrame("Random Stuff"); //how do I set the name?
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GuiInternals background = new GuiInternals();

        add(background);
        setVisible(true);
    }


}
