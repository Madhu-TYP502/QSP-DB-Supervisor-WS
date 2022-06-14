package com.tyss.dashboard.supervisor;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tyss.dashboard.supervisor.entities.StudentEntity;

public interface StudentRepository extends MongoRepository<StudentEntity, String> {
	public List<StudentEntity> findByBranch(String branch);

	public List<StudentEntity> findByBatchCode(String batchCode);

	public List<StudentEntity> findByBranchAndBatchCode(String branch, String batchCode);
}
