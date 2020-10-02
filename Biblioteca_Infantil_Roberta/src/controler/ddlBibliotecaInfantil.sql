USE BibliotecaInfantil;

--criacao da ta tabela Livro
CREATE TABLE Livro (
NomeLivro VARCHAR (70) NOT NULL,
Acabamento VARCHAR (20),
CodLivro INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Preco DOUBLE
);

alter table Livro
drop Setor

DESCRIBE Livro;

alter table Livro
    ADD Setor ENUM ('INFANTIL', 'FICÇÃO', 'FÁBULA', 'CONTO', 'APÓLOGO', 'CRÔNICA', 'LENDA', 'MITO', 'NOVELA', 'FANTASIA') DEFAULT 'INFANTIL' NOT NULL;

SELECT *
FROM livro;