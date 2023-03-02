package com.nuevo.trasmi.model;


import javax.persistence.*;

@Entity
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String codigo;
//    private Estacion estaciones[];

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ruta() {
    }
}
