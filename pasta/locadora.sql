create schema aluno_locadora;
use aluno_locadora;

CREATE TABLE fita 
( 
 numero INT PRIMARY KEY,  
 idcliente INT  
); 

CREATE TABLE cliente 
( 
 prenome INT,  
 telefone INT,  
 endereço INT,  
 id_numero INT PRIMARY KEY,  
 pronome INT  
); 

CREATE TABLE filme 
( 
 titulo INT,  
 categoria INT,  
 id INT PRIMARY KEY
); 

CREATE TABLE ator 
( 
 nome_real INT PRIMARY KEY,  
 data_de_nascimento INT  
); 

CREATE TABLE identificador 
( 
 id INT PRIMARY KEY,  
 numero INT PRIMARY KEY 
); 

CREATE TABLE estrela 
( 
 nome_real INT PRIMARY KEY,  
 id INT PRIMARY KEY  
); 

CREATE TABLE contém 
( 
 nome_real INT PRIMARY KEY,  
 id INT PRIMARY KEY
); 

ALTER TABLE fita ADD FOREIGN KEY(idcliente) REFERENCES cliente (idcliente);
ALTER TABLE identificador ADD FOREIGN KEY(id) REFERENCES filme (id);
ALTER TABLE identificador ADD FOREIGN KEY(numero) REFERENCES fita (numero);
ALTER TABLE estrela ADD FOREIGN KEY(nome_real) REFERENCES ator (nome_real);
ALTER TABLE estrela ADD FOREIGN KEY(id) REFERENCES filme (id);
ALTER TABLE contém ADD FOREIGN KEY(nome_real) REFERENCES ator (nome_real);
ALTER TABLE contém ADD FOREIGN KEY(id) REFERENCES filme (id);
