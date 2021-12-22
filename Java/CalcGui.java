import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalcGui extends JPanel{

    //attributes
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
    plus, minus, clear, mult, div, equals;
    private JTextField text;
    private String lastOperation;
    private CalcMechsSolution memory;


    //methods
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new CalcGui());
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public CalcGui(){ // this is my background JPanel
        // all the contents of my "background"
        setBackground(Color.blue);

        text = new JTextField(10);
        add(text);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.green);
        buttonPanel.setLayout(new GridLayout(4, 4));
        add(buttonPanel);

        Font bFont = new Font("Courier", Font.BOLD, 25);
        Font tFont = new Font("Gilbert", Font.BOLD, 25);

        text.setFont(tFont);
        text.setEditable(false);

        Consequences response = new Consequences();
        memory = new CalcMechsSolution();

        b0 = new JButton("0");
        b0.setFont(bFont);
        b0.addActionListener(response);
        b1 = new JButton("1");
        b1.setFont(bFont);
        b1.addActionListener(response);
        b2 = new JButton("2");
        b2.setFont(bFont);
        b2.addActionListener(response);
        b3 = new JButton("3");
        b3.setFont(bFont);
        b3.addActionListener(response);
        b4 = new JButton("4");
        b4.setFont(bFont);
        b4.addActionListener(response);
        b5 = new JButton("5");
        b5.setFont(bFont);
        b5.addActionListener(response);
        b6 = new JButton("6");
        b6.setFont(bFont);
        b6.addActionListener(response);
        b7 = new JButton("7");
        b7.setFont(bFont);
        b7.addActionListener(response);
        b8 = new JButton("8");
        b8.setFont(bFont);
        b8.addActionListener(response);
        b9 = new JButton("9");
        b9.setFont(bFont);
        b9.addActionListener(response);
        plus = new JButton("+");
        plus.setFont(bFont);
        plus.addActionListener(response);
        clear = new JButton("C");
        clear.setFont(bFont);
        clear.addActionListener(response);
        minus = new JButton("\u2212");
        minus.setFont(bFont);
        minus.addActionListener(response);
        mult = new JButton("\u00D7");
        mult.setFont(bFont);
        mult.addActionListener(response);
        div = new JButton("\u00F7");
        div.setFont(bFont);
        div.addActionListener(response);
        equals = new JButton("=");
        equals.setFont(bFont);
        equals.addActionListener(response);

        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(div);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(mult);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(minus);
        buttonPanel.add(equals);
        buttonPanel.add(b0);
        buttonPanel.add(clear);
        buttonPanel.add(plus);
    }

    private class Consequences implements ActionListener{
        //attributes
        private boolean done = false;

        public void actionPerformed(ActionEvent event){

            if (event.getSource()==b0){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b0.getText()); // this is to test the calculator
            }else if(event.getSource()==b1){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b1.getText());
            }else if(event.getSource()==b2){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b2.getText());
            }else if(event.getSource()==b3){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b3.getText());
            }else if(event.getSource()==b4){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b4.getText());
            }else if(event.getSource()==b5){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b5.getText());
            }else if(event.getSource()==b6){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b6.getText());
            }else if(event.getSource()==b7){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b7.getText());
            }else if(event.getSource()==b8){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b8.getText());
            }else if(event.getSource()==b9){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText(text.getText()+b9.getText());
            }else if(event.getSource()==clear){
                if (text.getText().equals("")){
                    memory.clear();
                }
                if (done == true){
                    text.setText("");
                    done = false;
                }
                text.setText("");
            }else if(event.getSource()==plus){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                String result = memory.computation(text.getText(), plus.getText());
                text.setText(result);
                lastOperation = plus.getText();
                done = true;
            }else if(event.getSource()==minus){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                String result = memory.computation(text.getText(), minus.getText());
                text.setText(result);
                lastOperation = minus.getText();
                done = true;
            }else if(event.getSource()==mult){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                String result = memory.computation(text.getText(), mult.getText());
                text.setText(result);
                lastOperation = mult.getText();
                done = true;
            }else if(event.getSource()==div){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                String result = memory.computation(text.getText(), div.getText());
                text.setText(result);
                lastOperation = div.getText();
                done = true;
            }else if(event.getSource()==equals){
                if (done == true){
                    text.setText("");
                    done = false;
                }
                String result = memory.computation(text.getText(), lastOperation);
                text.setText(result);
                lastOperation = "";
                done = true;
            }



            }
        }
    }
