package s4_1;

import java.util.HashMap;

public class Seminar4 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            mapa.put(Integer.valueOf(Integer.toString(i + 10)), Integer.toString(i));
        }
        // добавляем значения в коллекцию
        mapa.put(1, "one");
        mapa.put(2, "two");
        mapa.put(3, "three");



        // Вывод текущего размера HashMap
        System.out.println("Текущий размер коллекции HashMap: " + mapa.size());

        // Проверка наличия ключа 1 в HashMap
        System.out.println("Проверка наличия ключа 1 в HashMap: " +mapa.containsKey(1)); // true

        // Проверка наличия ключа 4 в HashMap
        System.out.println("Проверка наличия ключа 4 в HashMap: " +mapa.containsKey(4)); // false

        // Проверка наличия значения "3" в HashMap
        System.out.println("Проверка наличия значения 'three / 3' в HashMap: " +mapa.containsValue("3")); // true

        // Замена значения элемента с ключом 3 на "four / 4" в HashMap
        if (mapa.containsKey(3)) {
            mapa.replace(3, "four");
        }

        // Вывод значения элемента с ключом 3 в HashMap
        System.out.println("Вывод значения элемента с ключом 3 после замены значения на 'four / 4': "+mapa.get(3));// four

        //Проверка наличия значения по ключу "2" в HashMap
        System.out.println("Проверка наличия значения по ключу '2' в HashMap: " +mapa.get(2));//two

        // Проверка значения удаляемого элемента по ключу "1" в HashMap
        System.out.println("Проверка значения удаляемого элемента по ключу '1' в HashMap: " +mapa.remove(1));//one

        // Проверка значения удаленного элемента по ключу "1" в HashMap
        System.out.println("Проверка значения удаленного элемента по ключу '1' в HashMap: " +mapa.remove(1));//null
    }
}