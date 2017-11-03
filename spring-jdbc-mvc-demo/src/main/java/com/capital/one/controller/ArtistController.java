package com.capital.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capital.one.dao.ArtistDAOImpl;
import com.capital.one.model.Artist;

@Controller
public class ArtistController {
	@Autowired
	ArtistDAOImpl artistDAO;
	
	@GetMapping("/all")
	public @ResponseBody List<Artist> listAll() {
		List<Artist> listArtists = artistDAO.listAll();
		return listArtists;
	}
	
	@GetMapping("/delete/{id}")
	public @ResponseBody String delete(@PathVariable("id") int id) {
		artistDAO.delete(id);
		return "deleted";
	}
}
