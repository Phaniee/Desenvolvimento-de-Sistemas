--3 fabricantes: Malwee, Marisol e Cia da Malha
INSERT INTO tbFabricante(nomeFabricante)
VALUES('Malwee')

INSERT INTO tbFabricante(nomeFabricante)
VALUES('Marisol')

INSERT INTO tbFabricante(nomeFabricante)
VALUES('Cia da Malha')

SELECT * FROM tbFabricante

--2 funcionários
INSERT INTO tbFuncionario(nomeFuncionario,idadeFuncionario,dataAdimissaoFuncionario,salarioFuncionario)
VALUES ('João Santana',22,'2023-09-01',1500)

INSERT INTO tbFuncionario(nomeFuncionario,idadeFuncionario,dataAdimissaoFuncionario,salarioFuncionario)
VALUES ('Raquel Torres',19,'2023-09-01',1500)

SELECT * FROM tbFuncionario

--3 produtos para cada fabricante
INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Camisa',29.00,'2023-09-01',1,1)

INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Calça',69.00,'2023-09-01',1,1)

INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Cueca',09.90,'2023-09-01',1,1)

--3 produtos para cada fabricante
INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Saia',50.90,'2023-09-01',2,2)

INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Vestido',70.90,'2023-09-01',2,2)

INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Blusa',30.90,'2023-09-01',2,2)

--3 produtos para cada fabricante
INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Moletom',58.90,'2023-09-01',2,3)

INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Macacão',80.90,'2023-09-01',2,3)

INSERT INTO tbProduto(nomeProduto,precoProduto,dataEntradaPorduto,codFuncionario,codFabricante)
VALUES ('Sapato',74.90,'2023-09-01',1,3)

SELECT * FROM tbProduto

--2 vendedores

INSERT INTO tbVendedor (nomeVendedor)
VALUES ('João Santana')

INSERT INTO tbVendedor (nomeVendedor)
VALUES ('Raquel Torres')

SELECT * FROM tbVendedor

--5 clientes

INSERT INTO tbCliente(nomeCliente,idadeCliente)
VALUES ('Marcos Silva',25)

INSERT INTO tbCliente(nomeCliente,idadeCliente)
VALUES ('Marcio Silva',28)

INSERT INTO tbCliente(nomeCliente,idadeCliente)
VALUES ('Juliana Souza',20)

INSERT INTO tbCliente(nomeCliente,idadeCliente)
VALUES ('Nycolly Pereira',23)

INSERT INTO tbCliente(nomeCliente,idadeCliente)
VALUES ('Neymar Santos',24)

SELECT * FROM tbCliente

--1 venda para cada cliente, sendo que cada venda terá 2 itens de venda. Distribuir as vendas entre os dois vendedores cadastrados;
--Os dois vendedores são João Santana e Raquel Torres.

INSERT INTO tbVenda (dataVenda,totalVenda,codCliente,codVendedor)
VALUES ('2023-09-01',0,1,1)

INSERT INTO tbVenda (dataVenda,totalVenda,codCliente,codVendedor)
VALUES ('2023-09-01',0,2,1)

INSERT INTO tbVenda (dataVenda,totalVenda,codCliente,codVendedor)
VALUES ('2023-09-01',0,3,1)

INSERT INTO tbVenda (dataVenda,totalVenda,codCliente,codVendedor)
VALUES ('2023-09-01',0,4,2)

INSERT INTO tbVenda (dataVenda,totalVenda,codCliente,codVendedor)
VALUES ('2023-09-01',0,5,2)

SELECT* FROM tbVenda
-- 
INSERT INTO tbItensVenda(quantidadeItensVenda,subTotalItensVenda,codVenda,codProduto)
VALUES (2,59.00,1,1)

INSERT INTO tbItensVenda(quantidadeItensVenda,subTotalItensVenda,codVenda,codProduto)
VALUES (2,69.00,2,1)

INSERT INTO tbItensVenda(quantidadeItensVenda,subTotalItensVenda,codVenda,codProduto)
VALUES (2,70.90,3,1)

INSERT INTO tbItensVenda(quantidadeItensVenda,subTotalItensVenda,codVenda,codProduto)
VALUES (2,80.90,4,2)

INSERT INTO tbItensVenda(quantidadeItensVenda,subTotalItensVenda,codVenda,codProduto)
VALUES (2,30.90,5,2)

SELECT * FROM tbItensVenda

--script para alterar o nome do fabricante Cia da Malha para Turma da Malha.
UPDATE tbFabricante
SET nomeFabricante = 'Turma da Malha'
WHERE codFabricante = 3

SELECT *FROM tbFabricante

--Alterar o valor das vendas do cliente de código 1, concedendo ao mesmo 10% de desconto
UPDATE tbVenda
SET totalVenda = totalVenda - (totalVenda * 0.10)
WHERE codCliente = 1

SELECT * FROM tbVenda

--Aumentar em 20% o preço dos produtos do fabricante de código 2;
UPDATE tbProduto
SET precoProduto = precoProduto + (precoProduto * 0.20)
WHERE codFabricante = 2

SELECT * FROM tbProduto

--Diminuir a quantidade 10 do produto de código 3 do estoque; Mas no MER passado não tem quantidade de estoque

--Remover o segundo item de venda da venda de código 2;

DELETE FROM tbItensVenda
WHERE codItensVenda = 2 AND codVenda = 2;

SELECT * FROM tbItensVenda

--Remover todos os itens da venda código 3;
DELETE FROM tbItensVenda
WHERE codVenda = 3

SELECT * FROM tbItensVenda

--Remover o fabricante de código 1. Você conseguiu? Não consegui, pois ele da conflito por ser chave estrangeira em outras tb
--O que aconteceu? Apareceu o erro e não consegui apagar o fabricante de nenhuma tb
--Responder com comentário dentro do script.

SELECT *FROM tbProduto
WHERE codFabricante = 1;

DELETE FROM tbFabricante
WHERE codFabricante = 1;