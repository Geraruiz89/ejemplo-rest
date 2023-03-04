package com.example.helloworld.muebles;

import java.util.List;

public interface MueblesService {
    List<Mueble> getAll();
    List<Mueble> getInsert(Mueble m);
    List<Mueble> getEleById(int m);
    String Borrar(int id);
    List<Mueble> getUpdate(Mueble m);
}
