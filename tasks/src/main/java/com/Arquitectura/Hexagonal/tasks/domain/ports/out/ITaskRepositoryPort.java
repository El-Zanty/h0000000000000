package com.Arquitectura.Hexagonal.tasks.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;

public interface ITaskRepositoryPort {
	
	Task save(Task task);
	Optional<Task> finById(Long id);
	List<Task> finAll();
	Optional<Task> update(Task task);
	boolean deleteById(Long id);

}
