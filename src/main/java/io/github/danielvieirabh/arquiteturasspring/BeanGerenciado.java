package io.github.danielvieirabh.arquiteturasspring;

import io.github.danielvieirabh.arquiteturasspring.todos.TodoEntity;
import io.github.danielvieirabh.arquiteturasspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy(value = true) //Padrao de Lazy e true
//Singleton
@Component
@Scope("singleton") //padrao e esse entre aspas
public class BeanGerenciado { //Formas de Injetar
    @Autowired
    private TodoValidator todoValidator;

    @Autowired
    public BeanGerenciado(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

    public void utilizar() {
        TodoEntity todo = new TodoEntity();
        todoValidator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

}
