package com.Arquitectura.Hexagonal.tasks.aplication.useCase;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.ICreateTaskUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.ITaskRepositoryPort;

public class CreateTaskUseCaseImpl implements ICreateTaskUseCase {
	
	private final ITaskRepositoryPort iTaskRepositoryPort;

	public CreateTaskUseCaseImpl(ITaskRepositoryPort iTaskRepositoryPort) {
		this.iTaskRepositoryPort = iTaskRepositoryPort;
	}

	@Override
	public Task createTask(Task task) {
		return iTaskRepositoryPort.save(task);
	}

	
	
}
