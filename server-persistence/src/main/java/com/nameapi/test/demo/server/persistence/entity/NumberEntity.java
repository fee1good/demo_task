package com.nameapi.test.demo.server.persistence.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Base implementation of the Number entity
 * @author Victor Korshunov
 */
@Entity
@Table(name = "number")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NumberEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Init value of the Number
     * Limit: your RAM
     */
    BigDecimal value;
}
