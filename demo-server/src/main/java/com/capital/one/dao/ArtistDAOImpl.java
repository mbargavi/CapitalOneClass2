package com.capital.one.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.capital.one.model.Artist;

public class ArtistDAOImpl implements ArtistDAO{
	private JdbcTemplate jdbcTemplate;
	
	public ArtistDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Artist getArtist(int id) {
		String sql = "SELECT * FROM artists WHERE id=" + id;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Artist>() {

			public Artist extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					Artist artist = new Artist();
					artist.setId(rs.getInt("id"));
					artist.setName(rs.getString("name"));
					return artist;
				}
				return null;
			}
			
		});
	}

	public List<Artist> getAll() {
		String sql = "SELECT * FROM artists";
		List<Artist> list = jdbcTemplate.query(sql, new RowMapper<Artist>() {

			public Artist mapRow(ResultSet rs, int rowNum) throws SQLException {
				Artist artist = new Artist();
				artist.setId(rs.getInt("id"));
				artist.setName(rs.getString("name"));
				return artist;
			}
			
		});
		
		return list;
	}

}

















