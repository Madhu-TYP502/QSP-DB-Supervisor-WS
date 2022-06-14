package com.tyss.dashboard.supervisor.service;

import org.springframework.http.ResponseEntity;

import com.tyss.dashboard.supervisor.model.dashboard.component.DashboardComponents;

public interface FlinkoStatsService {

	public ResponseEntity<DashboardComponents> getStatistics();
}
