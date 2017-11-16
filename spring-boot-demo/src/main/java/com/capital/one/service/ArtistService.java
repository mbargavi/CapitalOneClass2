package com.capital.one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capital.one.dao.ArtistDAO;
import com.capital.one.model.Artist;

@Transactional
@Service
public class ArtistService {
	
	@Autowired
	ArtistDAO artistDAO;
	
	public List<Artist> findAll() {
		return artistDAO.findAll();
	}
	
	public Artist findOne(int id) {
		return artistDAO.findOne(id);
	}

}
