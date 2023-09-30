CREATE DATABASE bdExerc02
USE bdExerc02

CREATE TABLE tbFunc(
	codFunc INT PRIMARY KEY IDENTITY (1,1)
	,nomeFunc VARCHAR (60)
	,ufFunc CHAR (2)
	,idadeFunc INT
	,qtdeFilhosFunc INT
)

CREATE TABLE tbFuncional (
	codFuncional INT PRIMARY KEY IDENTITY (1,1)
	,cargoFuncional VARCHAR (30)
	,salarioFuncional MONEY
	,tempoEmpresaFuncional INT
	,tempoCargoFuncional INT
	,sindicalizadoFuncional CHAR (3)
	,codFunc INT FOREIGN KEY REFERENCES tbFunc(codFunc)
)
INSERT INTO tbFunc (nomeFunc, ufFunc, idadeFunc, qtdeFilhosFunc) VALUES
('Agostinho Carrara','SP',42,1),
('João da Silva','RJ',35,2),
('Maria Oliveira','MG',28,0),
('Pedro Santos','BA',50,3),
('Ana Pereira','PE',45,2),
('Fernanda Souza','RS',33,1),
('Carlos Mendes','SC',37,0),
('Juliana Almeida','CE',29,2),
('Ricardo Costa','PR',41,4),
('Mariana Fernandes','GO',39,3);

SELECT * FROM tbFunc;

INSERT INTO tbFuncional (cargoFuncional, salarioFuncional, tempoEmpresaFuncional, tempoCargoFuncional, sindicalizadoFuncional, codFunc)
VALUES
('Gerente', 5000, 5, 2, 'Sim', 1),
('Analista', 3000, 3, 1, 'Sim', 2),
('Desenvolvedor', 4000, 2, 1, 'Não', 3),
('Coordenador', 4500, 4, 2, 'Sim', 4),
('Analista Sênior', 5500, 6, 3, 'Sim', 5),
('Estagiário', 1500, 1, 0, 'Não', 6),
('Analista', 3200, 2, 1, 'Sim', 7),
('Assistente Administrativo', 2800, 2, 1, 'Não', 8),
('Analista de Marketing', 3500, 3, 2, 'Sim', 9),
('Consultor', 6000, 7, 4, 'Sim', 10);

SELECT * FROM tbFuncional;
