SELECT * FROM db_desafio.tb_tecnicos;

USE db_desafio;

-- Pupolando tabela 
 INSERT INTO tb_tecnicos (descricao_tecnico, id_especialidades) VALUES
                       ("Química",      1);
-- Apagando tabela de acordo com o id
 DELETE FROM tb_tecnicos  WHERE id=0 ;
 
 -- Atualizando os valores da tabela de acordo com o id
 UPDATE tb_tecnicos SET descricao_tecnico="Mecatrônica" WHERE id=1;

-- Relacionando a tabela especialidades usando id_especialidades na tabela tecnicos 
SELECT * FROM tb_tecnicos INNER JOIN tb_especialidades ON tb_especialidades.id = tb_tecnicos.id_especialidades;





