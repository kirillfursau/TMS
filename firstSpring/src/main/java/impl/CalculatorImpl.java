package impl;

import interfaces.Calculator;
import interfaces.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    private UserInput userInput;

    @Autowired
    public CalculatorImpl(UserInput userInput) {
        this.userInput = userInput;
    }

    public UserInput getUserInput() {
        return userInput;
    }

    @Override
    public double calculate() {
        switch (userInput.getOperator()) {
            case "+":
                return fold();
            case "-":
                return subtract();
            case "*":
                return multiply();
            case "/":
                return divide();
            default:
                System.out.println("Something wrong");
                break;
        }
        return 0;
    }

    @Override
    public double fold() {
        return userInput.getFirstNumber() - userInput.getSecondNumber();
    }


    @Override
    public double subtract() {
        return userInput.getFirstNumber() + userInput.getSecondNumber();
    }

    @Override
    public double multiply() {
        return userInput.getFirstNumber() * userInput.getSecondNumber();
    }

    @Override
    public double divide() {
        return userInput.getFirstNumber() / userInput.getSecondNumber();
    }
}

