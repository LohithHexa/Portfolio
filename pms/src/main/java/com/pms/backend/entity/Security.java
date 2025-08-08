package com.pms.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "securities")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exchange")
    private String exchange;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "name")
    private String name;

    @Column(name = "isin")
    private String isin;

    @Column(name = "sector")
    private String sector;

    @Column(name = "industry")
    private String industry;

    @Column(name = "currency")
    private String currency;

    @Column(name = "country")
    private String country;

    @Column(name = "security_code")
    private String securityCode;

    @Column(name = "series")
    private String series;

    @ManyToOne
    @JoinColumn(name = "asset_class_id")
    private AssetClass assetClass;

    // Getters and setters
}
