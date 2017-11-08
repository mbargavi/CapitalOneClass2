package com.capital.one.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="album")
@XmlAccessorType(XmlAccessType.NONE)
public class Album implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@XmlAttribute
	private int id;
	
	@XmlElement
	private String title;
	
	@XmlElement
	private int artist_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}

	public Album(int id, String title, int artist_id) {
		super();
		this.id = id;
		this.title = title;
		this.artist_id = artist_id;
	}

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", artist_id=" + artist_id + "]";
	}

}
