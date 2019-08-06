package com.nameapi.test.demo.server.persistence.repository;

import com.nameapi.test.demo.server.persistence.entity.NumberEntity;
import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends JpaRepository<NumberEntity, Long> {

    //TODO: user JPA instead of queries

    @Query("SELECT max(n.value) FROM NumberEntity n")
    BigDecimal getMax();

    @Query("SELECT avg(n.value) FROM NumberEntity n")
    BigDecimal getAvg();

    @Query("SELECT min(n.value) FROM NumberEntity n")
    BigDecimal getMin();
}
