package com.onlinebanking.mortgage.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

//PAYMENT_ID  	ACCOUNT_HOLDER_NAME  	ACCOUNT_NUMBER  	CURRENTCIRCUMSTANCES  	DAY_OF_PAYMENT  	SORT_CODE  	USER_ID  
@Data
@NoArgsConstructor
@Entity
public class PaymentDetails {
	@Id
	long paymentId;
	String accountHolderName;
	int accountNumber;
	int currentCircumstances;
	int dayOfPayment;
	int sortCode;
	//long userId;
	@OneToOne
	PropertyDetails propertyDetails;
}
