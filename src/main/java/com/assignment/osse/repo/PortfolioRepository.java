package com.assignment.osse.repo;

import java.util.List;

import com.assignment.osse.service.dto.Portfolio;

public interface PortfolioRepository {
	public List<Portfolio> findAllByPortFolioName(String portfolioName);
}
