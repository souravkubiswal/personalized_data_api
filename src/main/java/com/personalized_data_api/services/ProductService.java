package com.personalized_data_api.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalized_data_api.entities.ProductMetadata;
import com.personalized_data_api.entities.RelevancyScore;
import com.personalized_data_api.repositories.ProductMetadataRepository;
import com.personalized_data_api.repositories.RelevancyScoreRepository;

@Service
public class ProductService {

	@Autowired
    private ProductMetadataRepository productMetadataRepository;
	
	@Autowired
    private RelevancyScoreRepository relevancyScoreRepository;

    public List<ProductMetadata> getProducts(String shopperId) {
        List<RelevancyScore> relevancyScores = getRelevancyScores(shopperId);
        List<String> productIds = relevancyScores.stream().map(RelevancyScore::getProductId).collect(Collectors.toList());
        return productMetadataRepository.findAllById(productIds);
    }
    
    private List<RelevancyScore> getRelevancyScores(String shopperId) {
        return relevancyScoreRepository.findByShopperId(shopperId);
    }
}

