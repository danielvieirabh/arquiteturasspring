package io.github.danielvieirabh.arquiteturasspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> { //Conecta com banco de dados

    boolean existsByDescricao(String descricao); //So quero saber se existe , nao quero saber os dados
}
