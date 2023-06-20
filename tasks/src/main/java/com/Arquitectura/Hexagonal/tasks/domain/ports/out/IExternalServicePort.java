package com.Arquitectura.Hexagonal.tasks.domain.ports.out;

import com.Arquitectura.Hexagonal.tasks.domain.models.AdditonalTaskInfo;

public interface IExternalServicePort {
	
	 AdditonalTaskInfo getAdditonalTaskInfo(Long taskId);
}
