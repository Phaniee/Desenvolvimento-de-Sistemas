CREATE DATABASE bdBuffet
USE bdBuffet

CREATE TABLE tbLocal(
	idLocal INT PRIMARY KEY
	,nomeLocal VARCHAR(30)
	,capacidadeLocal INT
	,logradouroLocal VARCHAR (30)
	,numLogLocal VARCHAR (4)
	,compLocal VARCHAR (20)
	,bairroLocal VARCHAR (20)
	,cepLocal CHAR (8)
	,cidadeLocal VARCHAR (20)
	,ufLocal CHAR (2)
)
CREATE TABLE tbCliente (
	idCliente INT PRIMARY KEY 
	,nomeCliente VARCHAR (30)
	,rgCliente VARCHAR (9)
	,cpfCliente VARCHAR (27)
	,logadouroCliente VARCHAR (30)
	,numLogCliente VARCHAR (4)
	,complcliente VARCHAR (20)
	,bairroCliente VARCHAR (20)
	,cepCliente CHAR (8)
	,cidadeCliente VARCHAR (20)
	,ufCliente CHAR (2)
)
CREATE TABLE tbFoneCliente (
	idfoneCliente INT PRIMARY KEY
	,numFoneCliente CHAR (9)
	,idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
)
CREATE TABLE tbTipoEvento (
	idTipoEvento INT PRIMARY KEY 
	,descTipoEvento VARCHAR (300)
)
CREATE TABLE tbEvento (
	idEvento INT PRIMARY KEY 
	,dataEvento DATE
	,numconvidadosEvento INT
	,valorTotalEvento FLOAT
	,idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
	,idLocal INT FOREIGN KEY REFERENCES tbLocal(idLocal)
	,idTipoEvento INT FOREIGN KEY REFERENCES tbTipoEvento(idTipoEvento)
)
CREATE TABLE tbFormaPagto (
	idFormaPagto INT PRIMARY KEY 
	,descFormaPagto VARCHAR (50)
)
CREATE TABLE tbParcela (
	idParcela INT PRIMARY KEY 
	,valorParcela FLOAT
	,dataVencParcela DATE
	,idEvento INT FOREIGN KEY REFERENCES tbEvento(idEvento)
	,idFormaPagto INT FOREIGN KEY REFERENCES tbFormaPagto(idFormaPagto)
)
