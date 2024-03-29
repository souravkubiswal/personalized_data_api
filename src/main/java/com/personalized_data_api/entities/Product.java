package com.personalized_data_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "product", uniqueConstraints = @UniqueConstraint(columnNames = "product_id"))
public class Product {

		@Id
	    private String productId;
	    private String category;
	    private String brand;
	     
	    
}
