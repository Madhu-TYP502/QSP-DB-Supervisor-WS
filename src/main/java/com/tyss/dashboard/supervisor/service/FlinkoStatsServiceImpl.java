package com.tyss.dashboard.supervisor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.dashboard.supervisor.entities.StudentEntity;
import com.tyss.dashboard.supervisor.external.api.FlinkoDataCLI;
import com.tyss.dashboard.supervisor.external.api.FlinkoMockDataRes;
import com.tyss.dashboard.supervisor.model.FlinkoUser;
import com.tyss.dashboard.supervisor.model.dashboard.component.DashboardComponents;

@Service
public class FlinkoStatsServiceImpl implements FlinkoStatsService {

	@Autowired
	FlinkoDataCLI flinkoDataCLI;

	@Autowired
	AdminServiceClient adminServiceClient;

	@Autowired
	FlinkoMockDataRes mockDataRes;

	@Override
	public ResponseEntity<DashboardComponents> getStatistics() {

		List<FlinkoUser> flinkoUsers = mockDataRes.getUsers();// flinko user data

		List<StudentEntity> students = adminServiceClient.getAllStudents();// dashboard data

		List<String> flnkEmails = new ArrayList<String>();
		List<String> studentsEmails = new ArrayList<String>();

		flinkoUsers.forEach(fln -> flnkEmails.add(fln.getEmail()));
		students.forEach(std -> studentsEmails.add(std.getEmail()));
		
		
		List<String> unRegisteredStudents = new ArrayList<>(studentsEmails);
		
		unRegisteredStudents.removeIf(email -> !flnkEmails.contains(email));
		
		System.out.println("Flinko Emails");
		System.out.println(flnkEmails);
		
		System.out.println("Students Emails");
		System.out.println(studentsEmails);
		
		System.out.println("Unregistered Emails");
		System.out.println(unRegisteredStudents);
		

		return null;
	}

}
