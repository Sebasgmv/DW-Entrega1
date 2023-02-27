package com.proyecto.transmi.model;

import java.util.UUID;

public class Conductor {
    private Integer uuid;
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;

    public Conductor() {
    }

    public Conductor(Integer uuid, String nombre, String cedula, String telefono, String direccion) {
        this.uuid = uuid;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
