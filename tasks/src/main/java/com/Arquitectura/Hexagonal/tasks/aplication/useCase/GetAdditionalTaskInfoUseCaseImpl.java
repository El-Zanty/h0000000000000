package com.Arquitectura.Hexagonal.tasks.aplication.useCase;

import com.Arquitectura.Hexagonal.tasks.domain.models.AdditonalTaskInfo;
import com.Arquitectura.Hexagonal.tasks.domain.ports.inputs.IGetAdditionalTaskInfoUseCase;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.IExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl  implements IGetAdditionalTaskInfoUseCase{
	
	private final IExternalServicePort iExternalServicePort;

	public GetAdditionalTaskInfoUseCaseImpl(IExternalServicePort iExternalServicePort) {
		this.iExternalServicePort = iExternalServicePort;
	}

	@Override
	public AdditonalTaskInfo getAdditionalTaskInfo(Long id) {
		return iExternalServicePort.getAdditonalTaskInfo(id);
	}
	
	

}
