import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

class calc {

    private double N1,N2;
    private String[] arr = new String[5];
    private char SYM;
    private int size =0; // Current number of elements
    private final int capacity = 5; // Maximum size of the array


    // Constructors:

    // Default Constructors
    calc(){

    }

    // Parameterized Constructor
    calc(double n1, double n2, char sym){
        N1=n1;
        N2 = n2;
        SYM = sym;
    }

    
    
    // Function to add a new history with shifting logic
    public void addElement(String newElement) {
        if (size < capacity) {
            arr[size] = newElement;
            size++;
        } else {
            for (int i = 0; i < capacity - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[capacity - 1] = newElement;
        }
    }

    

    // Getters
    public String getElement(int index) {
        return this.arr[index];
    }

    public double getN1() {
        return N1;
    }

    public double getN2() {
        return N2;
    }

    public char getSYM() {
        return SYM;
    }



    // Setters
    public void setN1(double n1) {
        N1 = n1;
    }

    public void setN2(double n2) {
        N2 = n2;
    }

    public void setSYM(char sYM) {
        SYM = sYM;
    }



    public double calculate() {
        double result=0;
        switch (SYM) {
            case '+':
                result = this.N1 + this.N2;
                break;
            case '-':
                result = this.N1 - this.N2;
                break;
            case '/':
                result = this.N1/this.N2;
                break;
            case '*':
                result = this.N1* this.N2;
                break;
            default:
                System.out.println("Invalid Operator Error!");
                break;
        }
        return result;
    }

}

public class jacalc {

    static int counter = 0;
    public static void main(String[] args) {
    
        calc calcObj1 = new calc();
        
        JFrame jf = new JFrame();

        ImageIcon appIcon = new ImageIcon("calculator.png");

        // Buttons
        JButton addition = new JButton("+");
        JButton subtraction = new JButton("-");
        JButton multiplication = new JButton("*");
        JButton division = new JButton("/");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");


        addition.setBounds(80, 130, 50, 30);
        addition.setFocusPainted(false);
        subtraction.setBounds(140, 130, 50, 30);
        subtraction.setFocusPainted(false);
        multiplication.setBounds(200, 130, 50, 30);
        multiplication.setFocusPainted(false);
        division.setBounds(260, 130, 50, 30);
        division.setFocusPainted(false);

        seven.setBounds(60, 170, 80, 40);
        eight.setBounds(155, 170, 80, 40);
        nine.setBounds(250, 170, 80, 40);

        four.setBounds(60, 220, 80, 40);
        five.setBounds(155, 220, 80, 40);
        six.setBounds(250, 220, 80, 40);

        one.setBounds(250, 270, 80, 40);
        two.setBounds(155, 270, 80, 40);
        three.setBounds(60, 270, 80, 40);

        zero.setBounds(155, 320, 80, 40);

        // 
        JSeparator s = new JSeparator(); 
        // set layout as vertical 
        s.setOrientation(SwingConstants.VERTICAL);
        s.setBounds(380,0,5,500); 
        
        // Test Fields
        JTextField f1,f3;
        f1 = new JTextField();
        f3 = new JTextField();
        f1.setBounds(60,50,100,30);
        f3.setBounds(230,50,100,30);

        // Result JLabel
        JLabel jl = new JLabel("Result: ");
        jl.setBounds(170,90,300,30);

        // History Jlabels
        JLabel h1,h2,h3,h4,h5,hh;
        h1 = new JLabel(calcObj1.getElement(0));
        h2 = new JLabel(calcObj1.getElement(1));
        h3 = new JLabel(calcObj1.getElement(2));
        h4 = new JLabel(calcObj1.getElement(3));
        h5 = new JLabel(calcObj1.getElement(4));
        hh = new JLabel("History");
        hh.setBounds(435,30,200,30);
        h1.setBounds(427,70,200,30);
        h2.setBounds(427,110,200,30);
        h3.setBounds(427,150,200,30);
        h4.setBounds(427,190,200,30);
        h5.setBounds(427,230,200,30);


        ActionListener arithmeticListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String operationName = e.getActionCommand(); 
                String f1data = f1.getText();
                String f3data = f3.getText();

                calcObj1.setN1(Double.parseDouble(f1data));
                calcObj1.setSYM(operationName.charAt(0));
                calcObj1.setN2(Double.parseDouble(f3data));
                double result = calcObj1.calculate();

                calcObj1.addElement(f1data+" "+operationName+" "+f3data+" = "+Double.toString(result));

                jl.setText("Result: "+result);
                h1.setText(calcObj1.getElement(0));
                h2.setText(calcObj1.getElement(1));
                h3.setText(calcObj1.getElement(2));
                h4.setText(calcObj1.getElement(3));
                h5.setText(calcObj1.getElement(4));            
            }
        };

        ActionListener numericListener = new ActionListener() {
            public void actionPerformed(ActionEvent f){
                String number = f.getActionCommand();
                f1.setText(f1.getText()+number);
                // System.out.println(number);
            }
        };

        addition.addActionListener(arithmeticListener);
        subtraction.addActionListener(arithmeticListener);
        multiplication.addActionListener(arithmeticListener);
        division.addActionListener(arithmeticListener);

        seven.addActionListener(numericListener);
        eight.addActionListener(numericListener);
        nine.addActionListener(numericListener);
        four.addActionListener(numericListener);
        five.addActionListener(numericListener);
        six.addActionListener(numericListener);
        one.addActionListener(numericListener);
        two.addActionListener(numericListener);
        three.addActionListener(numericListener);
        zero.addActionListener(numericListener);



        jf.setTitle("Jacalc");
        jf.setSize(550, 500);
        
        jf.add(addition);
        jf.add(subtraction);
        jf.add(multiplication);
        jf.add(division);
        
        // Adding Numeric Buttons
        jf.add(one); jf.add(two); jf.add(three); jf.add(four); jf.add(five);
        jf.add(six); jf.add(seven); jf.add(eight); jf.add(nine); jf.add(zero);
        jf.setLayout(null);
        jf.add(f1);
        jf.add(f3);
        jf.add(jl);
        jf.add(s);
        jf.add(hh);
        jf.add(h1);
        jf.add(h2);
        jf.add(h3);
        jf.add(h4); 
        jf.add(h5);
        jf.setIconImage(appIcon.getImage());
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}