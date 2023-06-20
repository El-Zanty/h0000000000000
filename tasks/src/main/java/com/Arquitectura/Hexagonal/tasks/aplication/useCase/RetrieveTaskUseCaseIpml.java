package com.Arquitectura.Hexagonal.tasks.aplication.useCase;

import java.util.List;
import java.util.Optional;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IRetrieveTaskUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.ITaskRepositoryPort;

public class RetrieveTaskUseCaseIpml implements IRetrieveTaskUseCase {

	private final ITaskRepositoryPort iTaskRepositoryPort;

	public RetrieveTaskUseCaseIpml(ITaskRepositoryPort iTaskRepositoryPort) {
		this.iTaskRepositoryPort = iTaskRepositoryPort;
	}

	@Override
	public Optional<Task> getTask(Long id) {
		return iTaskRepositoryPort.finById(id);
	}

	@Override
	public List<Task> getTasks() {
		return iTaskRepositoryPort.finAll();
	}
	
	
}
