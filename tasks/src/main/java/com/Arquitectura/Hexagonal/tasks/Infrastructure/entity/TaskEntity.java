package com.Arquitectura.Hexagonal.tasks.Infrastructure.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;

@Entity
public class TaskEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private LocalDateTime creationdate;
	private boolean completed;
	
	public TaskEntity() {
		
	}

	public TaskEntity(Long id, String title, String description, LocalDateTime creationdate, boolean completed) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.creationdate = creationdate;
		this.completed = completed;
	}

	public static TaskEntity fromDominMoel(Task task) {
		return new TaskEntity(task.getId(), task.getTitle(), task.getDescription(), task.getCreationDate(),task.isCompleted());
	}
	
	public Task toDoaminModel() {
		return new Task(id, title, description, creationdate, completed);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(LocalDateTime creationdate) {
		this.creationdate = creationdate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	
	
}
