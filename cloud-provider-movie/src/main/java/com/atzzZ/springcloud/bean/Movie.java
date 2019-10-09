package com.atzzZ.springcloud.bean;

public class Movie {
	private Integer id;
	private String movieName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public Movie(Integer id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + "]";
	}
	
}
