package pt.com.projeto.exemplo3.modelo;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "curso")
@Getter
@Setter
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    private String curso;
    @ManyToMany(mappedBy = "cursos")
    private List<Aluno> alunos = new ArrayList<>();

}
