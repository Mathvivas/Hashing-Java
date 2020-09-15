package br.maua.colisao;

import br.maua.Aluno;

public class Hash_01 {

    public static void main(String[] args) {
        Aluno[] tabAluno = new Aluno[10];               // Cria a lista de alunos

        tabAluno[0] = new Aluno(10, "Ana");
        tabAluno[1] = new Aluno(21, "Silas");
        tabAluno[2] = new Aluno(22, "Ari");
        tabAluno[3] = new Aluno(24, "Pedro");
        tabAluno[4] = new Aluno(35, "Jonas");
        tabAluno[5] = new Aluno(60, "Saul");
        tabAluno[6] = new Aluno(44, "Josue");
        tabAluno[7] = new Aluno(57, "Paulo");
        tabAluno[8] = new Aluno(80, "Sara");
        tabAluno[9] = new Aluno(90, "Davi");

        Integer hashCode = null;
        Integer chave;
        Aluno[] tabHash = new Aluno[10];                // Cria a lista de Hash

        for (int i = 0; i < tabAluno.length; i++) {
            chave = (tabAluno[i].getCodigo());
            hashCode = hash(chave);                     // Grava o resto da divisão em hashCode
            System.out.println("Chave = " + chave + " mapeada para hashCode = " + hashCode);

            if (tabHash[hashCode] == null)              // Testa se a posição da lista está vazia
                tabHash[hashCode] = tabAluno[i];        // Grava o aluno na posição vazia da lista
            else {                                      // Se a posição não estiver vazia, há colisão
                System.out.println("*** Colisão no Slot da Tabela Hash ***");
                System.out.println("Chave " + tabAluno[i].getCodigo() + " não armazenada na tabela Hash...\n");
            }
        }

        System.out.println("\nTabela Aluno: ");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < tabAluno.length; i++)
            System.out.println("Slot " + i + " ---> " + tabAluno[i].getCodigo() + " " + tabAluno[i].getNome() + "\n");

        System.out.println("\nTabela Hash: ");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < tabHash.length; i++) {
            if (tabHash[i] == null)
                System.out.println("Slot " + i + " ---> Valor Nulo" + "\n");
            else
                System.out.println("Slot " + i + " ---> " + tabHash[i].getCodigo() + " " + tabHash[i].getNome() + "\n");
        }

    }
    // _____________________________________________________________________________________________________________

    public static Integer hash(Integer key) {
        return (key % 10);
    }
}
