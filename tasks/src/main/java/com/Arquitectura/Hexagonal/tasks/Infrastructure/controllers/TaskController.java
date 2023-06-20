package com.Arquitectura.Hexagonal.tasks.Infrastructure.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arquitectura.Hexagonal.tasks.aplication.service.TaskService;
import com.Arquitectura.Hexagonal.tasks.domain.models.Task;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@PostMapping
	public ResponseEntity<Task> createTask(@RequestBody Task task){
		Task creaTask = taskService.createTask(task);
		return new ResponseEntity<>(creaTask, HttpStatus.CREATED);
	}
	
	@GetMapping("/{taskId}")
	public ResponseEntity<Task> getTaskByid(@PathVariable Long taskid){
		return taskService.getTask(taskid)
				.map(task -> new ResponseEntity<>(task, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping
	public ResponseEntity<List<Task>> getAllTasks(){
		List<Task> task = taskService.getAllTasks();
		return new ResponseEntity(task, HttpStatus.OK);

	}
	
	@PutMapping()
	
}