package com.capital.one.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.capital.one.model.Album;

public class AlbumDAOImpl implements AlbumDAO {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Album> listAll() {
		String sql = "SELECT * FROM albums";
		
		List<Album> list = jdbcTemplate.query(sql, new RowMapper<Album>() {
			@Override
			public Album mapRow(ResultSet rs, int nRows) throws SQLException {
				Album temp = new Album();
				
				temp.setId(rs.getInt("id"));
				temp.setTitle(rs.getString("title"));
				temp.setArtist_id(rs.getInt("artist_id"));
				
				return temp;
			}
		});
		
		return list;
	}

}





