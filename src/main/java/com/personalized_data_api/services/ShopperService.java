package com.personalized_data_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalized_data_api.entities.Shopper;
import com.personalized_data_api.repositories.ShopperRepository;

@Service
public class ShopperService {

	 @Autowired
	    private ShopperRepository shopperRepository;
	 
	 	public List<Shopper> getShoppersByIds(List<String> shopperIds) {
	        return shopperRepository.findByIdIn(shopperIds);
	    }

	    public Shopper createShopper(String name) {
	        Shopper shopper = new Shopper();
	        shopper.setName(name);
	        return shopperRepository.save(shopper);
	    }

	    public Shopper updateShopper(String shopperId, String name) {
	        Shopper shopper = shopperRepository.findById(shopperId).orElseThrow(() -> new RuntimeException("Shopper not found"));
	        shopper.setName(name);
	        return shopperRepository.save(shopper);
	    }

	   
}
