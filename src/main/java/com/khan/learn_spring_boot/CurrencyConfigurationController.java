package com.khan.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration findAllCurrencyServiceConfiguration() {
		return currencyServiceConfiguration;
	}
}
