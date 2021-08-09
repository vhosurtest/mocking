package com.uvtest.learn.mocking;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import com.uvtest.learn.mocking.data.SomeDataService;

class SomeBusinessLogicMockTest {
	SomeDataService someDataService = mock(SomeDataService.class);
	SomeBusinessLogicImpl someBusinessLogic = new SomeBusinessLogicImpl(someDataService);

	@Test
	void testSomeBusinessLogicUsingMock() {
		when(someDataService.retrieveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, someBusinessLogic.calculateSumUsingDataService());
	}

}
