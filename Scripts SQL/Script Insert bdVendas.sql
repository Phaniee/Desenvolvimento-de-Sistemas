INSERT INTO tbFabricante(nomeFabricante, cnpjFabricante) VALUES
('Visconti', 12345878000190);


INSERT INTO tbFabricante(nomeFabricante, cnpjFabricante) VALUES
('Lacta', 34567989000134);


INSERT INTO tbFabricante(nomeFabricante, cnpjFabricante) VALUES
('Garoto', 56784564000193);


INSERT INTO tbFabricante(nomeFabricante, cnpjFabricante) VALUES
('Nestle', 98543234000103);


INSERT INTO tbFabricante(nomeFabricante, cnpjFabricante) VALUES
('Arcor', 14545765000265);


INSERT INTO tbFabricante(nomeFabricante, cnpjFabricante) VALUES
('Topcau', 43876543000176);

SELECT * FROM tbFabricante;

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo ao leite',19.50,300,01);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Bis',22.90,400,02);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Laka',21.98,400,02);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Shot',24.56,400,02);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Batom ao Leite',26.70,500,03);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Batom Branco',28.90,500,03);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Tortuguita morango',18.90,400,03);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Aerado',19.00,400,04);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Twist',19.90,400,04);

INSERT INTO tbProduto(nomeProduto, precoProduto, pesoProduto, codFabricante) VALUES
('Ovo Toy Story',12.50,100,05);

SELECT * FROM tbProduto;


UPDATE tbFabricante
SET nomeFabricante = 'Bauducco'
WHERE codFabricante = 1

SELECT *FROM tbFabricante

UPDATE tbProduto
SET precoProduto = precoProduto - (precoProduto * 0.05)
WHERE precoProduto >=19

UPDATE tbProduto
SET precoProduto = precoProduto+(precoProduto*0.20)
WHERE precoProduto < 19

UPDATE tbProduto
SET nomeProduto = 'Ovo Tradicional'
WHERE codProduto = 1000

DELETE FROM tbProduto
WHERE codProduto >1005 AND codProduto <1008

DELETE FROM tbProduto
WHERE pesoProduto <400 OR codProduto = 2

SELECT *FROM tbProduto