package io.github.danielvieirabh.arquiteturasspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

//Aqui fica a API
@RestController
@RequestMapping("/todos")
public class TodoController {  //Api Rest
    @Autowired
    private TodoService todoService;

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todoEntity) {
        try {
            return todoService.salvar(todoEntity);
        }
        catch (IllegalArgumentException error) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, error.getMessage()); //COdigo 409 se der erro , vai dar erro se tiver a mesma descricao
        }
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
