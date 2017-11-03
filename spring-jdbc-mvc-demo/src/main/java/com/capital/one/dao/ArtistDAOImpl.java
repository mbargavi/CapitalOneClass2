package com.capital.one.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.capital.one.model.Artist;

@Repository
public class ArtistDAOImpl implements ArtistDAO {
	private JdbcTemplate jdbcTemplate;
	
	public ArtistDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(Artist artist) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM artists WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public Artist get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artist> listAll() {
		String sql = "SELECT * FROM artists";
		
		List<Artist> listArtists = jdbcTemplate.query(sql, new RowMapper<Artist>() {
			@Override
			public Artist mapRow(ResultSet rs, int nRows) throws SQLException {
				Artist a = new Artist();
				
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				
				return a;
			}
		});
		
		return listArtists;		
	}

}
