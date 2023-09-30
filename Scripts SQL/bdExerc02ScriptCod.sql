SELECT SUM (codFunc) 'soma de todos os c�digos dos funcion�rios'
FROM tbFunc;

SELECT SUM (idadeFunc) 'soma de todas as idades dos funcion�rios'
FROM tbFunc;

SELECT SUM (qtdeFilhosFunc) 'soma de todos os filhos dos funcion�rios'
FROM tbFunc;

SELECT SUM (salarioFuncional) 'soma de todos os sal�rios dos funcion�rios'
FROM tbFuncional;

SELECT SUM (tempoEmpresaFuncional) 'soma do tempo de empresa de todos os funcion�rios'
FROM tbFuncional;

SELECT  MAX(codFunc) 'apresente o maior c�digo' FROM tbFunc

SELECT  MIN(codFunc) 'apresente o menor c�digo' FROM tbFunc

SELECT  MAX(idadeFunc) 'apresente a maior idade' FROM tbFunc

SELECT  MIN(idadeFunc) 'apresente a menor idade' FROM tbFunc

SELECT  MAX(qtdeFilhosFunc) 'apresente a maior quantidade de filhos' FROM tbFunc

SELECT  MIN(qtdeFilhosFunc) 'apresente a menor quantidade de filhos' FROM tbFunc

SELECT  MAX(salarioFuncional) 'apresente o maior sal�rio' FROM tbFuncional

SELECT  MIN(salarioFuncional) 'apresente o menor sal�rio' FROM tbFuncional

SELECT  MAX(tempoEmpresaFuncional) 'apresente o maior tempo de empresa' FROM tbFuncional

SELECT  MIN(tempoEmpresaFuncional) 'apresente o menor tempo de empresa' FROM tbFuncional

SELECT  MAX(tempoCargoFuncional) 'apresente o maior tempo no cargo' FROM tbFuncional

SELECT  MIN(tempoCargoFuncional) 'apresente o menor tempo no cargo' FROM tbFuncional

SELECT AVG(codFunc) AS 'a m�dia de todos os c�digos dos funcion�rios' FROM tbFuncional;

SELECT AVG(idadeFunc) AS 'm�dia da idade dos funcion�rios' FROM tbFunc;

SELECT AVG (qtdeFilhosFunc) AS 'm�dia de filhos dos funcion�rios' FROM tbFunc;

SELECT AVG(salarioFuncional) AS 'm�dia dos sal�rios dos funcion�rios' FROM tbFuncional;

SELECT AVG(tempoEmpresaFuncional) AS 'm�dia de tempo na empresa dos funcion�rio' FROM tbFuncional;

SELECT AVG(tempoCargoFuncional) AS 'm�dia de tempo no cargo dos funcion�rios' FROM tbFuncional;

SELECT COUNT(*) AS 'quantidade de funcion�rios que ganham mais de 800 reais'
FROM tbFuncional
WHERE salarioFuncional > 800;

SELECT COUNT(*) AS 'quantidade de funcion�rios que ganham mais de 1000 reais'
FROM tbFuncional
WHERE salarioFuncional > 1000;

SELECT COUNT(*) AS 'quantidade de funcion�rios que ganham menos que 400 reais'
FROM tbFuncional
WHERE salarioFuncional < 400;

SELECT COUNT(*) AS 'quantidade de funcion�rios que ganham menos de 2000 reais'
FROM tbFuncional
WHERE salarioFuncional < 2000;

SELECT COUNT(*) AS 'quantidade de funcion�rios que ganham mais de 8000 reais'
FROM tbFuncional
WHERE salarioFuncional > 8000;

SELECT COUNT(*) AS 'quantidade de funcion�rios que ganham menos de 1000 reais'
FROM tbFuncional
WHERE salarioFuncional < 1000;