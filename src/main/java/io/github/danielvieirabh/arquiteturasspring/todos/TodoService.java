package io.github.danielvieirabh.arquiteturasspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public  TodoEntity salvar(TodoEntity novoTodo) {
        return todoRepository.save(novoTodo);
    }

}
