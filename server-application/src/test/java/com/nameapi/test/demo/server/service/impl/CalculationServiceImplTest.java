package com.nameapi.test.demo.server.service.impl;

import com.nameapi.test.demo.DemoApplication;
import com.nameapi.test.demo.server.persistence.entity.NumberEntity;
import com.nameapi.test.demo.server.persistence.repository.NumberRepository;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculationServiceImplTest {

    @Autowired
    CalculationServiceImpl subj;
    @MockBean
    NumberRepository numberRepository;

    private NumberEntity numberEntity;

    @Before
    public void setup() {
        numberEntity = new NumberEntity();
        numberEntity.setValue(BigDecimal.TEN);
    }

    @Test
    public void createNumber_shouldNotBeNull() {
        when(numberRepository.save(any())).thenReturn(numberEntity);

        NumberEntity entity = subj.createNumber(BigDecimal.ZERO);

        assertThat(entity).isNotNull();
    }
}