public class CalculatorModel {
    private int answer;
    public void addTwoNumbers(int firstNumber, int secondNumber){
        answer = firstNumber + secondNumber;
    }

    public void subTwoNumbers(int firstNumber, int secondNumber){
        answer = firstNumber - secondNumber;
    }

    public void MulTwoNumbers(int firstNumber, int secondNumber){
        answer = firstNumber * secondNumber;
    }

    public void DivideTwoNumbers(int firstNumber, int secondNumber){
        answer = firstNumber / secondNumber;
    }

    public int getAnswer(){
        return answer;
    }
}
