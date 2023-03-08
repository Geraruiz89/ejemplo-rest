# ejemplo-rest
ejemplo de metodosrest
drop database publisher;
create database publisher;
use publisher;


CREATE TABLE Persona(
    id INT,
    nombre VARCHAR(64),
    apPat VARCHAR(64),
    apMaterno VARCHAR(64),
    sueldo DECIMAL,
    genero BOOLEAN,
    PRIMARY KEY(id)
);

CREATE TABLE Mueble (
    id INT NOT NULL,
    nombre VARCHAR(64),
    color VARCHAR(64),
    precio decimal,
    agotado boolean,
    PRIMARY KEY(id)
);

INSERT INTO Persona Values(1, 'Gustavo', 'Arellano', 'Fox', 111.12, true);
INSERT INTO Persona Values(2, 'Adolfo', 'Sandoval', 'Slim', 222.12, false);
INSERT INTO Persona Values(3, 'Luis', 'Torres', 'perez', 322.12, false);
INSERT INTO Persona Values(4, 'Pedro', 'Lopez', 'Rodriguez', 422.12, false);
INSERT INTO Persona Values(5, 'Mario', 'Casa', 'Rios', 522.12, false);

INSERT INTO Mueble VALUES(1,'cama','roja',1245.54,true);
INSERT INTO Mueble VALUES(2,'mesa','verde',2245.54,false);
INSERT INTO Mueble VALUES(3,'silla','azul',3245.54,true);
INSERT INTO Mueble VALUES(4,'ropero','negra',4245.54,false);
INSERT INTO Mueble VALUES(5,'estufa','blanco',5245.54,true);
