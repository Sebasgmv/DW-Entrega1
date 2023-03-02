package com.prueba.transmi.service;

import com.prueba.transmi.model.Conductor;
import com.prueba.transmi.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordiService {

    @Autowired
    private ConductorRepository conductorRepository;

    public List<Conductor> listarConductores() {
        return conductorRepository.findAll();
    }

}
