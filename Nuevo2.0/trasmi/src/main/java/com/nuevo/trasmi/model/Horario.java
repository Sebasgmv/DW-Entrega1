package com.nuevo.trasmi.model;


import javax.persistence.*;
import java.util.Date;

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
