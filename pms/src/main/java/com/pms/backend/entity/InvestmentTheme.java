package com.pms.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "investment_themes")
public class InvestmentTheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "risk_level")
    private String riskLevel;

    @Column(name = "investment_horizon")
    private String investmentHorizon;

    // Getters and setters
}
