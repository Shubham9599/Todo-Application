package com.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.entities.Task;
import com.main.repository.TaskRepository;
import com.main.servicies.TaskServiceImpl;

@Controller
public class controller {

	@Autowired
	private TaskServiceImpl taskservice;

	@GetMapping("/")
	public String getTask(@ModelAttribute Task task, Model model) {
		List<Task> taskAll = taskservice.getAllTask();
		model.addAttribute("tasks", taskAll);
		return "tasks";
	}

	@PostMapping("")
	public String addTask(@RequestParam String title) {
		taskservice.createTask(title);
		return "redirect:/";
	}

	@GetMapping("/{id}/delet")
	public String deletTask(@PathVariable Long id) {
		taskservice.deletTask(id);
		return "redirect:/";
	}
	
	@GetMapping("/{id}/toggle")
	public String toggelTask(@PathVariable Long id) {
		taskservice.toggelTask(id);
		return "redirect:/";
	}
	
}
