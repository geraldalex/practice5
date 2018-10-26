package task2;

import java.util.HashMap;

public class MyDictionary<TKey,TValue> {

    private TKey key;
    private TValue value;
    private HashMap<TKey, TValue> myColectione = new HashMap<>();


    public void add(TKey key, TValue value) {
        myColectione.put(key, value);
    }

    public int getSize() {
        return myColectione.size();
    }

    public void myRemove(TKey key) {
        myColectione.remove(key);

    }

    public TValue myGet(TKey key) {

        return myColectione.get(key);

    }

    public void pereborValue() {

        for (TValue k : myColectione.values()) {
            System.out.println(k);
        }

    }

    public void pereborKey() {

        for (TKey k : myColectione.keySet()) {
            System.out.println(k);
        }
    }
}
