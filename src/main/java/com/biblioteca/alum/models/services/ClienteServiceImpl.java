package com.biblioteca.alum.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biblioteca.alum.models.dao.ClienteDao;
import com.biblioteca.alum.models.entity.Cliente;
import com.biblioteca.alum.models.entity.Project;
import com.biblioteca.alum.models.entity.Region;
import com.biblioteca.alum.models.entity.Task;



@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {

		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegions() {
		return clienteDao.findAllRegions();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Task> findAllTasks() {
		return clienteDao.findAllTasks();
	}

	


}
