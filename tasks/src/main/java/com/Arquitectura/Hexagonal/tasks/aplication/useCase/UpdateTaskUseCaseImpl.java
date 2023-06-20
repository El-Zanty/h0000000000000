package com.Arquitectura.Hexagonal.tasks.aplication.useCase;

import java.util.Optional;

import com.Arquitectura.Hexagonal.tasks.domain.models.Task;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IUpdateTaskUseCase;

public class UpdateTaskUseCaseImpl  implements IUpdateTaskUseCase{
	
	private final IUpdateTaskUseCase iUpdateTaskUseCase;

	public UpdateTaskUseCaseImpl(IUpdateTaskUseCase iUpdateTaskUseCase) {
		this.iUpdateTaskUseCase = iUpdateTaskUseCase;
	}

	@Override
	public Optional<Task> updateTask(Long id, Task updateTask) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	

	
}
