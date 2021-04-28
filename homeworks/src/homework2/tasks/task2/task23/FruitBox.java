package homework2.tasks.task2.task23;

public class FruitBox<K, T extends Fruit> {

    private K key;
    private T obj;

    public FruitBox(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }

}
