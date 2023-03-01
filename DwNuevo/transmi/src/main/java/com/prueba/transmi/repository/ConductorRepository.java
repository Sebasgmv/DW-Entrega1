package com.prueba.transmi.repository;

import com.prueba.transmi.model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Long> {
    List<Conductor> findAllByNameStartingWith(String text);

    @Query("SELECT c FROM Conductor c WHERE c.nombre LIKE concat(:text, '%')")
    List<Conductor> findPersonsByNameStartingWith(@Param("text") String text);
}
