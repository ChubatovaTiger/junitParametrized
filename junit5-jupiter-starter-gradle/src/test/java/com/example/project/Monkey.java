package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.lang.*;

class Monkey {

	/*@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}*/

	@ParameterizedTest(name = "Think {0} + {1} = {2}")
	@CsvSource({
			"5,    1,   1",
			"5,    2,   3",
			"10,  51, 100",
			"5,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
 try 
            {
                //Thread.sleep(9);
            Thread.sleep(first*1000);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurs
            }
            assertEquals(2,3);
	}
}