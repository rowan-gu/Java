import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomResponse extends JPanel{


    // attributes
    private JTextField text;
    private JLabel response;




        public static void main(String[] args) {
            JFrame frame = new JFrame("Test of Random Response GUI");
            frame.add(new RandomResponse());
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // exit on close criteria
            // size of the frame
            frame.setSize(500, 500);
        }

        public RandomResponse(){
            // background color?
            setBackground(Color.red);

            JTextField text = new JTextField(35);
            add(text);

            // a label or textfield that allows for a Response
            response = new JLabel("");
            add(response);


            Listener ear = new Listener();
            text.addActionListener(ear);
        }

        public void someMethod(){

        }
    private class Listener implements ActionListener{

        private String[] comeBack;
        private Random rand;

        public void actionPerformed(ActionEvent enterText){

            rand = new Random();

            comeBack = new String[]{"What are you even saying?",
                        "No way! I don't believe you!",
                        "Yeah, yeah, I've heard it before."};


            response.setText(comeBack[rand.nextInt[3]]);
        }


        }
}
