package io.github.danielvieirabh.arquiteturasspring;

import io.github.danielvieirabh.arquiteturasspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;
import java.sql.Connection;

public class ExemploInjecaoDependecia {
    public static void main(String[] args) throws Exception {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("dan");
        dataSource.setDriverClassName("org.h2.Driver");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;
        TodoRepository todoRepository = null; //new SimpleJpaRepository<TodoEntity, Integer>();
        TodoValidator todoValidator = new TodoValidator(todoRepository);
        MailSender mailSender = new MailSender();

        TodoService todoService = new TodoService(todoRepository, todoValidator, mailSender);

        BeanGerenciado beanGerenciado =  new BeanGerenciado(null);
//        beanGerenciado.setValidator(todoValidator); //FIca opcional passar parametro com Autowride
//        if (condicao == true) {
//            beanGerenciado.setValidator();
//        }

    }
}
