package com.capital.one.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class JDBCDriver {

	public static void main(String[] args) {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new org.postgresql.Driver());
		dataSource.setUrl("jdbc:postgresql://localhost:5432/Chinook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("rahman");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sql = "";
		
		//update
		sql = "UPDATE artists set name=? where id=?";
		jdbcTemplate.update(sql, "DemoAlbum", 4);
		
		/*
		 * jdbcTemplate.query(sql, result)
		 */
		sql = "SELECT * FROM artists";
		List<Artist> listArtists = jdbcTemplate.query(sql, new RowMapper<Artist>() {
			public Artist mapRow(ResultSet rs, int nRows) throws SQLException {
				Artist a = new Artist();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				
				return a;
			}
		});
		
		//System.out.println(listArtists.toString());
		for (Artist a : listArtists) {
			System.out.println(a);
		}		
	}

}
