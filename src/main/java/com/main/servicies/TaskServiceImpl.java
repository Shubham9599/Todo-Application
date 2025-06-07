package com.main.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.main.entities.Task;
import com.main.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository repository;
	 
	@Override
	public List<Task> getAllTask() {
		repository.findAll();
		return repository.findAll();
	}

	@Override
	public void createTask( String title) {
		Task task=new Task();
		task.setTitle(title);
		task.setCompleted(false);
		repository.save(task);
		
		
	}

	public void deletTask(Long id) {
		repository.deleteById(id);
	}

	public void toggelTask(Long id) {
		Task task = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("In valid Task id"));
				task.setCompleted(!task.isCompleted());
				repository.save(task);
		
	}

}
