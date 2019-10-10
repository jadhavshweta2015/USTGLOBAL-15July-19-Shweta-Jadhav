package com.ust.ustspringbootfinal.service;

import java.util.List;

import com.ust.ustspringbootfinal.dto.Task;

public interface TaskService {

	public boolean addTask(Task task);
	public boolean removeTask(int task_id);
	public boolean modifyTask(Task task);
	public Task getTask(int task_id);
	public List<Task> getAllTask();
}
