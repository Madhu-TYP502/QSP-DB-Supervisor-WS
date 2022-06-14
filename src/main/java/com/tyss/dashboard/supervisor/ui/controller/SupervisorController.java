package com.tyss.dashboard.supervisor.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.dashboard.supervisor.external.api.FlinkoDataCLI;
import com.tyss.dashboard.supervisor.external.api.FlinkoMockDataRes;
import com.tyss.dashboard.supervisor.model.FlinkoUser;
import com.tyss.dashboard.supervisor.model.dashboard.component.DashboardComponents;
import com.tyss.dashboard.supervisor.service.FlinkoStatsServiceImpl;

@RestController
@RequestMapping("supv/")
public class SupervisorController {

	@Autowired
	FlinkoDataCLI flinkoDataCLI;

	@Autowired
	FlinkoMockDataRes mockDataRes;

	@Autowired
	FlinkoStatsServiceImpl flinkoStatsServiceImpl;

	@GetMapping("status")
	public String status() {
		return "working";
	}
	
	@PostMapping("add/flinko/users")
	public ResponseEntity<String> addFlinkoStudents(List<FlinkoUser> flinkoUsers) {

		return mockDataRes.addUsers(flinkoUsers);
	}

	@GetMapping("get/flinko/users")
	public List<FlinkoUser> getStudents() {

		return mockDataRes.getUsers();
		// return flinkoDataCLI.getStudents();
	}

	@GetMapping("get/flinko/stats/")
	public ResponseEntity<DashboardComponents> getStats() {

		return flinkoStatsServiceImpl.getStatistics();

	}

}
