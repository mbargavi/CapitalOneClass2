package com.capital.one.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capital.one.dao.ArtistDAO;
import com.capital.one.model.Artist;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {
	@Autowired
	ArtistDAO artistDAO;
	
	@GetMapping("/all")
	public ResponseEntity<List<Artist>> getAll() {
		List<Artist> allArtists = new ArrayList<>();
		allArtists = artistDAO.listAll();
		return ResponseEntity.ok(allArtists);
	}
	
	@PostMapping("/post")
	public void changeArtist(@RequestBody Artist artist) {
		System.out.println(artist.toString());
		
	}

}









