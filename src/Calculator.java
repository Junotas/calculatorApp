import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class Calculator implements ActionListener {
        JFrame frame;
        JTextField textfield;
        JButton[] numberButtons = new JButton[10];
        JButton[] functionButtons = new JButton[9];
        JButton addButton,subButton,mulButton,divButton;
        JButton decButton, equButton, delButton, clrButton, negButton;
        JPanel panel;

        Font myFont = new Font("INK FREE", Font.BOLD, 30);

        double num1=0, num2=0,result=0;
        char operator;


        Calculator (){
            frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,550);
            frame.setLayout(null);

            textfield = new JTextField();
            textfield.setBounds(100,25,300,50);
            textfield.setFont(myFont);
            textfield.setEditable(false);


            frame.add(textfield);
            frame.setVisible(true); // Move this line here
        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


