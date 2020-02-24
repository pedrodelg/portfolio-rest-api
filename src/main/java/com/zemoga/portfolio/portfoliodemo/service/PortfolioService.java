package com.zemoga.portfolio.portfoliodemo.service;

import com.zemoga.portfolio.portfoliodemo.entity.Portfolio;

public interface PortfolioService {

	public Portfolio findPortfolioById(int id);
	
	public void save(Portfolio portfolio); 
}
