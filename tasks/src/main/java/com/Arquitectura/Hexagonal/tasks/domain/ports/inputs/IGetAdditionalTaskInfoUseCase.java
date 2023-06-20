package com.Arquitectura.Hexagonal.tasks.domain.ports.inputs;

import com.Arquitectura.Hexagonal.tasks.domain.models.AdditonalTaskInfo;

public interface IGetAdditionalTaskInfoUseCase {

	AdditonalTaskInfo getAdditionalTaskInfo(Long id);
}
