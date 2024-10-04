package pt.com.projeto.exemplo3.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pt.com.projeto.exemplo3.modelo.Aluno;


@Repository
public interface AlunosRepositorios extends CrudRepository<Aluno, Long> {

}
