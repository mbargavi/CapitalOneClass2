package com.capital.one.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="albums")
public class AlbumList implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Album> albums = new ArrayList<Album>();

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
}
