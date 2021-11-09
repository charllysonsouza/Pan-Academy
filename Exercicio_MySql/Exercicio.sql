-- Criar uma tabela de Estados com id, nome, sigla(utilizar ENUM), região utilizar ENUM (), população.
-- Id deve ser a PK
-- nome campo único
-- Inserir 10 estados (dois de cada região)
-- Listar estados ordenando por sigla
-- Encontrar a população total de cada região
-- Encontrar a média da população por região
-- Agrupar estados por região

use teste;

CREATE TABLE estado (
  id int unsigned NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  sigla enum('AC','AM','BA','CE','ES','GO','MT','RJ','RS','SC') NOT NULL,
  regiao enum('Norte','Nordeste','Centro-Oeste','Sudeste','Sul') NOT NULL,
  populacao int NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY(sigla)
);

INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Acre", "AC", "Norte", 869265);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Amazonas", "AM", "Norte", 4080611);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Ceará", "CE", "Nordeste", 9075649);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Bahia", "BA", "Nordeste", 14812617);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Espiríto Santo", "ES", "Sudeste", 4016356);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Rio de Janeiro", "RJ", "Sudeste", 16718956);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Goiás", "GO", "Centro-Oeste", 6991161);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Mato Grosso", "MT", "Centro-Oeste", 3441998);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Rio Grande do Sul", "RS", "Sul", 11329605);
INSERT INTO estado (nome, sigla, regiao, populacao) VALUES ("Santa Catarina", "SC", "Sul", 6910553);

SELECT * FROM estado ORDER BY sigla;

SELECT regiao, SUM(populacao) as Total FROM estado GROUP BY regiao;

SELECT regiao, AVG(populacao) as Media FROM estado GROUP BY regiao;

SELECT regiao, group_concat(sigla separator ', ') as Estados FROM estado GROUP BY regiao;

