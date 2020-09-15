package br.maua.rehashing;

public class TestRehashing {
    public static void main(String[] args) {
        Integer[] tabChaves = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14 };
        Integer[] tabHash = new Integer[10];

        Rehashing rehashing = new Rehashing();

        for (int i = 0; i < tabChaves.length; i++) {
            int cod = rehashing.hashCode(tabChaves[i]);

            if (tabHash[cod] == null)
                tabHash[cod] = tabChaves[i];
            else {
                // Calculando o novo índice
                int rehash = rehashing.rehashing(tabHash, cod);
                tabHash[rehash] = tabChaves[i];
            }
        }

        System.out.println("\nTabela Hash: ");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < tabHash.length; i++) {
            if (tabHash[i] == null)
                System.out.println("Slot " + i + " ---> Valor Nulo" + "\n");
            else
                System.out.println("Slot " + i + " ---> " + tabHash[i]);
        }
    }
}
