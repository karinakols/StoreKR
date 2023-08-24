package com.store.service;

import com.store.dto.ProfileDTO;
import com.store.entities.Profile;

public interface IProfile {
	ProfileDTO getProfile(String user_id);
	boolean updateProfile(String user_id,ProfileDTO profile);
	boolean addPhone(String user_id, ProfileDTO profile);
	boolean addAddress(String user_id,ProfileDTO profile);	
	boolean addCountry(String user_id,ProfileDTO profile);

}
