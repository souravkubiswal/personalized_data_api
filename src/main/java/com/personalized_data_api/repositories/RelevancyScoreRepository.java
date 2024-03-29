package com.personalized_data_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personalized_data_api.entities.RelevancyScore;

@Repository
public interface RelevancyScoreRepository extends JpaRepository<RelevancyScore, Long> {
	
	 List<RelevancyScore> findByShopperId(String shopperId);
}
