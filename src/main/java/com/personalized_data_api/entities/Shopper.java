package com.personalized_data_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "shopper")
public class Shopper {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopper_id")
//	    @Column(name = "shopper_id", nullable = false, length = 255)
	    private String shopperId;
	    
	    @Column(name = "name", nullable = false, length = 255)
	    private String name;
	    
	    
			    
}


