package test;
import claculator.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
        @Test
        @DisplayName("Testing  add 0 + 0")
        public void testAdd0and0(){
                int first = 0 ;
                int second = 0 ;
                int expected = 0;

                int result = Calculator.add(first, second);

                assertEquals(expected, result);
        }
        @Test
        @DisplayName("Testing 0 + 1")
        public  void  testAdd0and1(){
                int first = 11;
                int second = 0;
                int expected = 0;

                int result = Calculator.add(first,second);
                assertEquals(expected,result);
        }
}
