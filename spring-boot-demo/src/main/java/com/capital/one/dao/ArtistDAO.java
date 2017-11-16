package com.capital.one.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capital.one.model.Artist;

public interface ArtistDAO extends JpaRepository<Artist, Integer>{
	
}
