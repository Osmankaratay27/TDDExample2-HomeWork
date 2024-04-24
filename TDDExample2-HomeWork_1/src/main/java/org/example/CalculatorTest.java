//STUDENT NUMBER= B211202063
//STUDENT NAME = OSMAN SALİH KARATAY
//COURSE NAME = SOFTWARE VERIFICATION AND VALIDATION
//https://github.com/Osmankaratay27/TDDExample2_HomeWork.git

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @ParameterizedTest
    @CsvSource({"10, 2,5","10, 4,2.5","12.5, 2.5,5", "10, 2.5,4", "12.5, 5,2.5"})
    void TestDivide(float x, float y, float expectedValue) {
        Calculator calc = new Calculator();
        assertEquals(expectedValue, calc.divide(x, y),
                "The result of Calculator.add method is incorrect.");



    }
    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );


        assertEquals("Illegal Argument Exception.", exception.getMessage());
}
}
