package impl;

import interfaces.Calculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorImplTest {
    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        calculator = new CalculatorImpl();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void fold() {
        assertEquals(12, (int)calculator.fold(10,2));
        assertEquals(35, (int)calculator.fold(15,20));
        assertEquals(9, (int)calculator.fold(8,1));
        assertEquals(121, (int)calculator.fold(99,22));
    }

    @Test
    public void multiply() {
        assertEquals(20, (int)calculator.multiply(5,4));
        assertEquals(100, (int)calculator.multiply(20,5));
        assertEquals(21, (int)calculator.multiply(7,3));
        assertEquals(8, (int)calculator.multiply(2,4));
    }

    @Test
    public void subtract() {
        assertEquals(7, (int)calculator.subtract(15,8));
        assertEquals(10, (int)calculator.subtract(15,5));
        assertEquals(14, (int)calculator.subtract(15,1));
        assertEquals(12, (int)calculator.subtract(20,8));
    }

    @Test
    public void divide() {
        assertEquals(10, (int)calculator.divide(20,2));
        assertEquals(4, (int)calculator.divide(20,5));
        assertEquals(5, (int)calculator.divide(25,5));
        assertEquals(50, (int)calculator.divide(100,2));
    }
}
