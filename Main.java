package third_modul.fifth;

public class Main {
    public static void main(String[] args) {
        MyHashSet<Integer> set = new MyHashSet<>();
        for (int i = 0; i < 15; i++) {
            set.put(i);
        }
        set.print();

        set.put(1); // Не добавится, так как в сете недопустимы дубликаты
        set.put(1234); // Добавиться, такого элемента еще не было
        set.print();

        set.delete(1);
        set.delete(7);
        set.print();

        System.out.println(set.contains(0)); // true
        System.out.println(set.contains(4)); // true
        System.out.println(set.contains(43)); // false
        System.out.println(set.contains(-4)); // false
        System.out.println(set.contains(13)); // true
    }
}
