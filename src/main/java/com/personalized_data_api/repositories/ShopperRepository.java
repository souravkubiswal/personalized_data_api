package com.personalized_data_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personalized_data_api.entities.Shopper;

@Repository
public interface ShopperRepository extends JpaRepository<Shopper, String> {

	 Shopper findByShopperId(String shopperId);

	 List<Shopper> findByIdIn(List<String> shopperId);
}