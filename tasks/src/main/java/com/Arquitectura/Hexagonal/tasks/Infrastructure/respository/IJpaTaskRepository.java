package com.Arquitectura.Hexagonal.tasks.Infrastructure.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arquitectura.Hexagonal.tasks.Infrastructure.entity.TaskEntity;

public interface IJpaTaskRepository  extends JpaRepository<TaskEntity, Long>{
	
	

}
