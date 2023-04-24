package third_modul.fifth;


public class MyHashSet<T> {
    private MySetBucket[] buckets;
    private int CAPACITY = 10;
    private int size = 0;

    public MyHashSet() {
        this.buckets = new MySetBucket[CAPACITY];
    }

    public int getHash(T value) {
        return (value.hashCode() & 0xfffffff) % CAPACITY;
    }

    public T get(T value) {
        if (contains(value)) {
            int hash = getHash(value);

        }
        return null;
    }

    public boolean contains(T value) {
        int hash = getHash(value);
        if (buckets[hash] == null) return false;
        else {
            for (int i = 0; i < buckets[hash].getEntries().size(); i++) {
                if (buckets[hash].getEntries().get(i) == value) return true;
            }
        }
        return false;
    }

    public void put(T value) {
        if (!contains(value)) {
            int hash = getHash(value);
            if (buckets[hash] == null) buckets[hash] = new MySetBucket();
            buckets[hash].getEntries().add(value);
            size++;
        }
    }

    public void delete(T value) {
        if (contains(value)) {
            buckets[getHash(value)].removeEntry(value);
            size--;
        }
    }

    public void print() {
        for (int i = 0; i < CAPACITY; i++) {
            if (buckets[i] != null) {
                System.out.print("Bucket №" + i + ": ");
                for (int j = 0; j < buckets[i].getEntries().size(); j++) {
                    System.out.print(buckets[i].getEntries().get(j) + " ");
                }
                System.out.println();
                System.out.println();
            }
        }
        System.out.println("Size = " + size);
    }
}
