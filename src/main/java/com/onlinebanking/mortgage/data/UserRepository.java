package com.onlinebanking.mortgage.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findByEmail(String username);

	UserEntity findByUserId(String id);

}
