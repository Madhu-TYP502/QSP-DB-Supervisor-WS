package com.tyss.dashboard.supervisor.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tyss.dashboard.supervisor.entities.StudentEntity;

@FeignClient(name = "admin-service")
public interface AdminServiceClient {

	@GetMapping("/admin/view/all/students")
	List<StudentEntity> getAllStudents();
}
