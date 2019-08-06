package com.nameapi.test.demo.server.api.endpoint;

import com.nameapi.test.demo.server.persistence.entity.NumberEntity;
import com.nameapi.test.demo.server.service.api.CalculationService;
import io.swagger.api.NumberApi;
import io.swagger.model.CalculatedValue;
import io.swagger.model.NumberModel;
import io.swagger.model.NumberToCreate;
import java.math.BigDecimal;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NumberController implements NumberApi {

    private CalculationService calculationService;

    @Override
    public ResponseEntity<NumberModel> createNewNumber(@Valid NumberToCreate numberToCreate) {
        return ResponseEntity.ok(convertNumber(calculationService.createNumber(numberToCreate.getValue())));
    }

    @Override
    public ResponseEntity<CalculatedValue> getAvgValue() {
        return ResponseEntity.ok(convertValue(calculationService.getAvg()));
    }

    @Override
    public ResponseEntity<CalculatedValue> getMaxValue() {
        return ResponseEntity.ok(convertValue(calculationService.getMax()));
    }

    @Override
    public ResponseEntity<CalculatedValue> getMinValue() {
        return ResponseEntity.ok(convertValue(calculationService.getMin()));
    }

    //TODO: Use MapStruct instead

    // -- Converters
    private NumberModel convertNumber(NumberEntity numberEntity) {
        NumberModel numberModel = new NumberModel();

        numberModel.setId(Math.toIntExact(numberEntity.getId()));
        numberModel.setValue(numberEntity.getValue());

        return numberModel;
    }

    private CalculatedValue convertValue(BigDecimal value) {
        CalculatedValue calculatedValue = new CalculatedValue();

        calculatedValue.setValue(value);

        return calculatedValue;
    }
}
