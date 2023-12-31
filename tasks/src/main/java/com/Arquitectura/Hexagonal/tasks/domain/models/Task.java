package com.Arquitectura.Hexagonal.tasks.domain.models;

import java.time.LocalDateTime;

public class Task {

	private long id;
	private String title;
	private String description;
	private LocalDateTime creationDate;
	private boolean completed;
	
	
	//CONTROllER//
	
	public Task(Long id, String title, String description, LocalDateTime creationDate, boolean completed){
		this.id = id;
		this.title = title;
		this.description = description;
		this.creationDate = creationDate;
		this.completed = completed;
	}

	//GET Y SET //
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public LocalDateTime getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}


	public boolean isCompleted() {
		return completed;
	}


	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
		
	
	
}
