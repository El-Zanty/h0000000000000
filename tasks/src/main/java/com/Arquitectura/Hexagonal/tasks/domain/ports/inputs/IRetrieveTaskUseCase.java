package com.Arquitectura.Hexagonal.tasks.domain.ports.inputs;

import java.util.List;
import java.util.Optional;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;

public interface IRetrieveTaskUseCase {
	
	Optional<Task> getTask(Long id);
	
	List<Task> getTasks();

}
