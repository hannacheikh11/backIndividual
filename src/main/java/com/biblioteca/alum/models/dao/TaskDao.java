package com.biblioteca.alum.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.biblioteca.alum.models.entity.Task;

public interface TaskDao extends CrudRepository<Task,Long>{
	


}
