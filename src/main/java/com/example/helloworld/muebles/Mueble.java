package com.example.helloworld.muebles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mueble {
    private int id;
    private String nombre;
    private String color;
    private float precio;
    private boolean agotado;
}
/*

CREATE TABLE Mueble (
    id INT NOT NULL,
    nombre VARCHAR(64),
    color VARCHAR(64),
    precio decimal,
    agotado boolean,
    PRIMARY KEY(id)
)ENGINE=INNODB;

*/