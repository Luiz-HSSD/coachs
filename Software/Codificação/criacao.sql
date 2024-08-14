-- Geração de Modelo físico
-- Sql UTF-8 2003 - brModelo.



-- CRIA ou RECRIA o banco de dados

DROP DATABASE ABPCOACHING;
CREATE DATABASE ABPCOACHING;
\c abpcoaching

CREATE TABLE Artigos (

id Serial PRIMARY KEY,

dtCadastro Date,

Titulo Varchar(35),

Conteudo Varchar(60000),

Aprovado Boolean
)

;

CREATE TABLE ArtigosDoAssociado (

id_Associado Integer,

id_Artigo Integer,

PRIMARY KEY(id_Associado,id_Artigo),

FOREIGN KEY(id_Artigo) REFERENCES Artigos (id)
);



CREATE TABLE Endereco (

id Serial PRIMARY KEY,

DtCadastro Date,

Logradouro varchar(100),

Numero Integer,

Complemento varchar(20),

Bairro varchar(40),

Cidade varchar(40),

UF varchar(40),

CEP Varchar(10),

id_Associado Integer
);



CREATE TABLE HistoricoProfissional (

id Serial PRIMARY KEY,

id_Curriculum Integer,

Descricao Varchar(1000),

dtInicio Date,

dtFim Date
);



CREATE TABLE Curriculum (

id Serial PRIMARY KEY,

dtCadastro Date,

id_Associado Integer
);



CREATE TABLE HistoricoAcademico (

id Serial PRIMARY KEY,

id_Curriculum Integer,

Descricao Varchar(1000),

dtInicio Date,

dtFim Date,

FOREIGN KEY(id_Curriculum) REFERENCES Curriculum (id)
)
;


CREATE TABLE Mini_Curriculum (

id Serial PRIMARY KEY,

dtCadastro Date,

Conteudo Varchar(10000),

id_Associado Integer
);



CREATE TABLE Associados (

id Serial PRIMARY KEY,

dtCadastro Date,

Nome varchar(60),

dtNascimento Date,

EMail Varchar(80),

Foto Varchar(255)
)

;

CREATE TABLE Usuario (

id Serial PRIMARY KEY,

dtCadastro Date,

Login Varchar(80),

Senha VarChar(20),

id_Associado Serial,

FOREIGN KEY(id_Associado) REFERENCES Associados (id)
);



ALTER TABLE ArtigosDoAssociado ADD FOREIGN KEY(id_Associado) REFERENCES Associados (id);

ALTER TABLE Endereco ADD FOREIGN KEY(id_Associado) REFERENCES Associados (id);

ALTER TABLE HistoricoProfissional ADD FOREIGN KEY(id_Curriculum) REFERENCES Curriculum (id);

ALTER TABLE Curriculum ADD FOREIGN KEY(id_Associado) REFERENCES Associados (id);

ALTER TABLE Mini_Curriculum ADD FOREIGN KEY(id_Associado) REFERENCES Associados (id);

-- Fim do Script