package com.Arquitectura.Hexagonal.tasks.Infrastructure.respository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arquitectura.Hexagonal.tasks.Infrastructure.entity.TaskEntity;
import com.Arquitectura.Hexagonal.tasks.domain.models.Task;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.ITaskRepositoryPort;

public class IJpaTaskRepositoryAdapter implements ITaskRepositoryPort{

	
	private final IJpaTaskRepository iJpaTaskRepository;
	
	public IJpaTaskRepositoryAdapter(IJpaTaskRepository iJpaTaskRepository) {
		this.iJpaTaskRepository = iJpaTaskRepository;
	}

	@Override
	public Task save(Task task) {
		TaskEntity taskEntity = TaskEntity.fromDominMoel(task);
		TaskEntity savedTaskEntity = iJpaTaskRepository.save(taskEntity);
		return savedTaskEntity.toDoaminModel();
	}

	@Override
	public Optional<Task> finById(Long id) {
		return iJpaTaskRepository.findById(id).map(TaskEntity::toDoaminModel);
	}

	@Override
	public List<Task> finAll() {
		return iJpaTaskRepository.findAll().stream()
				.map(TaskEntity::toDoaminModel)
				.collect(Collectors.toList());
	}

	@Override
	public Optional<Task> update(Task task) {
		if(iJpaTaskRepository.existsById(task.getId())){
			TaskEntity taskEntity = TaskEntity.fromDominMoel(task);
			TaskEntity updateTaskEntity = iJpaTaskRepository.save(taskEntity);
			return Optional.of(updateTaskEntity.toDoaminModel());
		}
		return Optional.empty();
	}

	@Override
	public boolean deleteById(Long id) {
		if(iJpaTaskRepository.existsById(id)){
			iJpaTaskRepository.deleteById(id);
			return true;
			}
		return false;
	}

}
