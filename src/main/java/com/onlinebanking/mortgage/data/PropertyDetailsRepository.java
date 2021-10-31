package com.onlinebanking.mortgage.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDetailsRepository extends JpaRepository<PropertyDetails,UserPropertyId> {

}
