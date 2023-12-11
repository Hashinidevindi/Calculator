
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends JFrame{

    private JLabel label1 = new JLabel("Enter First Number = ");
    private JLabel label2 = new JLabel("Enter Second Number = ");
    private JLabel label3 = new JLabel("Answer is = ");
    private JTextField firstNumber = new JTextField(5);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(5);
    private JButton additionButton = new JButton("+");
    private JButton substractionButton = new JButton("-");
    private JButton multiplicationButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JTextField calcSolution = new JTextField(5);
    public CalculatorView(){
// Sets up the view and adds the components
        JPanel panel = new JPanel();
        this.setTitle("MVC Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        panel.setBackground(Color.GRAY);
        panel.add(label1);
        panel.add(firstNumber);
        panel.add(label2);
        panel.add(secondNumber);
        panel.add(additionButton);
        panel.add(substractionButton);
        panel.add(multiplicationButton);
        panel.add(divideButton);
        panel.add(label3);
        panel.add(calcSolution);
        this.add(panel);
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }
    // If the calculateButton is clicked execute a method
// in the Controller named actionPerformed
    void addAddListener(ActionListener listenForCalcButton){
        additionButton.addActionListener(listenForCalcButton);
    }

    void addSubListener(ActionListener listenForCalcButton){
       substractionButton.addActionListener(listenForCalcButton);
    }

    void addMulListener(ActionListener listenForCalcButton){
        multiplicationButton.addActionListener(listenForCalcButton);
    }
    void addDivideListener(ActionListener listenForCalcButton){
        divideButton.addActionListener(listenForCalcButton);
    }
    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
