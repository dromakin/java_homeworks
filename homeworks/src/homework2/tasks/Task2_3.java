package homework2.tasks;

public class Task2_3 {

    static class Fruit {
        public void printClass() {
            System.out.println("I am super class Fruit");
        }
    }

    static class Vegetable {
        public void printClass() {
            System.out.println("I am super class Fruit");
        }
    }

    static class Apple extends Fruit {
        @Override
        public void printClass() {
            System.out.println("I am sub class Apple");
        }
    }

    static class Banana extends Fruit {
        @Override
        public void printClass() {
            System.out.println("I am sub class Banana");
        }
    }

    static class Cabbage extends Vegetable {
        public void printClass() {
            System.out.println("I am Cabbage");
        }
    }

    static class FruitBox<K, T extends Fruit> {

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

    static class VegetableBox<K, T extends Vegetable> {

        private K key;
        private T obj;

        public VegetableBox(K key, T obj) {
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

    public static void task2_3() {
        FruitBox<String, Banana> bananaBox = new FruitBox<>("banana", new Banana());
        bananaBox.getObj().printClass();

        FruitBox<String, Apple> appleBox = new FruitBox<>("apple", new Apple());
        appleBox.getObj().printClass();

        FruitBox<String, Fruit> fruitBox = new FruitBox<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }

}
