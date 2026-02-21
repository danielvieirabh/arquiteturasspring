package io.github.danielvieirabh.arquiteturasspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public  TodoEntity salvar(TodoEntity todoEntity) {
        return todoRepository.save(todoEntity);
    }

    public void atualizarStatus(TodoEntity todoEntity) {
        todoRepository.save(todoEntity);
    }
    
    public TodoEntity findById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }
    

}
