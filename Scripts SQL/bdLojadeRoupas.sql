CREATE DATABASE bdLojaDeRoupas
USE bdLojaDeRoupas

CREATE TABLE tbVendedor(
	codVendedor  INT PRIMARY KEY
	,nomeVendedor VARCHAR(30)
	,cpfVendedor CHAR (14)
)

CREATE TABLE tbCliente(
	codCliente INT PRIMARY KEY
	,nomeCliente VARCHAR(30)
	,cpfCliente CHAR(14)
)

CREATE TABLE tbVenda(
	codVenda INT PRIMARY KEY
	,dataVenda DATE
	,valorTotalVenda FLOAT
	,codCliente INT FOREIGN KEY REFERENCES tbCliente(codCliente)
	,codVendedor INT FOREIGN KEY REFERENCES tbVendedor(codVendedor)
)

CREATE TABLE tbFormaPagto(
	codFormaPagto INT PRIMARY KEY
	,descFormaPagto VARCHAR(200)
)

CREATE TABLE tbParcela(
	codParcela INT PRIMARY KEY 
	,valorParcela FLOAT 
	,dtVenctoParcela DATE
	,codVenda INT FOREIGN KEY REFERENCES tbVenda(codVenda)
	,codFormaPagto INT FOREIGN KEY REFERENCES tbFormaPagto(codFormaPagto) 
)
CREATE TABLE tbCategoria(
	codCategoria INT PRIMARY KEY
	,descCategoria VARCHAR (200)
)
CREATE TABLE tbProduto(
	codProduto INT PRIMARY KEY
	,descProduto VARCHAR (200)
	,valorProduto FLOAT
	,codCategoria INT FOREIGN KEY REFERENCES tbCategoria(codCategoria)
)
CREATE TABLE tbItemVenda(
	codItemVenda INT PRIMARY KEY
	,qtdeItemVenda VARCHAR (10)
	,subTotalItemVenda INT 
	,codVenda INT FOREIGN KEY REFERENCES tbVenda(codVenda)
	,codProduto INT FOREIGN KEY REFERENCES tbProduto(codProduto)
)
