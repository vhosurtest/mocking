package com.uvtest.learn.mocking;

import com.uvtest.learn.mocking.data.SomeDataService;

public class SomeBusinessLogicImpl {
	
	private SomeDataService someDataService;
	
	public SomeBusinessLogicImpl(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}
	
	public SomeBusinessLogicImpl() {
		this.someDataService = null;
	}
	
	public int calculateSum(int[] arr) {
		int sum =0;
		for (int value: arr) {
			sum += value;
		}
		
		return sum;
	}
	
	public int calculateSumUsingDataService() {
		int[] arr = this.someDataService.retrieveAllData();
		return calculateSum(arr);
	}

}
