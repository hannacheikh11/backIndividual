package com.biblioteca.alum.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.biblioteca.alum.models.entity.Cliente;
import com.biblioteca.alum.models.entity.Project;
import com.biblioteca.alum.models.entity.Region;
import com.biblioteca.alum.models.entity.Task;





public interface ClienteDao extends CrudRepository<Cliente,Long>{
	@Query("from Region")
	public List<Region> findAllRegions();
	@Query("from Task")
	public List<Task> findAllTasks();
	//@Query("from projects")
	//public List<Project> findAllProject();
}

