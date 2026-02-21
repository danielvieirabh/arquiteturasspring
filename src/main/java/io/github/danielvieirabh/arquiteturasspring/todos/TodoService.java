package io.github.danielvieirabh.arquiteturasspring.todos;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService { //Lógica de negocio

    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private TodoValidator todoValidator;
    @Autowired
    private MailSender mailSender;

    public TodoEntity salvar(TodoEntity novoTodo) {
        todoValidator.validar(novoTodo);
        return todoRepository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todoEntity) {
        todoRepository.save(todoEntity);
        String status = todoEntity.getConcluido() == Boolean.TRUE ? "Concluido" : "Não Concluido";
        mailSender.enviar("Todo " + todoEntity.getDescricao() + "foi atualizado para " +  status);
    }
    
    public TodoEntity findById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }

}
