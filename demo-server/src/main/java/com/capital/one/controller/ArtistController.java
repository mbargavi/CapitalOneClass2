package com.capital.one.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capital.one.dao.ArtistDAO;
import com.capital.one.model.Artist;

@CrossOrigin
@RestController
@RequestMapping("/api/artist")
public class ArtistController {
	@Autowired
	ArtistDAO artistDAO;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Artist getArtistById(@PathVariable("id") int id) {
		Artist artist = new Artist();
		artist = artistDAO.getArtist(id);
		return artist;
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Artist> getAll() {
		List<Artist> list = new ArrayList<Artist>();
		list = artistDAO.getAll();
		return list;
	}
}
















