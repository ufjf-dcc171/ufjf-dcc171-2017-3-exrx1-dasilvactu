/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017.aula8exemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Turma {
    private String codigo;
    private List<Aluno> alunos;

    public String getCodigo() {
        return codigo;
    }

    public Turma() {
        this(null);
    }

    public Turma(String codigo) {
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
}
