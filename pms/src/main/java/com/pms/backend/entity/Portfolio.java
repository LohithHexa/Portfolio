package com.pms.backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "currency")
    private String currency;

    @Column(name = "benchmark")
    private String benchmark;

    @Column(name = "exchange")
    private String exchange;

    @Column(name = "initial_investment")
    private BigDecimal initialInvestment;

    @Column(name = "current_value")
    private BigDecimal currentValue;

    @Column(name = "rebalancing_frequency")
    private String rebalancingFrequency;

    @ManyToOne
    @JoinColumn(name = "theme_id")
    private InvestmentTheme theme;

    @Column(name = "status")
    private String status;

    // Getters and setters
}
