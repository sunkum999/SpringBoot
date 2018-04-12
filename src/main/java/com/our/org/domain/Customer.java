package com.our.org.domain;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;

public class Customer {
	
	@Id
    public Integer id;

    public String firstName;
    public String lastName;
    private Shop shop;

    public Customer() {}

    public Customer(Integer id, String firstName, String lastName) {
        this.id = id;
    	this.firstName = firstName;
        this.lastName = lastName;
    }

    public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
    
    public  static class Shop {
    	@Id
    	private Integer id;
    	
    	private String shopName;
    	
    	@UniqueElements
    	private String reginstrationNo;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getShopName() {
			return shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getReginstrationNo() {
			return reginstrationNo;
		}

		public void setReginstrationNo(String reginstrationNo) {
			this.reginstrationNo = reginstrationNo;
		}
    }

}
