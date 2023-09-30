CREATE DATABASE bdIgreja

Use bdIgreja

CREATE TABLE tbNoivo (
	idNoivo INT PRIMARY KEY
	,nomeNoivo VARCHAR (50)
	,dataNascimentoNoivo DATE
)
CREATE TABLE tbDecoracao (
	idDecoracao INT PRIMARY KEY
	,descDecoracao VARCHAR (300)
)
CREATE TABLE tbCasamento (
	 idCasamento INT PRIMARY KEY
	 ,dataHoraCasamento DATETIME
	 ,idNoivo INT FOREIGN KEY REFERENCES tbNoivo(idNoivo)
	 ,idNoiva INT FOREIGN KEY REFERENCES tbNoivo(idNoivo)
	 ,idDecoracao INT FOREIGN KEY REFERENCES tbDecoracao (idDecoracao)
)
CREATE TABLE tbEstadoCivil (
	idEstadoCivil INT PRIMARY KEY
	,descEstadoCivil VARCHAR (100)
)
CREATE TABLE tbPadrinho (
	idPadrinho INT PRIMARY KEY 
	,nomePadrinho VARCHAR (50)
	,idadePadrinho INT 
	,idEstadoCivil INT FOREIGN KEY REFERENCES tbEstadoCivil(idEstadoCivil)
	)
CREATE TABLE tbPadrinhoCasamento (
	idPadrinhoCasamento INT PRIMARY KEY
	,idCasamento INT FOREIGN KEY REFERENCES tbCasamento(idCasamento)
	,idPadrinho INT FOREIGN KEY REFERENCES tbPadrinho (idPadrinho)
)
