package com.Arquitectura.Hexagonal.tasks.Infrastructure.adapters;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.Arquitectura.Hexagonal.tasks.domain.models.AdditonalTaskInfo;
import com.Arquitectura.Hexagonal.tasks.domain.ports.out.IExternalServicePort;

public class ExternalServiceAdapter implements IExternalServicePort  {
	
//	 https://jsonlaceholder.typicode.com/todos/
//	 https://jsonplaceholder.typicode.com/users/
	
	private final RestTemplate restTemplate;
	
	public ExternalServiceAdapter() {
		restTemplate = new RestTemplate();
	}
	@Override
	public AdditonalTaskInfo getAdditonalTaskInfo(Long taskId) {
		String apiUrl =  "https://jsonlaceholder.typicode.com/todos/" + taskId;
		ResponseEntity<JsonPlaceHolderTodo> response= restTemplate.getForEntity(apiUrl, JsonPlaceHolderTodo.class);
		JsonPlaceHolderTodo todo = response.getBody();
		
		if(todo == null) {
			return null;
		}
		
		apiUrl ="https://jsonplaceholder.typicode.com/users/" + todo.getUserId();
		ResponseEntity<JsonPlaceHolderUser> userResponse = restTemplate.getForEntity(apiUrl,JsonPlaceHolderUser.class);
		JsonPlaceHolderUser user = userResponse.getBody();
		
		if(user == null) {
			return null;
		}
		return new AdditonalTaskInfo(user.getId(), user.getName(), user.getEmail());
		}

	private static class JsonPlaceHolderTodo{
		private Long id;
		private Long userId;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		
	}
	
	private static class JsonPlaceHolderUser{
		private Long id;
		private String name;
		private String email;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
	}
	
}
