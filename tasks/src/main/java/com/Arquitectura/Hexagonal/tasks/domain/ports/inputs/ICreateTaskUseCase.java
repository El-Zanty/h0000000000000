package com.Arquitectura.Hexagonal.tasks.domain.ports.inputs;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;

public interface ICreateTaskUseCase {

	Task createTask(Task task);
}
