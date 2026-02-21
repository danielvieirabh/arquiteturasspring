package io.github.danielvieirabh.arquiteturasspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Aqui fica a API
@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todoEntity) {
       return todoService.salvar(todoEntity);
    }

    @PutMapping(value = "/{id}")
    public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todoEntity) {
        todoEntity.setId(id);
        todoService.atualizarStatus(todoEntity);
    }

    @GetMapping(value = "/{id}")
    public TodoEntity findById(@PathVariable("id") Integer id) {
        return todoService.findById(id);
    }
}
