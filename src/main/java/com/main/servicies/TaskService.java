package com.main.servicies;

import java.util.List;

import com.main.entities.Task;

public interface TaskService {
	
	public List<Task> getAllTask();
	public void createTask(String title);
	public void deletTask(Long id);
	public void toggelTask(Long id);
}
