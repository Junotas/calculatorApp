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

            addButton = new JButton("+");
            subButton = new JButton("-");
            mulButton = new JButton("*");
            divButton = new JButton("/");
            decButton = new JButton(".");
            equButton = new JButton("=");
            delButton = new JButton("DELETE");
            clrButton = new JButton("CLEAR");

            functionButtons[0] = addButton;
            functionButtons[1] = subButton;
            functionButtons[2] = mulButton;
            functionButtons[3] = divButton;
            functionButtons[4] = decButton;
            functionButtons[5] = equButton;
            functionButtons[6] = delButton;
            functionButtons[7] = clrButton;

            for (int i = 0; i < 8; i++) {
                functionButtons[i].addActionListener(this);
                functionButtons[i].setFont(myFont);
                functionButtons[i].setFocusable(false);

            }



            frame.add(textfield);
            frame.setVisible(true); // Move this line here
        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


