package com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.dto.ProfileDTO;
import com.store.entities.Profile;
import com.store.service.IProfile;

@RestController
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired
	private IProfile service;
	
	@GetMapping("/getProfile/{user_id}")
	public ProfileDTO getProfile(@PathVariable ("user_id") String user_id) {
		
		return service.getProfile(user_id);
	}
	
	
	@PostMapping("/{user_id}/updateProfile")
	public boolean updateProfile(@PathVariable String user_id ,@RequestBody ProfileDTO profile)
	
	{
		return service.updateProfile(user_id,profile);
		
	}
	
	
	@PutMapping("/{user_id}/addPhone")
	public boolean addPhone(@PathVariable ("user_id") String user_id,@RequestBody ProfileDTO profile)		
	{
		return service.addPhone(user_id, profile);
	}
	
	@PutMapping("/{user_id}/addAddress")
	public boolean addAddress(@PathVariable ("user_id") String user_id, @RequestBody ProfileDTO profile)
	{
		return service.addAddress(user_id, profile);
	}
	
	@PutMapping("/{user_id}/addCountry")
	public boolean addCountry(@PathVariable ("user_id") String user_id,@RequestBody ProfileDTO profile)
	{
		return service.addCountry(user_id, profile);
	}
	

}
