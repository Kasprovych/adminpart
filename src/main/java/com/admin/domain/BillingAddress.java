package com.admin.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String BillingAddressName;
	private String BillingAddressStreet1;
	private String BillingAddressStreet2;
	private String BillingAddressCity;
	private String BillingAddressState;
	private String BillingAddressCountry;
	private String BillingAddressZipcode;
	
	@OneToOne
	private Order order;

	public String getBillingAddressName() {
		return BillingAddressName;
	}

	public String getBillingAddressStreet1() {
		return BillingAddressStreet1;
	}

	public String getBillingAddressStreet2() {
		return BillingAddressStreet2;
	}

	public String getBillingAddressCity() {
		return BillingAddressCity;
	}

	public String getBillingAddressState() {
		return BillingAddressState;
	}

	public String getBillingAddressCountry() {
		return BillingAddressCountry;
	}

	public String getBillingAddressZipcode() {
		return BillingAddressZipcode;
	}

	public Order getOrder() {
		return order;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBillingAddressName(String billingAddressName) {
		BillingAddressName = billingAddressName;
	}

	public void setBillingAddressStreet1(String billingAddressStreet1) {
		BillingAddressStreet1 = billingAddressStreet1;
	}

	public void setBillingAddressStreet2(String billingAddressStreet2) {
		BillingAddressStreet2 = billingAddressStreet2;
	}

	public void setBillingAddressCity(String billingAddressCity) {
		BillingAddressCity = billingAddressCity;
	}

	public void setBillingAddressState(String billingAddressState) {
		BillingAddressState = billingAddressState;
	}

	public void setBillingAddressCountry(String billingAddressCountry) {
		BillingAddressCountry = billingAddressCountry;
	}

	public void setBillingAddressZipcode(String billingAddressZipcode) {
		BillingAddressZipcode = billingAddressZipcode;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	
	
}
