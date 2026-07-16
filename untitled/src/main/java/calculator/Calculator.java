package calculator;

import javax.swing.*;
import java.util.ArrayList;

public class Calculator {



    private static JTextField result;

    private static ArrayList<String> nums = new ArrayList<>();
    private static String string;

    public static void main(String[] args) {


        JFrame calculator = new JFrame("calculator.Calculator");


        result = new JTextField();

        result.setBounds(0, 0, 150, 50);
        result.setEditable(false);

        JButton delete = new JButton("C");
        delete.setBounds(150, 0, 50, 50);
        delete.addActionListener(e -> {

         result.setText("");
         string = "";
         nums.clear();

         });

        JButton one = getButton("1", 0, 50);

        JButton two = getButton("2", 50, 50);

        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, 50, 50);
        plus.addActionListener(e -> {

            nums.add(string);
            string = "";
            result.setText( result.getText() + plus.getText());
            nums.add("+");

        });


        JButton four = getButton("4", 0, 100);

        JButton five = getButton("5", 50, 100);

        JButton six = getButton("6", 100, 100);

        JButton minus = new JButton("-");
        minus.setBounds(150, 100, 50, 50);
        minus.addActionListener(e -> {

            nums.add(string);
            string = "";
            result.setText( result.getText() + minus.getText());
            nums.add("-");

        });

        JButton seven = getButton("7", 0, 150);

        JButton eight = getButton("8", 50, 150);

        JButton nine = getButton("9", 100, 150);

        JButton multiply = new JButton("*");
        multiply.setBounds(150, 150, 50, 50);
        multiply.addActionListener(e -> {

            nums.add(string);
            string = "";
            result.setText( result.getText() + multiply.getText());
            nums.add("*");

        });

        JButton point = getButton(".", 0, 200);

        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, 50, 50);
        equal.addActionListener(e ->{

            nums.add(string);
            string = "";
            String answer = Double.toString(CalculatorS.calc(nums));
            string = answer;
            result.setText(answer);
            nums.clear();

        });


        JButton division = new JButton("/");
        division.setBounds(150, 200, 50, 50);
        division.addActionListener(e -> {

            nums.add(string);
            string = "";
            result.setText( result.getText() + division.getText());
            nums.add("/");

        });


        calculator.add(result);
        calculator.add(delete);
        calculator.add(one);
        calculator.add(two);
        calculator.add(three);
        calculator.add(four);
        calculator.add(five);
        calculator.add(six);
        calculator.add(seven);
        calculator.add(eight);
        calculator.add(nine);
        calculator.add(zero);
        calculator.add(point);
        calculator.add(plus);
        calculator.add(minus);
        calculator.add(multiply);
        calculator.add(division);
        calculator.add(equal);


        calculator.setLayout(null);
        calculator.setSize(600, 600);
        calculator.setVisible(true);

    }

    private static JButton getButton(String label, int xPosition, int yPosition) {
        JButton button = new JButton(label);
        button.setBounds(xPosition, yPosition, 50, 50);
        button.addActionListener(event -> {
            result.setText(result.getText() + button.getText());
            if (string != null) {
                string += button.getText();
            } else {
                string = button.getText();
            }
        });

        return button;
    }
}
