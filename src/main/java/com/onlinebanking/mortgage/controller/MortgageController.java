package com.onlinebanking.mortgage.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebanking.mortgage.data.PropertyDetails;
import com.onlinebanking.mortgage.data.PropertyDetailsRepository;
import com.onlinebanking.mortgage.ui.model.PropertyDetailsSaveModel;

@RestController
@RequestMapping("/mortgage")
public class MortgageController {

	@Autowired
	PropertyDetailsRepository propertyDetailsRepo;
	 
	@PostMapping("/property-details")
	public void savePropertyDetails(@RequestBody PropertyDetailsSaveModel propeertyDetailsRequestObject) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		PropertyDetails propertyDetails=modelMapper.map(propeertyDetailsRequestObject, PropertyDetails.class);
		System.out.println(propeertyDetailsRequestObject.toString());
		propertyDetailsRepo.save(propertyDetails);
		
	}
}
