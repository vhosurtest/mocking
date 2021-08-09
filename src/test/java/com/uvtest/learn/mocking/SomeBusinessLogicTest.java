package com.uvtest.learn.mocking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessLogicTest {

	@Test
	void test() {
		SomeBusinessLogicImpl impl = new SomeBusinessLogicImpl();
		int[] arr = {1,2,3};
		int actualResult = impl.calculateSum(arr);
		int expectedResult = 6;
		assertEquals(expectedResult,actualResult);
	}

}
