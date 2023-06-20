package com.Arquitectura.Hexagonal.tasks.domain.ports.inputs;

import java.util.Optional;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;

public interface IUpdateTaskUseCase {

	Optional<Task> updateTask(Long id, Task updateTask);
}
