package com.nameapi.test.demo.server.service.api;

import com.nameapi.test.demo.server.persistence.entity.NumberEntity;
import java.math.BigDecimal;

/**
 * CRUD operations for numbers (for now just CREATE)
 * Calculation min/max/avg values
 */
public interface CalculationService {

    //TODO: IMO there is no needs to write JavaDocs for the readable titles

    NumberEntity createNumber(BigDecimal value);

    BigDecimal getMin();

    BigDecimal getMax();

    BigDecimal getAvg();
}
