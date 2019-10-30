package com.skilldrive.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="products")
public class Product implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(name = "sequence-generator",
    	      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
    	    		  parameters = {@Parameter(name = "sequence_name", value = "product_sequence"),
    	    				  @Parameter(name = "initial_value", value = "40"),
    	    			        @Parameter(name = "increment_size", value = "1")
    	    			        }
    	        )
	
    @FormParam("productId")
    private Long productId;
    @Column
    @FormParam("productName")
    private String productName;
    @Column
    @FormParam("productaddress")
    private String address;
    
    public Product(){}

    public Product(Long productId, String productName, String address){
        this.productId = productId;
        this.productName = productName;
        this.address = address;
    }
    
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
