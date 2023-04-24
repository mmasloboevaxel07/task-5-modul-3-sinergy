package third_modul.fifth;

import java.util.LinkedList;
import java.util.List;

public class MySetBucket<T> {
    private List<T> values;

    public MySetBucket() {
        this.values = new LinkedList<>();
    }

    public List<T> getEntries() {
        return values;
    }

    public void addEntry(T value) {
        values.add(value);
    }

    public void removeEntry(T value) {
        values.remove(value);
    }
}
