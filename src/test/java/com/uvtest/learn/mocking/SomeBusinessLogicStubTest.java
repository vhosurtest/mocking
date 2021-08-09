package com.uvtest.learn.mocking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.uvtest.learn.mocking.data.SomeDataService;

class SomeBusinessLogicStubTest {
	
	SomeDataService someDataService = new SomeDataServiceStubImpl();
	
	class SomeDataServiceStubImpl implements SomeDataService{

		@Override
		public int[] retrieveAllData() {
			return new int[] {1,2,3};
		}
		
	}

	@Test
	void testSomeBusinessLogicUsingStub() {
		SomeBusinessLogicImpl someBusinessLogic = new SomeBusinessLogicImpl(someDataService);
		assertEquals(6, someBusinessLogic.calculateSumUsingDataService());
		
	}

}
