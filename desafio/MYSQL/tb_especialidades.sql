SELECT * FROM db_desafio.tb_especialidades;
USE db_desafio;

-- Pupolando tabela 1
 INSERT INTO tb_especialidades (especialidade_tecnico, id) VALUES
					("Alquimia",      1);
                    
-- Apagando tabela de acordo com o id
 DELETE FROM tb_especialidades WHERE id=4;
 
 -- Atualizando os valores da tabela de acordo com o id
 UPDATE tb_especialidades SET especialidade_tecnico="Teste de UPDATE" WHERE id=2;



