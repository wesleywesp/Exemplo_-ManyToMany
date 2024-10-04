package pt.com.projeto.exemplo3.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pt.com.projeto.exemplo3.modelo.Curso;

@Repository
public interface CursoRepositorio extends CrudRepository<Curso , Long> {

}
