import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.*;

class calc {

    private double N1,N2;
    private String[] arr = new String[5];
    private char SYM = '\0';
    private int size = 0; // Current number of elements
    private final int capacity = 5; // Maximum size of the array
    private double buffer;
    private boolean operatorFlag;

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

    public boolean getOperatorFlag(){
        return operatorFlag;
    }

    public double getBuffer(){
        return buffer;
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

    public void setOperatorFlag(boolean flag){
        operatorFlag = flag;
    }

    public void setBuffer(double buffer){
        this.buffer = buffer;
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

    public double calculate(double data1, double data2) {
        double result=0;
        switch (SYM) {
            case '+':
                result = data1 + data2;
                break;
            case '-':
                result = data1 - data2;
                break;
            case '/':
                result = data1/data2;
                break;
            case '*':
                result = data1* data2;
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
        JButton clear = new JButton("C");
        JButton doubleZero = new JButton("00");
        JButton clearEvent = new JButton("CE");
        JButton equal = new JButton("=");
        JButton backSpace = new JButton("⬅️");
        JButton dot = new JButton(".");


        // Setting bounds for the Operation Keys
        addition.setBounds(263, 120, 80, 40);
        subtraction.setBounds(263, 170, 80, 40);
        multiplication.setBounds(263, 220, 80, 40);
        division.setBounds(263, 270, 80, 40);
        equal.setBounds(263, 320, 80, 40);
        

        addition.setBackground(Color.GRAY);
        addition.setForeground(Color.WHITE);
        addition.setFont(new Font("Ariel",Font.PLAIN,20));
        subtraction.setBackground(Color.GRAY);
        subtraction.setFont(new Font("Ariel",Font.PLAIN,20));
        subtraction.setForeground(Color.WHITE);
        multiplication.setBackground(Color.GRAY);
        multiplication.setFont(new Font("Ariel",Font.PLAIN,20));
        multiplication.setForeground(Color.WHITE);
        division.setBackground(Color.GRAY);
        division.setForeground(Color.WHITE);
        division.setFont(new Font("Ariel",Font.PLAIN,20));

        equal.setFont(new Font("Ariel",Font.PLAIN,20));
        equal.setBackground(new Color(25, 117, 197));
        equal.setForeground(Color.WHITE);
        // backSpace.setFont(new Font("Ariel",Font.PLAIN,15));


        // Setting Bounds for the Numeric Keys
        clearEvent.setBounds(5, 120, 80, 40);
        clear.setBounds(91, 120, 80, 40);
        backSpace.setBounds(177, 120, 80, 40);
        

        seven.setBounds(5, 170, 80, 40);
        eight.setBounds(91, 170, 80, 40);
        nine.setBounds(177, 170, 80, 40);

        four.setBounds(5, 220, 80, 40);
        five.setBounds(91, 220, 80, 40);
        six.setBounds(177, 220, 80, 40);

        three.setBounds(177, 270, 80, 40);
        two.setBounds(91, 270, 80, 40);
        one.setBounds(5, 270, 80, 40);
        
        doubleZero.setBounds(5, 320, 80, 40);
        zero.setBounds(91, 320, 80, 40);
        dot.setBounds(177, 320, 80, 40);
        

        seven.setFont(new Font("Ariel", Font.PLAIN, 20));
        seven.setBackground(Color.WHITE);
        seven.setBorder(null);

        eight.setFont(new Font("Ariel", Font.PLAIN, 20));
        eight.setBackground(Color.WHITE);
        eight.setBorder(null);

        nine.setFont(new Font("Ariel", Font.PLAIN, 20));
        nine.setBackground(Color.WHITE);
        nine.setBorder(null);

        four.setFont(new Font("Ariel", Font.PLAIN, 20));
        four.setBackground(Color.WHITE);
        four.setBorder(null);

        five.setFont(new Font("Ariel", Font.PLAIN, 20));
        five.setBackground(Color.WHITE);
        five.setBorder(null);

        six.setFont(new Font("Ariel", Font.PLAIN, 20));
        six.setBackground(Color.WHITE);
        six.setBorder(null);
 
        three.setFont(new Font("Ariel", Font.PLAIN, 20));
        three.setBackground(Color.WHITE);
        three.setBorder(null);

        two.setFont(new Font("Ariel", Font.PLAIN, 20));
        two.setBackground(Color.WHITE);
        two.setBorder(null);

        one.setFont(new Font("Ariel", Font.PLAIN, 20));
        one.setBackground(Color.WHITE);
        one.setBorder(null);

        zero.setFont(new Font("Ariel", Font.PLAIN, 20));
        zero.setBackground(Color.WHITE);
        zero.setBorder(null);

        doubleZero.setFont(new Font("Ariel", Font.PLAIN, 20));
        doubleZero.setBackground(Color.WHITE);
        doubleZero.setBorder(null);

        dot.setFont(new Font("Ariel", Font.PLAIN, 30));
        dot.setBackground(Color.WHITE);
        dot.setBorder(null);

        
        clear.setFont(new Font("Ariel", Font.PLAIN, 20));
        // clear.setBackground(Color.WHITE);
        // clear.setBorder(null);

        clearEvent.setFont(new Font("Ariel", Font.PLAIN, 20));
        // clearEvent.setBackground(Color.WHITE);
        // clearEvent.setBorder(null);


        // Separator 
        JSeparator s = new JSeparator(); 
        s.setOrientation(SwingConstants.VERTICAL);
        s.setBounds(346,0,2,500); 
        // s.setBackground(Color.GRAY);

        // Test Fields
        JTextField f1;
        f1 = new JTextField();
        f1.setBounds(0,0,348,60);
        f1.setHorizontalAlignment(SwingConstants.RIGHT);
        f1.setBorder(BorderFactory.createCompoundBorder(
                f1.getBorder(),                     // Keep existing border
                new EmptyBorder(0, 0, 0, 10)                // Add padding: top, left, bottom, right
        ));
        f1.setFont(new Font("Serif",Font.BOLD,30));

        // Result JLabel
        JLabel jl = new JLabel("0");
        jl.setBounds(0,59,348,50);
        jl.setHorizontalAlignment(SwingConstants.RIGHT);
        Border etchedBorder = BorderFactory.createEtchedBorder();
        // Border paddingBorder = BorderFactory.createEmptyBorder(10, 20, 10, 10);
        jl.setBorder(BorderFactory.createCompoundBorder(
            etchedBorder, 
            new EmptyBorder(10, 20, 10, 10)
        ));
        jl.setFont(new Font("Ariel",Font.BOLD,40));

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

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent d){
                f1.setText("");
                calcObj1.setN1(0);
                calcObj1.setN2(0);
                calcObj1.setSYM('\0');
                jl.setText("0");
                calcObj1.setOperatorFlag(false);
            }
        });

        clearEvent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent CE){
                f1.setText("");
            }
        });
        
        ActionListener arithmeticListener = new ActionListener() {
            // String operationName;
            @Override
            public void actionPerformed(ActionEvent e){
                
                double result = 0;
                String operationName;
                
                try {
                    if(calcObj1.getOperatorFlag() == false){
                        String f1data = f1.getText();
                        calcObj1.setN1(Double.parseDouble(f1data));
                        operationName = e.getActionCommand(); 
                        calcObj1.setSYM(operationName.charAt(0));
                        f1.setText("");
                        System.out.println("if Running: "+calcObj1.getSYM()+","+calcObj1.getN1());
                        calcObj1.setOperatorFlag(true);
                        
                    } else {
                        String newF1Data = f1.getText();
                        calcObj1.setN2(Double.parseDouble(newF1Data));
                        result = calcObj1.calculate();
                        calcObj1.setN1(result);
                        operationName = e.getActionCommand(); 
                        calcObj1.setSYM(operationName.charAt(0));
                        jl.setText(" "+result);
                        f1.setText("");
                        System.out.println("Else Running: "+calcObj1.getSYM()+","+calcObj1.getN1());
                    }


                } catch (Exception eFF) {
                    System.out.println("Operator: "+calcObj1.getSYM());
                    operationName = e.getActionCommand(); 
                    calcObj1.setSYM(operationName.charAt(0));
                    System.out.println(eFF);
                    System.out.println("Opeartor: "+calcObj1.getSYM());
                }

                double tempResult = calcObj1.calculate();
                calcObj1.addElement(calcObj1.getN1()+" "+ calcObj1.getSYM() +" " +calcObj1.getN2()+" = "+ tempResult);
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
        doubleZero.addActionListener(numericListener);
        dot.addActionListener(numericListener);



        jf.setTitle("Jacalc");
        jf.setSize(550, 420);
        
        jf.add(addition);
        jf.add(subtraction);
        jf.add(multiplication);
        jf.add(division);
        
        // Adding Numeric Buttons
        jf.setLayout(null);
        jf.add(one); jf.add(two); jf.add(three); jf.add(four); jf.add(five);
        jf.add(six); jf.add(seven); jf.add(eight); jf.add(nine); jf.add(zero);
        jf.add(clear);
        jf.add(f1);
        jf.add(jl);
        jf.add(s);
        jf.add(hh);
        jf.add(h1);
        jf.add(h2);
        jf.add(h3);
        jf.add(h4); 
        jf.add(h5);
        jf.add(doubleZero);
        jf.add(clearEvent);
        jf.add(backSpace);
        jf.add(equal);
        jf.add(dot);
        jf.setIconImage(appIcon.getImage());
        jf.setResizable(false);
        disableFocusPainted(jf);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    // Method to disable focus painted on all JButtons
    public static void disableFocusPainted(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JButton) {
                ((JButton) component).setFocusPainted(false);
            }
            if (component instanceof Container) {
                disableFocusPainted((Container) component); // Recursively check child containers
            }
        }
    }
}
