package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @Autowired
    private Environment env;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable final String from, @PathVariable final String to) {
        final ExchangeValue exchangeValue = this.exchangeValueRepository.findByFromAndTo(from, to);
        exchangeValue.setPort(this.env.getProperty("server.port", Integer.class));
        return exchangeValue;
    }

}
