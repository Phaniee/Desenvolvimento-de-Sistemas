SELECT SUM (codFunc) 'soma de todos os códigos dos funcionários'
FROM tbFunc;

SELECT SUM (idadeFunc) 'soma de todas as idades dos funcionários'
FROM tbFunc;

SELECT SUM (qtdeFilhosFunc) 'soma de todos os filhos dos funcionários'
FROM tbFunc;

SELECT SUM (salarioFuncional) 'soma de todos os salários dos funcionários'
FROM tbFuncional;

SELECT SUM (tempoEmpresaFuncional) 'soma do tempo de empresa de todos os funcionários'
FROM tbFuncional;

SELECT  MAX(codFunc) 'apresente o maior código' FROM tbFunc

SELECT  MIN(codFunc) 'apresente o menor código' FROM tbFunc

SELECT  MAX(idadeFunc) 'apresente a maior idade' FROM tbFunc

SELECT  MIN(idadeFunc) 'apresente a menor idade' FROM tbFunc

SELECT  MAX(qtdeFilhosFunc) 'apresente a maior quantidade de filhos' FROM tbFunc

SELECT  MIN(qtdeFilhosFunc) 'apresente a menor quantidade de filhos' FROM tbFunc

SELECT  MAX(salarioFuncional) 'apresente o maior salário' FROM tbFuncional

SELECT  MIN(salarioFuncional) 'apresente o menor salário' FROM tbFuncional

SELECT  MAX(tempoEmpresaFuncional) 'apresente o maior tempo de empresa' FROM tbFuncional

SELECT  MIN(tempoEmpresaFuncional) 'apresente o menor tempo de empresa' FROM tbFuncional

SELECT  MAX(tempoCargoFuncional) 'apresente o maior tempo no cargo' FROM tbFuncional

SELECT  MIN(tempoCargoFuncional) 'apresente o menor tempo no cargo' FROM tbFuncional

SELECT AVG(codFunc) AS 'a média de todos os códigos dos funcionários' FROM tbFuncional;

SELECT AVG(idadeFunc) AS 'média da idade dos funcionários' FROM tbFunc;

SELECT AVG (qtdeFilhosFunc) AS 'média de filhos dos funcionários' FROM tbFunc;

SELECT AVG(salarioFuncional) AS 'média dos salários dos funcionários' FROM tbFuncional;

SELECT AVG(tempoEmpresaFuncional) AS 'média de tempo na empresa dos funcionário' FROM tbFuncional;

SELECT AVG(tempoCargoFuncional) AS 'média de tempo no cargo dos funcionários' FROM tbFuncional;

SELECT COUNT(*) AS 'quantidade de funcionários que ganham mais de 800 reais'
FROM tbFuncional
WHERE salarioFuncional > 800;

SELECT COUNT(*) AS 'quantidade de funcionários que ganham mais de 1000 reais'
FROM tbFuncional
WHERE salarioFuncional > 1000;

SELECT COUNT(*) AS 'quantidade de funcionários que ganham menos que 400 reais'
FROM tbFuncional
WHERE salarioFuncional < 400;

SELECT COUNT(*) AS 'quantidade de funcionários que ganham menos de 2000 reais'
FROM tbFuncional
WHERE salarioFuncional < 2000;

SELECT COUNT(*) AS 'quantidade de funcionários que ganham mais de 8000 reais'
FROM tbFuncional
WHERE salarioFuncional > 8000;

SELECT COUNT(*) AS 'quantidade de funcionários que ganham menos de 1000 reais'
FROM tbFuncional
WHERE salarioFuncional < 1000;