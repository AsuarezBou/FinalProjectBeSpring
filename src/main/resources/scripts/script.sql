create database bd_tarjetas;

use bd_tarjetas;

-- Creación de Tablas
CREATE TABLE pais (
    id_pais INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(50)
);

INSERT INTO pais (descripcion) VALUES ('Peru');
INSERT INTO pais (descripcion) VALUES ('Chile');
INSERT INTO pais (descripcion) VALUES ('Brasil');
INSERT INTO pais (descripcion) VALUES ('Argentina');
INSERT INTO pais (descripcion) VALUES ('Colombia');
INSERT INTO pais (descripcion) VALUES ('Bolivia');
INSERT INTO pais (descripcion) VALUES ('Ecuador');
INSERT INTO pais (descripcion) VALUES ('Venezuela');
INSERT INTO pais (descripcion) VALUES ('Paraguay');
INSERT INTO pais (descripcion) VALUES ('Uruguay');
INSERT INTO pais (descripcion) VALUES ('España');
INSERT INTO pais (descripcion) VALUES ('Dinamarca');
INSERT INTO pais (descripcion) VALUES ('Letonia');
INSERT INTO pais (descripcion) VALUES ('Japon');
INSERT INTO pais (descripcion) VALUES ('China');
INSERT INTO pais (descripcion) VALUES ('Corea');
INSERT INTO pais (descripcion) VALUES ('Sudafrica');

CREATE TABLE nacionalidad (
    id_nacionalidad INT AUTO_INCREMENT PRIMARY KEY,
    id_pais INT,
    descripcion VARCHAR(50),
    FOREIGN KEY (id_pais) REFERENCES pais(id_pais)
);

INSERT INTO nacionalidad(id_pais,descripcion) VALUES (1,'Peruana');

CREATE TABLE genero (
    id_genero INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(50)
);

INSERT INTO genero(descripcion) VALUES ('Femenino');
INSERT INTO genero(descripcion) VALUES ('Masculino');

CREATE TABLE provincia (
    id_provincia INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
	id_pais INT,
    FOREIGN KEY (id_pais) REFERENCES pais(id_pais)
);

INSERT INTO provincia (nombre,id_pais) values ('Lima',1);
INSERT INTO provincia (nombre,id_pais) values ('Ica',1);
INSERT INTO provincia (nombre,id_pais) values ('Loreto',1);

CREATE TABLE ciudad (
    id_ciudad INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    id_provincia INT,
    FOREIGN KEY (id_provincia) REFERENCES provincia(id_provincia)
);

INSERT INTO ciudad (nombre,id_provincia) VALUES ('Ica',2);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Chincha',2);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Nazca',2);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Palpa',2);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Pisco',2);

INSERT INTO ciudad (nombre,id_provincia) VALUES ('Putumayo',3);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Alto Amazonas',3);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Datem del Maranon',3);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Loreto',3);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Mariscal Ramon Castilla',3);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Maynas',3);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Requena',3);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Ucayali',3);

INSERT INTO ciudad (nombre,id_provincia) VALUES ('Barranca',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Cajatambo',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Canta',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Canete',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Huaral',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Huarochiri',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Huaura',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Lima',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Oyon',1);
INSERT INTO ciudad (nombre,id_provincia) VALUES ('Yauyos',1);

CREATE TABLE distrito (
    id_distrito INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    id_ciudad INT,
	FOREIGN KEY (id_ciudad) REFERENCES ciudad(id_ciudad)
);

INSERT INTO distrito (nombre,id_ciudad) VALUES ('Jesus Maria',21);
INSERT INTO distrito (nombre,id_ciudad) VALUES ('Miraflores',21);
INSERT INTO distrito (nombre,id_ciudad) VALUES ('Lince',21);
INSERT INTO distrito (nombre,id_ciudad) VALUES ('Los Olivos',21);
INSERT INTO distrito (nombre,id_ciudad) VALUES ('San Isidro',21);

CREATE TABLE documentos(
	id_documento INT AUTO_INCREMENT PRIMARY KEY,
    descripcion varchar(50)
);

INSERT INTO documentos (descripcion) values ('Documento Nacional de Identidad');
INSERT INTO documentos (descripcion) values ('Libreta Militar');
INSERT INTO documentos (descripcion) values ('Carnet de Extranjeria');

CREATE TABLE persona (
    id_persona INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100),
    apellido_pat VARCHAR(50),
    apellido_mat VARCHAR(50),
    fecha_nacimiento DATE,
    id_nacionalidad INT,
    id_genero INT,
    id_documento INT,
    num_documento varchar(10),
	direccion VARCHAR(100),
    id_distrito INT,
	FOREIGN KEY (id_documento) REFERENCES documentos(id_documento),
    FOREIGN KEY (id_nacionalidad) REFERENCES nacionalidad(id_nacionalidad),
    FOREIGN KEY (id_genero) REFERENCES genero(id_genero),
    FOREIGN KEY (id_distrito) REFERENCES distrito(id_distrito)
);

/*
	Reglas al registrar una persona
    1. Validar que el número de documento no se encuentre ya registrado en la BD
*/

INSERT INTO persona (nombres,apellido_mat,apellido_pat,fecha_nacimiento,id_nacionalidad,id_genero,id_documento,num_documento,direccion,id_distrito)
VALUES ('Aldo Giovanni', 'Bouffanais','Suarez','1994-02-17',1,2,1,75756547,'Av.Horacio Urteaga 1535 Dpto. 302',1);

CREATE VIEW view_personas
AS
	SELECT p.id_persona,
    CONCAT_WS(' ',p.nombres , p.apellido_pat , p.apellido_mat) as Nombre,
	n.descripcion as Nacionalidad,
	g.descripcion as Genero,
	doc.descripcion as Tipo_Documento,
	p.num_documento as Numero_Documento,
	p.fecha_nacimiento as Fecha_Nacimiento,
	p.direccion as Direccion,
	d.nombre as Distrito,
	c.nombre as Ciudad,
	pr.nombre as Provincia
from Persona p
JOIN Genero g ON p.id_genero = g.id_genero
JOIN Documentos doc ON p.id_documento = doc.id_documento
JOIN Nacionalidad n ON p.id_nacionalidad = n.id_nacionalidad
JOIN Distrito d ON p.id_distrito = d.id_distrito
JOIN Ciudad c ON d.id_ciudad = c.id_ciudad
JOIN Provincia pr on c.id_provincia = pr.id_provincia;

CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    id_persona INT,
    fecha_registro DATE,
    FOREIGN KEY (id_persona) REFERENCES persona(id_persona)
);

/*
	Reglas al registrar una persona
    1. Validar que exista la persona registrada mediante su id_persona. En caso no se encuentre, devolver mensaje para que realice su registro.
*/

-- Creación de la Tabla de Cuenta Bancaria
CREATE TABLE cuenta (
    id_cuenta INT AUTO_INCREMENT PRIMARY KEY,
    numero_cuenta VARCHAR(20),
    tipo_cuenta VARCHAR(50),
    saldo DECIMAL(10, 2),
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE tarjeta (
    id_tarjeta INT AUTO_INCREMENT PRIMARY KEY,
    numero_tarjeta VARCHAR(16),
    fecha_expiracion DATE,
    cvv INT,
    id_cuenta INT,
    FOREIGN KEY (id_cuenta) REFERENCES cuenta(id_cuenta)
);

CREATE TABLE campaña (
    id_campaña INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255),
    fecha_inicio DATE,
    fecha_fin DATE,
    id_cliente INT,
    linea_credito_aprobada BOOLEAN,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

-- Insertando Datos de Ejemplo (Simulación)
-- Nota: Estos son datos ficticios y deben ajustarse según los requerimientos reales.
INSERT INTO nacionalidad (descripcion) VALUES ('Peruana');
INSERT INTO genero (descripcion) VALUES ('Masculino'), ('Femenino');
-- Continuar con la inserción de datos para las demás tablas...