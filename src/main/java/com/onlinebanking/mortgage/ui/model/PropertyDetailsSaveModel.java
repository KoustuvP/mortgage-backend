package com.onlinebanking.mortgage.ui.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyDetailsSaveModel {
	Long userId;
	String isPropertyCovered;
	int numberOfBedrooms;
	String postCode;
	String propertyAddress;
	int propertyAge;
	String propertyBuilt;
	String propertyType;
	String tenureType;
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
	@Override
	public String toString() {
		return "PropertyDetailsSaveModel [userId=" + userId + ", isPropertyCovered=" + isPropertyCovered
				+ ", numberOfBedrooms=" + numberOfBedrooms + ", postCode=" + postCode + ", propertyAddress="
				+ propertyAddress + ", propertyAge=" + propertyAge + ", propertyBuilt=" + propertyBuilt
				+ ", propertyType=" + propertyType + ", tenureType=" + tenureType + "]";
	}
	
	
}
