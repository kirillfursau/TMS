import config.Config;
import impl.CalculatorImpl;
import impl.UserInputImpl;
import interfaces.Calculator;
import interfaces.UserInput;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

public class TextContextInitializer {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserInput userInput = context.getBean("userInputImpl", UserInput.class);
        Calculator calculator = context.getBean("calculatorImpl", Calculator.class);
//        Scanner scanner = new Scanner(System.in);
//        UserInput userInput = new UserInputImpl(scanner.nextDouble(), scanner.nextDouble(), scanner.nextLine());
//        CalculatorImpl calculator = new CalculatorImpl(new UserInputImpl(scanner.nextDouble(),scanner.nextDouble(), scanner.nextLine()));
//        CalculatorImpl calculator = (CalculatorImpl) context.getBean("calculatorImpl", Calculator.class);
//        calculator.setUserInput(context.getBean("userInputImpl", UserInput.class));
    }
}
