package com.proyecto.transmi.basededatos;

import com.proyecto.transmi.model.Bus;
import com.proyecto.transmi.model.Conductor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private Map<Integer, Conductor> dataConductores = new HashMap<>();

    public DataBase(){
        dataConductores.put(1, new Conductor(1, "Dario", "123", "300", "Calle 1"));
        dataConductores.put(2, new Conductor(2, "Dario2", "123", "300", "Calle 1"));
        dataConductores.put(3, new Conductor(3, "Dario3", "123", "300", "Calle 1"));
    }
    Conductor findById(int id){
        return dataConductores.get(id);
    }
    Collection<Conductor> findAll(){
        return dataConductores.values();
    }
}
