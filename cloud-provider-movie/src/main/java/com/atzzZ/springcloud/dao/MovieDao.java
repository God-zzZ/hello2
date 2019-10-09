package com.atzzZ.springcloud.dao;

import org.springframework.stereotype.Repository;

import com.atzzZ.springcloud.bean.Movie;

@Repository
public class MovieDao {
	public Movie getNewMovie() {
		Movie movie = new Movie();
		movie.setId(1);
		movie.setMovieName("战斗天使：阿丽塔");
		return movie;
	}
}

