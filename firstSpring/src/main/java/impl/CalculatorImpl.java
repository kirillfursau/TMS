package impl;

import annotation.EndTimeToCalculate;
import interfaces.Calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

    public CalculatorImpl() {
    }

    @EndTimeToCalculate
    @Override
    public double fold(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }


    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }


    @Override
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @EndTimeToCalculate
    @Override
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}

