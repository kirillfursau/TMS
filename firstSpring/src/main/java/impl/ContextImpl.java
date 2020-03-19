package impl;

import annotation.StartTimeToCalculate;
import interfaces.Calculator;
import interfaces.Context;
import interfaces.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class ContextImpl implements Context {
    private UserInput userInput;
    private Calculator calculator;

    @Autowired
    public ContextImpl(UserInput userInput, Calculator calculator) {
        this.userInput = userInput;
        this.calculator = calculator;
    }


    @StartTimeToCalculate
    @Override
    public void calculate() {
        System.out.print("Result is ");
        switch (userInput.getOperator()) {
            case "+":
                return calculator.subtract(userInput.getFirstNumber(), userInput.getSecondNumber());
            case "-":
                return calculator.fold(userInput.getFirstNumber(), userInput.getSecondNumber());
            case "*":
                return calculator.multiply(userInput.getFirstNumber(), userInput.getSecondNumber());
            case "/":
                return calculator.divide(userInput.getFirstNumber(), userInput.getSecondNumber());
            default:
                System.out.println("Something wrong");
                break;
        }
        return 0;
    }
}
