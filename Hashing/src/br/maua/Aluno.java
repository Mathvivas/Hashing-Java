package br.maua;

public class Aluno {
    private int codigo;
    private String nome;
    private Aluno next;     // Aponta para o próximo


    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Aluno(int codigo, String nome, Aluno next) {
        this.codigo = codigo;
        this.nome = nome;
        this.next = next;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getNext() {
        return next;
    }

    public void setNext() {
        this.next = next;
    }
}
