package com.pms.backend.serviceimpl;

import com.pms.backend.entity.AssetClass;
import com.pms.backend.repository.AssetClassRepository;
import com.pms.backend.service.AssetClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetClassServiceImpl implements AssetClassService {

    @Autowired
    private AssetClassRepository assetClassRepository;

    @Override
    public List<AssetClass> getAllAssetClasses() {
        return assetClassRepository.findAll();
    }

    @Override
    public AssetClass getAssetClassById(Long id) {
        return assetClassRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asset Class not found with ID: " + id));
    }
}
