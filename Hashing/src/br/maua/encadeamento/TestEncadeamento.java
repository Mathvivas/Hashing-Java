package br.maua.encadeamento;

import java.util.ArrayList;
import java.util.List;

public class TestEncadeamento {
    public static void main(String[] args) {
        Integer[] tabChaves = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14, 52, 67, 90, 81, 30, 76, 12, 69, 85, 66 };
        List<SList> tabHash = new ArrayList<>(10);

        int z = 0;
        while (z < 10) {
            tabHash.add(new SList());                                // Cria uma SList para cada index da HashTable
            z++;
        }


        // Adicionando nas listas _______________________________________________________________

        for (int i = 0; i < tabChaves.length; i++) {
            int hashCode = Encadeamento.hash(tabChaves[i]);
            Node node = new Node(tabChaves[i]);
            tabHash.get(hashCode).addLast(node);
        }

        // Imprimindo os valores _______________________________________________________________

        for (int i = 0; i < tabHash.size(); i++) {

            System.out.printf("\nPosição %d: ", i);                 // printf
            System.out.println(tabHash.get(i) + "\t");
        }
    }
}
