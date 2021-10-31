package com.onlinebanking.mortgage.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Valuation {

	@Id
	Long valuationId;
	String contactName;
	int contactNumber;
	String contactPerson;
	int isPropertyInScotland;
	//long userId;
	@OneToOne
	PropertyDetails propertyDetails;
	
}
