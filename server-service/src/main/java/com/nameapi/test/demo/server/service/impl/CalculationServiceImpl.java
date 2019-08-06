package com.nameapi.test.demo.server.service.impl;

import com.nameapi.test.demo.server.persistence.entity.NumberEntity;
import com.nameapi.test.demo.server.persistence.repository.NumberRepository;
import com.nameapi.test.demo.server.service.api.CalculationService;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalculationServiceImpl implements CalculationService {

    private NumberRepository numberRepository;

    @Override
    public NumberEntity createNumber(BigDecimal value) {
        NumberEntity numberEntity = new NumberEntity();
        numberEntity.setValue(value);

        return numberRepository.save(numberEntity);
    }

    @Override
    public BigDecimal getMin() {
        return numberRepository.getMin();
    }

    @Override
    public BigDecimal getMax() {
        return numberRepository.getMax();
    }

    @Override
    public BigDecimal getAvg() {
        return numberRepository.getAvg();
    }
}
