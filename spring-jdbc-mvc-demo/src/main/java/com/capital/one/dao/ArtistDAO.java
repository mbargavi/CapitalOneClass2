package com.capital.one.dao;

import java.util.List;

import com.capital.one.model.Artist;

public interface ArtistDAO {
	public void save(Artist artist);
	
	public void delete(int id);
	
	public Artist get(int id);
	
	public List<Artist> listAll();
}
