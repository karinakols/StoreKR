package com.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.store.dto.ProfileDTO;
import com.store.entities.Profile;
import com.store.entities.User;
import com.store.repository.ProfileRepo;

import jakarta.transaction.Transactional;

@Service
public class ProfileService implements IProfile {
	
	@Autowired
	ProfileRepo repo;

	@Override
	public ProfileDTO getProfile(String user_id) {
		Profile profileEntity=repo.findById(user_id).orElse(null);		
		if(profileEntity==null)
			throw new ResponseStatusException(HttpStatus.CONFLICT,"Profile not exists");
		
		ProfileDTO profile=new ProfileDTO(user_id, profileEntity.getFirt_name(), profileEntity.getSecond_name(), profileEntity.getAddress(), profileEntity.getCountry(), profileEntity.getPhone());
		
		return profile;
	}

	@Transactional
	@Override
	public boolean updateProfile(String user_id,ProfileDTO profile) {
		
		Profile entity=repo.findById(user_id).orElse(null);
		
		if(entity==null)
			return false;;
		
			
		Profile newProfileEntity=new Profile(user_id,profile.getFirt_name(), profile.getSecond_name(), profile.getAddress(), profile.getCountry(), profile.getPhone(), entity.getUser());
		
	
		repo.save(newProfileEntity)	;	
	    return true;
	}
	
	@Transactional
	@Override	
	public boolean addPhone(String user_id,ProfileDTO profile) {
		Profile entity=repo.findById(user_id).orElse(null);
		if(entity==null)		   
			return false;
		
		entity.setPhone(profile.getPhone());
		
		
		repo.save(entity);
		
		return true;
	}

	@Transactional
	@Override
	public boolean addAddress(String user_id, ProfileDTO profile) {
		Profile entity=repo.findById(user_id).orElse(null);
		if(entity==null)
			return false;
		
		entity.setAddress(profile.getAddress());
		
		repo.save(entity);
		
		return true;
	}

	@Transactional
	@Override
	public boolean addCountry(String user_id,ProfileDTO profile) {
		Profile entity=repo.findById(user_id).orElse(null);
		if(entity==null)
			return false;
		
		entity.setCountry(profile.getCountry());
		
		repo.save(entity);

		return true;
	}

}
