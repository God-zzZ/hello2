package com.atzzZ.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atzzZ.springcloud.bean.Movie;
import com.atzzZ.springcloud.dao.MovieDao;

@Service
public class MovieService {
	@Autowired
	MovieDao movieDao;

	public Movie getNewMovie() {
		return movieDao.getNewMovie();
	}
}
