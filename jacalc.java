import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
// import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.*;



class calc {

    private double N1,N2;
    private char SYM = '\0';
    private boolean operatorFlag;
    // private String[] arr = new String[5];
    // private int size = 0; // Current number of elements
    // private final int capacity = 5; // Maximum size of the array



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
    // public void addElement(String newElement) {
    //     if (size < capacity) {
    //         arr[size] = newElement;
    //         size++;
    //     } else {
    //         for (int i = 0; i < capacity - 1; i++) {
    //             arr[i] = arr[i + 1];
    //         }
    //         arr[capacity - 1] = newElement;
    //     }
    // }



    // Getters:
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



    // Setters:
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



    // Functions to apple Styling to Buttons:
    // Method to apply common styles to the group of Numeric buttons: 
    public static void styleNumericButton(JButton NumButton) {
        NumButton.setFont(new Font("Ariel", Font.PLAIN, 20));
        NumButton.setBackground(Color.WHITE);
        NumButton.setBorder(null);
    }

    // Methods to apply common styles to the group of Opeartion buttons: 
    public static void styleOperationButton(JButton OperationButton) {
        OperationButton.setBackground(Color.GRAY);
        OperationButton.setForeground(Color.WHITE);
        OperationButton.setFont(new Font("Ariel",Font.PLAIN,20));
    }



    // Main method to perform the necessary calculations: 
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
        public static void main(String[] args) {
    
        calc calcObj1 = new calc();
        
        JFrame jf = new JFrame();

        ImageIcon appIcon = new ImageIcon("calculator.png");        



        // CREATING BUTTONS: 
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



        // BOUNDS OF BUTTONS: 
        // Setting Bounds for the Opeartor Buttons
        addition.setBounds(263, 120, 80, 40);
        subtraction.setBounds(263, 170, 80, 40);
        multiplication.setBounds(263, 220, 80, 40);
        division.setBounds(263, 270, 80, 40);
        equal.setBounds(263, 320, 80, 40);

        // Setting Bounds for the Other Buttons
        clearEvent.setBounds(5, 120, 80, 40);
        clear.setBounds(91, 120, 80, 40);
        backSpace.setBounds(177, 120, 80, 40);
        // backSpace.setFont(new Font("Ariel",Font.PLAIN,15));
        
        // Setting Bounds for the Numeric Buttons:
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



        // STYLING OF BUTTONS:
        // Styling Opeartion Buttons:
        calc.styleOperationButton(addition);
        calc.styleOperationButton(subtraction);
        calc.styleOperationButton(multiplication);
        calc.styleOperationButton(division);
        calc.styleOperationButton(equal);

        // Styling Numeric Buttons:
        calc.styleNumericButton(seven);
        calc.styleNumericButton(eight);
        calc.styleNumericButton(nine);
        calc.styleNumericButton(four);
        calc.styleNumericButton(five);
        calc.styleNumericButton(six);
        calc.styleNumericButton(three);
        calc.styleNumericButton(two);
        calc.styleNumericButton(one);
        calc.styleNumericButton(zero);
        calc.styleNumericButton(doubleZero);
        calc.styleNumericButton(dot);

        // Styling Other Buttons: (That require unique styling)
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
        // JSeparator s = new JSeparator(); 
        // s.setOrientation(SwingConstants.VERTICAL);
        // s.setBounds(346,0,2,500); 
        // s.setBackground(Color.GRAY);


        // TEXTFIELD: 
        // Test Field where numbers are written and taken from:
        JTextField f1;
        f1 = new JTextField();
        f1.setBounds(0,0,348,60);
        f1.setHorizontalAlignment(SwingConstants.RIGHT);
        f1.setBorder(BorderFactory.createCompoundBorder(
                f1.getBorder(),                     // Keep existing border
                new EmptyBorder(0, 0, 0, 10)                // Add padding: top, left, bottom, right
        ));
        f1.setFont(new Font("Serif",Font.BOLD,30));


        // JLABEL:
        // Result JLabel where result are displayed after each operation:
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



        // ACTION LISTENERS: 
        // Arithmetic Action Listeners for all the Operation Buttons: 
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
                        // System.out.println("if Running: "+calcObj1.getSYM()+","+calcObj1.getN1());
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
                        // System.out.println("Else Running: "+calcObj1.getSYM()+","+calcObj1.getN1());
                    }


                } catch (Exception eFF) {
                    // System.out.println("Operator: "+calcObj1.getSYM());
                    operationName = e.getActionCommand(); 
                    calcObj1.setSYM(operationName.charAt(0));
                    System.out.println(eFF);
                    // System.out.println("Opeartor: "+calcObj1.getSYM());
                }
          
            }
        };

        // Numeric Action Listener for all the Numeric Buttons: 
        ActionListener numericListener = new ActionListener() {
            public void actionPerformed(ActionEvent f){
                String number = f.getActionCommand();
                f1.setText(f1.getText()+number);
            }
        };

        // Action Listeners for all the Buttons with Unique Actions: 
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
        
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent eq){
                try {
                    double result = 0;
                    if(calcObj1.getOperatorFlag() == false){
                        result = Double.parseDouble(f1.getText()); 
                        jl.setText(" "+result);
                        f1.setText("");
                    } else {
                        String newF1Data = f1.getText();
                        calcObj1.setN2(Double.parseDouble(newF1Data));
                        result = calcObj1.calculate();
                        calcObj1.setN1(result);
                        jl.setText(" "+result);
                        f1.setText("");
                    }
                } catch (Exception e) {
                    System.out.print(e);
                }

            }
        });

        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent dot){
                try {
                    if(f1.getText().contains(".") == true) {

                    } else {
                        String number = dot.getActionCommand();
                        f1.setText(f1.getText()+number);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });

        backSpace.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent backSpace){
                String currentValue = f1.getText();
                if(!currentValue.isEmpty()){
                    String newValue = currentValue.substring(0, currentValue.length()-1);
                    f1.setText(newValue);
                }
            }
        });


        // ADDING ACTION LISTENERS TO GENERIC BUTTONS: 
        // Adding Acction Listeners to the Numeric Buttons and the Operation Buttons: 
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



        // ADDINT ELEMENTS TO JFRAME:
        // Adding Opeartion Buttons to the Jframe:
        jf.add(addition);
        jf.add(subtraction);
        jf.add(multiplication);
        jf.add(division);
        
        // Adding Numeric Buttons to the Jframe:
        jf.setLayout(null);
        jf.add(one); jf.add(two); jf.add(three); jf.add(four); jf.add(five);
        jf.add(six); jf.add(seven); jf.add(eight); jf.add(nine); jf.add(zero);
        jf.add(clear);
        jf.add(f1);
        jf.add(jl);
        jf.add(doubleZero);
        jf.add(clearEvent);
        jf.add(backSpace);
        jf.add(equal);
        jf.add(dot);
        
        // Basic layout formatting and setting for the JFrame
        jf.setTitle("Jacalc");
        jf.setSize(363, 420);
        jf.setResizable(false);
        jf.setIconImage(appIcon.getImage());
        disableFocusPainted(jf);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

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