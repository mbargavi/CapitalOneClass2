package com.capital.one.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.capital.one.dao.ArtistDAO;
import com.capital.one.dao.ArtistDAOImpl;

@Configuration
@ComponentScan(basePackages="com.capital.one")
@EnableWebMvc
public class WebConfig {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/Chinook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("rahman");
		
		return dataSource;
	}
	
	@Bean
	public ArtistDAO getArtistDAO() {
		return new ArtistDAOImpl(getDataSource());
	}
}






