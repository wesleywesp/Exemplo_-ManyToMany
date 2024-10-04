package pt.com.projeto.exemplo3.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name= "alunos")
@Getter
@Setter

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String aluno;
    @ManyToMany
        @JoinTable(
        joinColumns = {@JoinColumn(name ="codigo_aluno", referencedColumnName = "codigo")},
        inverseJoinColumns = {@JoinColumn (name= "codigo_curso", referencedColumnName="codigo")}
    )
    private List<Curso> cursos = new ArrayList<>();

}
