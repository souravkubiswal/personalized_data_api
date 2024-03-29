package com.personalized_data_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "product_metadata", uniqueConstraints = @UniqueConstraint(columnNames = "product_id"))
public class ProductMetadata {

	@Id
	@Column(name = "product_id", nullable = false)
    private String productId;
	
	@Column(nullable = false)
    private String category;
	
	@Column(nullable = false)
    private String brand;
    
    
	
}
