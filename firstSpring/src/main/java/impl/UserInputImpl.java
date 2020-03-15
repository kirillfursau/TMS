package impl;

import interfaces.UserInput;
import org.springframework.stereotype.Component;

@Component
public class UserInputImpl implements UserInput {
    private double firstNumber;
    private double secondNumber;
    private String operator;

    public UserInputImpl(double firstNumber, double secondNumber, String operator) {
        this.firstNumber = 2;
        this.secondNumber = 2;
        this.operator = "/";
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    @Override
    public double getFirstNumber() {
        return firstNumber;
    }


    @Override
    public double getSecondNumber() {
        return secondNumber;
    }

    @Override
    public String getOperator() {
        return operator;
    }
}