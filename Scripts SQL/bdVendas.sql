CREATE DATABASE bdVendas

USE bdVendas

CREATE TABLE tbFabricante (
	codFabricante INT PRIMARY KEY IDENTITY (1,1)
	,nomeFabricante VARCHAR (30)
	,cnpjFabricante CHAR (14)
)

CREATE TABLE tbProduto (
	codProduto INT PRIMARY KEY IDENTITY (1000,1)
	,nomeProduto VARCHAR (30)
	,precoProduto FLOAT 
	,pesoProduto FLOAT 
	,codFabricante INT FOREIGN KEY REFERENCES tbFabricante(codFabricante)
)
