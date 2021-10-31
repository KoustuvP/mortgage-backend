package com.onlinebanking.mortgage.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@IdClass(UserPropertyId.class)
public class PropertyDetails {

	@Id
    @Column(name = "property_id")
    @GeneratedValue
    private Long propertyId;
 
    @Id
    @Column(name = "user_id")
    private Long userId;
	@Column
	String isPropertyCovered;
	@Column
	int numberOfBedrooms;
	@Column
	String postCode;
	@Column
	String propertyAddress;
	@Column
	int propertyAge;
	@Column
	String propertyBuilt;
	@Column
	String propertyType;
	@Column
	String tenureType;
	
	public PropertyDetails() {
		super();
	}
	public PropertyDetails(Long propertyId, Long userId, String isPropertyCovered, int numberOfBedrooms,
			String postCode, String propertyAddress, int propertyAge, String propertyBuilt, String propertyType,
			String tenureType) {
		super();
		this.propertyId = propertyId;
		this.userId = userId;
		this.isPropertyCovered = isPropertyCovered;
		this.numberOfBedrooms = numberOfBedrooms;
		this.postCode = postCode;
		this.propertyAddress = propertyAddress;
		this.propertyAge = propertyAge;
		this.propertyBuilt = propertyBuilt;
		this.propertyType = propertyType;
		this.tenureType = tenureType;
	}
	public Long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getIsPropertyCovered() {
		return isPropertyCovered;
	}
	public void setIsPropertyCovered(String isPropertyCovered) {
		this.isPropertyCovered = isPropertyCovered;
	}
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public int getPropertyAge() {
		return propertyAge;
	}
	public void setPropertyAge(int propertyAge) {
		this.propertyAge = propertyAge;
	}
	public String getPropertyBuilt() {
		return propertyBuilt;
	}
	public void setPropertyBuilt(String propertyBuilt) {
		this.propertyBuilt = propertyBuilt;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getTenureType() {
		return tenureType;
	}
	public void setTenureType(String tenureType) {
		this.tenureType = tenureType;
	}
	
	

}
