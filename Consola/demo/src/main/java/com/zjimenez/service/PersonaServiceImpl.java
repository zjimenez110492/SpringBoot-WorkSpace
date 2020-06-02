package com.zjimenez.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zjimenez.DemoConsolaApplication;
import com.zjimenez.repository.IPersonaRepo;
import com.zjimenez.repository.PersonaRepoImpl1;

@Service
public class  PersonaServiceImpl implements IPersonaService{

private static Logger LOG= LoggerFactory.getLogger(PersonaServiceImpl.class);
	@Autowired
	private IPersonaRepo repo;
	@Override
	public void registrar(String nombre) {	
		repo.registrar(nombre);
	}
}
