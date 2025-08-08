package com.pms.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "theme_allocations")
public class ThemeAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "theme_id")
    private InvestmentTheme theme;

    @ManyToOne
    @JoinColumn(name = "asset_class_id")
    private AssetClass assetClass;

    @Column(name = "allocation_percent")
    private Double allocationPercent;

    // Getters and setters
}
