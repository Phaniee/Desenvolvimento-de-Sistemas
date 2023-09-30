CREATE DATABASE tbEstoque
USE tbEstoque

CREATE TABLE tbCliente(
	codCliente INT PRIMARY KEY IDENTITY (1,1)
	,nomeCliente VARCHAR(70)
	,cpfCliente CHAR(11)
	,emailCliente VARCHAR(70)
	,sexoCliente CHAR(1)
	,dataNascimentoCliente DATE
)
CREATE TABLE tbFabricante(
	codFabricante INT PRIMARY KEY IDENTITY (1,1)
	,nomeFabricante VARCHAR (70)
)
CREATE TABLE tbFornecedor(
	codFornecedor INT PRIMARY KEY IDENTITY (1,1)
	,nomeFornecedor VARCHAR (70)
	,contatoFornecedor VARCHAR (70)
)
CREATE TABLE tbProduto(
	codProduto INT PRIMARY KEY IDENTITY (1,1)
	,descricaoProduto VARCHAR(150)
	,valorProduto MONEY
	,quantidadeProduto INT
	,codFabricante INT FOREIGN KEY REFERENCES tbFabricante(codFabricante)
	,codFornecedor INT FOREIGN KEY REFERENCES tbFornecedor(codFornecedor)
)
CREATE TABLE tbVenda(
	codVenda INT PRIMARY KEY IDENTITY (1,1)
	,dataVenda DATE
	,valorTotalVenda MONEY
	,codCliente INT FOREIGN KEY REFERENCES tbCliente(codCliente)
)
CREATE TABLE tbItensVenda(
	codItensVenda INT PRIMARY KEY IDENTITY (1,1)
	,quantidadeItensVenda INT
	,subTotalItensVenda FLOAT
	,codVenda INT FOREIGN KEY REFERENCES tbVenda(codVenda)
	,codProduto INT FOREIGN KEY REFERENCES tbProduto(codProduto)
)
INSERT INTO tbCliente (nomeCliente, cpfCliente , emailCliente, sexoCliente, dataNascimentoCliente) VALUES
('Maria', 76598278299, 'chenrique@ig.com.br','m','1981-09-08');
SELECT * FROM tbCliente;

INSERT INTO tbFabricante (nomeCliente, cpfCliente , emailCliente, sexoCliente, dataNascimentoCliente) VALUES
('Maria', 76598278299, 'chenrique@ig.com.br','m','1981-09-08');
SELECT * FROM tbCliente;
