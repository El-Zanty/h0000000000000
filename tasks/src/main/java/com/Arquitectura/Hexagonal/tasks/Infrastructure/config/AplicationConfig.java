package com.Arquitectura.Hexagonal.tasks.Infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Arquitectura.Hexagonal.tasks.Infrastructure.adapters.ExternalServiceAdapter;
import com.Arquitectura.Hexagonal.tasks.Infrastructure.respository.IJpaTaskRepository;
import com.Arquitectura.Hexagonal.tasks.Infrastructure.respository.IJpaTaskRepositoryAdapter;
import com.Arquitectura.Hexagonal.tasks.aplication.service.TaskService;
import com.Arquitectura.Hexagonal.tasks.aplication.useCase.CreateTaskUseCaseImpl;
import com.Arquitectura.Hexagonal.tasks.aplication.useCase.DeleteTaskUseCaseImpl;
import com.Arquitectura.Hexagonal.tasks.aplication.useCase.GetAdditionalTaskInfoUseCaseImpl;
import com.Arquitectura.Hexagonal.tasks.aplication.useCase.RetrieveTaskUseCaseIpml;
import com.Arquitectura.Hexagonal.tasks.aplication.useCase.UpdateTaskUseCaseImpl;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.IExternalServicePort;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.ITaskRepositoryPort;

@Configuration
public class AplicationConfig {

	@Bean
	public TaskService taskService(ITaskRepositoryPort iTaskRepositoryPort, GetAdditionalTaskInfoUseCaseImpl getAdditionalTaskInfoUseCaseImpl){
		return new TaskService(
				new CreateTaskUseCaseImpl(iTaskRepositoryPort),
				new RetrieveTaskUseCaseIpml(iTaskRepositoryPort),
				new UpdateTaskUseCaseImpl(iTaskRepositoryPort),
				new DeleteTaskUseCaseImpl(iTaskRepositoryPort),
				getAdditionalTaskInfoUseCaseImpl
				);
	}
	
	@Bean ITaskRepositoryPort iTaskRepositoryPort(IJpaTaskRepositoryAdapter iJpaTaskRepositoryAdapter) {
		return iJpaTaskRepositoryAdapter;
	}
	
	@Bean
	public GetAdditionalTaskInfoUseCaseImpl getAdditionalTaskInfoUseCaseImpl(IExternalServicePort iExternalServicePort) {
		return new GetAdditionalTaskInfoUseCaseImpl(iExternalServicePort);
	}
	
	@Bean
	public IExternalServicePort iExternalServicePort() {
		return new ExternalServiceAdapter();
	}
}
