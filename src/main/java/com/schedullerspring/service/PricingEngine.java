package com.schedullerspring.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PricingEngine {

    static final Logger LOGGER =
            Logger.getLogger(PricingEngine.class.getName());
    private Double price;

    public Double getProductPrice() {
        return price;

    }

    @Scheduled(fixedRate = 400000)
    public void computePrice() throws InterruptedException {


        LOGGER.info("computing price at ");

        System.out.println("I am work");

        // added sleep to simulate method
        // which takes longer to execute.
//        Thread.sleep(4000);
    }
}
