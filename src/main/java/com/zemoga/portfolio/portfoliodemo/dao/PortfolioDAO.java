package com.zemoga.portfolio.portfoliodemo.dao;

import com.zemoga.portfolio.portfoliodemo.entity.Portfolio;

public interface PortfolioDAO {

	public Portfolio findPortfolioById(int id);
	
	public void save(Portfolio thePortfolio);
	
}
