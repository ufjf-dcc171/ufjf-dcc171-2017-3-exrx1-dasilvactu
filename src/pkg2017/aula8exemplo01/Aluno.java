/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017.aula8exemplo01;

/**
 *
 * @author ice
 */
public class Aluno {
    private String matricula;
    private String nome;

    public String getMatricula() {
        return matricula;
    }

    public Aluno() {
        this(null, null);
    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + "-" + this.matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
