package com.proyecto.transmi.repository;

import com.proyecto.transmi.model.Conductor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorRepository extends CrudRepository <Conductor, Long> {
}
