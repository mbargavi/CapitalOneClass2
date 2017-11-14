package com.capital.one.dao;

import java.util.List;

import com.capital.one.model.Artist;

public interface ArtistDAO {
	public Artist getArtist(int id);
	
	public List<Artist> getAll();
}
