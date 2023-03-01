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

    public Conductor recuperarPersona(Long id) {
        return conductorRepository.findById(id).orElseThrow();
    }

    public void guardarPersona(Conductor person) {
        conductorRepository.save(person);
    }

    public List<Conductor> buscarPorApellido(String textoBusqueda) {
        return conductorRepository.findPersonsByNameStartingWith(textoBusqueda);
    }

}
