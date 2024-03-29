package com.personalized_data_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.personalized_data_api.entities.Shopper;
import com.personalized_data_api.services.ProductService;
import com.personalized_data_api.services.ShopperService;

@RestController
@RequestMapping("/api/shoppers")
public class ShopperController {

	@Autowired
    private ShopperService shopperService;

    @Autowired
    private ProductService productService;

    @GetMapping("/{shopperIds}")
    public ResponseEntity<List<Shopper>> getShoppers(@PathVariable List<String> shopperIds) {
        List<Shopper> shoppers = shopperService.getShoppersByIds(shopperIds);
        return ResponseEntity.ok(shoppers);
    }

    @PostMapping
    public ResponseEntity<Shopper> createShopper(@RequestBody Shopper shopper) {
        Shopper createdShopper = shopperService.createShopper(shopper.getName());
        return ResponseEntity.ok(createdShopper);
    }

    @PutMapping("/{shopperId}")
    public ResponseEntity<Shopper> updateShopper(@PathVariable String shopperId, @RequestBody Shopper shopper) {
        Shopper updatedShopper = shopperService.updateShopper(shopperId, shopper.getName());
        return ResponseEntity.ok(updatedShopper);
    }
}
