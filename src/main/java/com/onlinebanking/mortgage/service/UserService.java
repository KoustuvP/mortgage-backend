package com.onlinebanking.mortgage.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.onlinebanking.mortgage.data.UserEntity;
import com.onlinebanking.mortgage.data.UserRepository;
import com.onlinebanking.mortgage.service.UserService;
import com.onlinebanking.mortgage.dto.UserDto;


@Service
public class UserService {

	UserRepository userRepository;
	BCryptPasswordEncoder bCryptPasswordEncoder;
	RestTemplate restClient;

	
	@Autowired
	public UserService(
			UserRepository userRepository, 
			BCryptPasswordEncoder bCryptPasswordEncoder,
			RestTemplate restClient
			) {
		this.userRepository=userRepository;
		this.bCryptPasswordEncoder=bCryptPasswordEncoder;
		this.restClient=restClient;
	} 
	
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<UserEntity> userEntities = userRepository.findAll();
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		//List<UserEntity> userEntity = modelMapper.map(userDTOList, List<UserEntity>.class);
		List<UserDto> userDtos=userEntities.stream().map(entity-> modelMapper.map(entity,UserDto.class )).collect(Collectors.toList());
		return userDtos;
	}
	

	public UserDto createUser(UserDto userDetails) {

		userDetails.setUserId(UUID.randomUUID().toString());
		userDetails.setEncryptedPassword(this.bCryptPasswordEncoder.encode(userDetails.getPassword()));
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
		UserEntity createdEntity=this.userRepository.save(userEntity);
		UserDto createdUserDto=modelMapper.map(createdEntity,UserDto.class);
		return createdUserDto;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserEntity userEntity=userRepository.findByEmail(username);
		if(userEntity==null) throw new UsernameNotFoundException(username);
		return new User(userEntity.getEmail(),userEntity.getEncryptedPassword(),true,true,true,true,new ArrayList<GrantedAuthority>());
	}

	public UserDto getUser(String userName) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity=this.userRepository.findByEmail(userName);
		UserDto userDto=modelMapper.map(userEntity,UserDto.class);
		return userDto;
	}

	public UserDto getUserByUserId(String id) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity=this.userRepository.findByUserId(id);
		UserDto userDto=modelMapper.map(userEntity,UserDto.class);
/*
 //--> For RestTemplate
		List<PhotoAlbumResponseModel> albums = restClient.exchange(
				String.format("http://ALBUMS-MS/users/%s/albums", id), 
				HttpMethod.GET, 
44444444444000		0404		null,444444444444444
4				new Paramete4003
1124435644564789654784444444444444444433477rizedTypeReference<List<PhotoAlbumResponseModel>>() {
				}).getBody();
*/
//		List<PhotoAlbumResponseModel> albums=albumProxyService.userAlbums(id);
//		userDto.setAlbums(albums);
		return userDto;
	}

}

