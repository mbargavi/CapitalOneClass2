package com.capital.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capital.one.dao.AlbumDAO;
import com.capital.one.model.AlbumList;

@RestController
public class AlbumController {
	@Autowired
	AlbumDAO dao;

	@RequestMapping(value="/album/all")
	public AlbumList getAll() {
		AlbumList list = new AlbumList();
		list.setAlbums(dao.listAll());
		return list;
	}
}




