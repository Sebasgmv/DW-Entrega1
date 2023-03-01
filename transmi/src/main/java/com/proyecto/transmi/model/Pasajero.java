package com.proyecto.transmi.model;

import jakarta.persistence.*;

@Entity
public class Pasajero extends Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pasajero() {
    }
    public Pasajero(Long id, String nombre) {
        super(id, nombre, null);
    }

}
