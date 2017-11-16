package com.capital.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capital.one.model.Artist;
import com.capital.one.service.ArtistService;

@CrossOrigin
@RestController
@RequestMapping("/api/artist")
public class ArtistController {
	@Autowired
	ArtistService artistService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Artist getArtistById(@PathVariable("id") int id) throws Exception {
		return artistService.findOne(id);
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Artist> getAll() {
		return artistService.findAll();
	}
}
















