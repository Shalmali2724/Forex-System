package com.sprint.forex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sprint.forex.repository.ExchangeRateRepository;

class SumOfNumber {

	@InjectMocks
	private ExchangeRateServiceImpl exchangeRateService;

	
	@Mock
	private ExchangeRateRepository exchangeRateRepository;
	
	@Test
	void testSum() {
		assertEquals(2, exchangeRateService.sum(1,1));
		
	}

}
