package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit",precision = 2, scale = 13)
    private BigDecimal limit;

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getLimit() {
        return limit;
    }
}
