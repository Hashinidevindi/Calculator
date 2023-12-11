import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// The Controller coordinates interactions
// between the View and Model
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
// Tell the View that when ever the calculate button
// is clicked to execute the actionPerformed method
// in the CalculateListener inner class
        this.theView.addAddListener(new AddListener());
        this.theView.addSubListener(new SubListener());
        this.theView.addMulListener(new MulListener());
        this.theView.addDivideListener(new DivideListener());
    }
    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getAnswer());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }

    class SubListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.subTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getAnswer());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }

    class MulListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.MulTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getAnswer());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }

    class DivideListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.DivideTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getAnswer());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }

}


