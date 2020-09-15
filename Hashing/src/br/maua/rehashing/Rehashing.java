package br.maua.rehashing;

public class Rehashing {

    public static Integer rehashing(Integer[] hashTable, Integer index) {
        for (Integer i = index + 1; i < hashTable.length; i++) {
            if (hashTable[i] == null)
                return i;
        }

        for (Integer i = 0; i < index; i++) {
            if (hashTable[i] == null)
                return i;
        }
        return null;
    }



    public int hashCode(int key) {
        return (key % 10);
    }
}
