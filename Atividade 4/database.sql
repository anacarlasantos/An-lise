create database dbtabajara;
 
 use dbtabajara;
 
 CREATE TABLE Conta  (    
    codigo int PRIMARY KEY,     
    nome VARCHAR(50) NOT NULL,
    saldo DECIMAL(9,2)  NOT NULL);

 

 

 

INSERT INTO Conta (codigo, nome, saldo) VALUES ( 1, "Orlando José da Silva", 23000);
INSERT INTO Conta (codigo, nome, saldo) VALUES ( 2, "Beatriz Lima da Silva", 719.23);
INSERT INTO Conta (codigo, nome, saldo) VALUES ( 3, "Daniel Oliveira", 17.23);
INSERT INTO Conta (codigo, nome, saldo) VALUES ( 4, "Felipe Albuquerque Martins", 82000.53);
INSERT INTO Conta (codigo, nome, saldo) VALUES ( 5, "Fernanda Brennand", 120532.84);
INSERT INTO Conta (codigo, nome, saldo) VALUES ( 6, "Thales Vanzoff", 50000.0);
INSERT INTO Conta (codigo, nome, saldo) VALUES ( 7, "Nelsangela Arruda", 1000.0);
INSERT INTO Conta (codigo, nome, saldo) VALUES ( 8, "Marcos Antonio Lyra", 8000.0);
 