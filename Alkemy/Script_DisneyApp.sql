
CREATE DATABASE DisneyApp;

USE DisneyApp;

CREATE TABLE Character(
	id int NOT NULL IDENTITY(1,1),
	nombre varchar(20) NOT NULL,
	edad int NOT NULL,
	imagen varchar(50) NOT NULL,
	peso int NOT NULL,
	historia varchar(200) NOT NULL,

	CONSTRAINT PK_character PRIMARY KEY(id)

);

CREATE TABLE Movie(
	id int NOT NULL IDENTITY(1,1),
	titulo varchar(20) NOT NULL,
	calificacion int CHECK (calificacion >= 1 AND Calificacion <= 5) NOT NULL,
	imagen varchar(50) NOT NULL,
	fechaCreacion datetime NOT NULL,

	CONSTRAINT PK_movie PRIMARY KEY(id)

);

CREATE TABLE MovieCharacter(
	idCharacter INT NOT NULL,
	idMovie INT NOT NULL,
	CONSTRAINT Pk_movieCharacter PRIMARY KEY(idCharacter,idMovie),
	CONSTRAINT FK_movie FOREIGN KEY(idMovie) REFERENCES Movie(id),
	CONSTRAINT FK_character FOREIGN KEY (idCharacter) REFERENCES Character(id)
);

CREATE TABLE Genre(
	id INT NOT NULL IDENTITY(1,1),
	nombre VARCHAR(20) NOT NULL,
	imagen VARCHAR(50) NOT NULL,
	movieID INT NOT NULL,

	CONSTRAINT PK_genre PRIMARY KEY(id),
	CONSTRAINT FK_genre FOREIGN KEY(movieID) REFERENCES Movie(id)
);


--CONSULTAS

--SELECT * FROM  Character;

--SELECT * FROM Movie;

--SELECT * FROM MovieCharacter;

--SELECT * FROM Genre;

-- INSERT
--INSERT INTO Character(nombre,edad,imagen,peso,historia)VALUES('Loki',25,'imagenLoki_001',70,'El dios de las mentiras');

--INSERT INTO Movie(titulo,calificacion,imagen,fechaCreacion)VALUES('Loki',4,'imagenSerieLoki_001','2021-08-04');

--INSERT INTO MovieCharacter(idCharacter, idMovie)VALUES(1,1);

--INSERT INTO Genre(nombre,imagen,movieID)VALUES('Accion','ImagenLoki_002',1);


--UPDATE

--DELETE


--ALTER
--ALTER TABLE Character ADD historia VARCHAR(200);

--DROP
--DROP TABLE Character;

--DROP TABLE Movie;

--DROP TABLE Genre;

--DROP TABLE MovieCharacter