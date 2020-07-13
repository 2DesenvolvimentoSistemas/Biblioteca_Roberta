USE BibliotecaInfantil;

--criacao da ta tabela Livro
CREATE TABLE Livro (
NomeLivro VARCHAR (70) NOT NULL,
Acabamento VARCHAR (20),
CodLivro INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Preco DOUBLE
);

DESCRIBE Livro;