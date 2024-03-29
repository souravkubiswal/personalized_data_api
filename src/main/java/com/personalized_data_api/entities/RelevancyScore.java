package com.personalized_data_api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "relevancy_score")
public class RelevancyScore {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
		private Long id;
		
		@Column(name = "shopper_id", nullable = false)
	    private String shopperId;
		
		@Column(name = "product_id", nullable = false, length = 255)
	    private String productId;
		
		@Column(name = "relevancy_score", nullable = false, length = 255)
	    private Double relevancyScore;
		
//		@ManyToOne
//	    @JoinColumn(name = "shopper_id", referencedColumnName = "shopper_id", insertable = false, updatable = false)
//	    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	    private Shopper shopper;
		
		@ManyToOne
		@JoinColumn(name = "shopper_id", referencedColumnName = "shopper_id", insertable = false, updatable = false)
		private Shopper shopper;


	    @ManyToOne
	    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
	    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    private ProductMetadata productMetadata;
	    
	    
	    
}
