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

    public Conductor recuperarConductor(Long id) {
        return conductorRepository.findById(id).orElseThrow();
    }

    public void guardarConductor(Conductor conductor) {
        conductorRepository.save(conductor);
    }

    public void borrarConductor(Long id) {
        Conductor conductor = conductorRepository.findById(id).orElseThrow();
        conductorRepository.delete(conductor);
    }

    public List<Conductor> buscarPorNombre(String textoBusqueda) {
        return conductorRepository.findPersonsByNameStartingWith(textoBusqueda);
    }

    /*listar buses*/
    public List<Bus> listarBuses() {
        return BusRepository.findAll();
    }

}
