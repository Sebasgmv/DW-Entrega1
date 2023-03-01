package com.proyecto.transmi.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;
@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Date dia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
