package impl;

import annotation.EndTimeToCalculate;
import annotation.StartTimeToCalculate;
import interfaces.Calculator;
import interfaces.Controller;
import interfaces.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class ControllerImpl implements Controller {
    private UserInput userInput;
    private Calculator calculator;

    @Autowired
    public ControllerImpl(UserInput userInput, Calculator calculator) {
        this.userInput = userInput;
        this.calculator = calculator;
    }

    @StartTimeToCalculate
    @EndTimeToCalculate
    @Override
    public void calculate() {
        System.out.print("Result is ");
        switch (userInput.getOperator()) {
            case "+":
                System.out.println(calculator.subtract(userInput.getFirstNumber(), userInput.getSecondNumber()));
                break;
            case "-":
                System.out.println(calculator.fold(userInput.getFirstNumber(), userInput.getSecondNumber()));
                break;
            case "*":
                System.out.println(calculator.multiply(userInput.getFirstNumber(), userInput.getSecondNumber()));
                break;
            case "/":
                System.out.println(calculator.divide(userInput.getFirstNumber(), userInput.getSecondNumber()));
                break;
            default:
                System.out.println("Something wrong");
                break;
        }
    }
}
