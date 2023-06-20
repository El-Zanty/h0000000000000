package com.Arquitectura.Hexagonal.tasks.aplication.service;

import java.util.List;
import java.util.Optional;

import com.Arquitectura.Hexagonal.tasks.domain.models.AdditonalTaskInfo;
import com.Arquitectura.Hexagonal.tasks.domain.models.Task;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.ICreateTaskUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IDeleteTaskUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IGetAdditionalTaskInfoUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IRetrieveTaskUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IUpdateTaskUseCase;

public class TaskService implements ICreateTaskUseCase, IDeleteTaskUseCase, IUpdateTaskUseCase, IGetAdditionalTaskInfoUseCase, IRetrieveTaskUseCase {

	private final ICreateTaskUseCase icreateTaskUseCase;
	private final IRetrieveTaskUseCase iretrieveTaskUseCase;
	private final IUpdateTaskUseCase iupdateTaskUseCase;
	private final IDeleteTaskUseCase ideleteTaskUseCase;
	private final IGetAdditionalTaskInfoUseCase igetAdditionalTaskInfoUseCase;
	
	
	
	public TaskService(ICreateTaskUseCase icreateTaskUseCase, IRetrieveTaskUseCase iretrieveTaskUseCase,IUpdateTaskUseCase iupdateTaskUseCase, IDeleteTaskUseCase ideleteTaskUseCase,IGetAdditionalTaskInfoUseCase igetAdditionalTaskInfoUseCase) {
		this.icreateTaskUseCase = icreateTaskUseCase;
		this.iretrieveTaskUseCase = iretrieveTaskUseCase;
		this.iupdateTaskUseCase = iupdateTaskUseCase;
		this.ideleteTaskUseCase = ideleteTaskUseCase;
		this.igetAdditionalTaskInfoUseCase = igetAdditionalTaskInfoUseCase;
	}

	@Override
	public Optional<Task> getTask(Long id) {
		return iretrieveTaskUseCase.getTask(id);
	}

	@Override
	public List<Task> getTasks() {
		return iretrieveTaskUseCase.getTasks();
	}

	@Override
	public AdditonalTaskInfo getAdditionalTaskInfo(Long id) {
	
		return igetAdditionalTaskInfoUseCase.getAdditionalTaskInfo(id);
	}

	@Override
	public Optional<Task> updateTask(Long id, Task updateTask) {
		return iupdateTaskUseCase.updateTask(id, updateTask);
	}

	@Override
	public boolean deleteTask(Long id) {
		return ideleteTaskUseCase.deleteTask(id);
	}

	@Override
	public Task createTask(Task task) {
		return icreateTaskUseCase.createTask(task);
	}
	
	
}
