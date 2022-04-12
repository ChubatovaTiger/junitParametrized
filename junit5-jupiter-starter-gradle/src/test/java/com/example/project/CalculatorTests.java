/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.lang.*;

class CalculatorTests {

	/*@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}*/

	@ParameterizedTest(name = "sleep {0} + {1} = {2}")
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
