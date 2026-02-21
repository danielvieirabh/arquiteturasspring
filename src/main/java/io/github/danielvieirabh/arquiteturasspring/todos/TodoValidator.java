package io.github.danielvieirabh.arquiteturasspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {
    @Autowired
    private TodoRepository todoRepository;

    public void validar(TodoEntity todoEntity) {
        if (existeTodoComDescricao(todoEntity.getDescricao())) {
            throw new IllegalArgumentException("Ja existe um todo com essa descricao");
        }
    }

    private boolean existeTodoComDescricao(String descricao) {
        return todoRepository.existsByDescricao(descricao);
    }

}
