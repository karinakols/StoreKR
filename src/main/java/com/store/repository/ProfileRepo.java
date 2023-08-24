package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entities.Profile;

public interface ProfileRepo extends JpaRepository<Profile, String>{

}
