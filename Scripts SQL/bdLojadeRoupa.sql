CREATE DATABASE bdLojaDeRoupas

USE bdLojaDeRoupas

CREATE TABLE tbVendedor(
	codVendedor  INT PRIMARY KEY IDENTITY (1,1)
	,nomeVendedor VARCHAR(30)
)

CREATE TABLE tbCliente(
	codCliente INT PRIMARY KEY IDENTITY (1,1)
	,nomeCliente VARCHAR(30)
	,idadeCliente INT
)

CREATE TABLE tbVenda(
	codVenda INT PRIMARY KEY IDENTITY (1,1)
	,dataVenda DATE
	,totalVenda FLOAT
	,codCliente INT FOREIGN KEY REFERENCES tbCliente(codCliente)
	,codVendedor INT FOREIGN KEY REFERENCES tbVendedor(codVendedor)
)
CREATE TABLE tbFabricante(
	codFabricante INT PRIMARY KEY IDENTITY (1,1)
	,nomeFabricante VARCHAR (30)
)

CREATE TABLE tbFuncionario(
	codFuncionario INT PRIMARY KEY IDENTITY (1,1)
	,nomeFuncionario VARCHAR (30)
	,idadeFuncionario INT
	,dataAdimissaoFuncionario DATE
	,salarioFuncionario FLOAT
)
CREATE TABLE tbProduto (
	codProduto INT PRIMARY KEY IDENTITY (1,1)
	,nomeProduto VARCHAR (30)
	,precoProduto FLOAT
	,dataEntradaPorduto DATE
	,codFuncionario INT FOREIGN KEY REFERENCES tbFuncionario (codFuncionario)
	,codFabricante INT FOREIGN KEY REFERENCES tbFabricante (codFabricante)
)

CREATE TABLE tbItensVenda(
	codItensVenda INT PRIMARY KEY IDENTITY (1,1)
	,quantidadeItensVenda INT
	,subTotalItensVenda FLOAT
	,codVenda INT FOREIGN KEY REFERENCES tbVenda(codVenda)
	,codProduto INT FOREIGN KEY REFERENCES tbProduto (codProduto)
)

DROP DATABASE bdLojaDeRoupas
