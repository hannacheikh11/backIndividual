package com.biblioteca.alum.models.services;

import java.util.List;

import com.biblioteca.alum.models.entity.Cliente;
import com.biblioteca.alum.models.entity.Project;
import com.biblioteca.alum.models.entity.Region;
import com.biblioteca.alum.models.entity.Task;



public interface ClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegions();
	
	public List<Task> findAllTasks();
	
	//public List<Project> findAllProject();
	
}
