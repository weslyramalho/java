/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  wesly
 * Created: 25 de jan. de 2023
 */

CREATE TABLE Bovino (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Sexo varchar(60) DEFAULT NULL,
  Raca varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE Equino (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Sexo varchar(60) DEFAULT NULL,
  Raca varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE Suino (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Sexo varchar(60) DEFAULT NULL,
  Raca varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE Ave (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Sexo varchar(60) DEFAULT NULL,
  Raca varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);



INSERT INTO Bovino (sexo, raca) VALUES 
  ('f', 'nelori'),
   ('m', 'nelori'),
   ('f', 'nelori');
  
INSERT INTO Equino (sexo, raca) VALUES 
  ('f', 'moruba'),
   ('m', 'rachici'),
   ('f', 'burucuto');

INSERT INTO Suino (sexo, raca) VALUES 
  ('f', 'Carata'),
   ('m', 'Narcotico'),
   ('f', 'Marata');

INSERT INTO Ave (sexo, raca) VALUES 
  ('f', 'Carate'),
   ('m', 'Tipoa'),
   ('f', 'Gurupi');