package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.main.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {



	
}
