package com.Arquitectura.Hexagonal.tasks.aplication.useCase;

import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IDeleteTaskUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.ITaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements IDeleteTaskUseCase {
	
	private final ITaskRepositoryPort iTaskRepositoryPort;

	public DeleteTaskUseCaseImpl(ITaskRepositoryPort iTaskRepositoryPort) {
		this.iTaskRepositoryPort = iTaskRepositoryPort;
	}

	@Override
	public boolean deleteTask(Long id) {
		
		return iTaskRepositoryPort.deleteById(id);
	}
	
	
}
