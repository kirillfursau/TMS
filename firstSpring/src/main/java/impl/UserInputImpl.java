package impl;

import interfaces.UserInput;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UserInputImpl implements UserInput {
    private double firstNumber;
    private double secondNumber;
    private String operator;
    private Scanner scanner;


    public UserInputImpl() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number : ");
        firstNumber = scanner.nextDouble();
        System.out.print("Input second number : ");
        secondNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Input operator(+ , - , * , /) : ");
        operator = scanner.nextLine();
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