package generics;

public class Task2_1 {

    static class Box<T> {

        public T obj;

        public Box(T obj) {
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
                    "obj=" + obj +
                    "; objType=" + obj.getClass().getName() +
                    '}';
        }

    }

    public static void task2_1() {
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }

    public static void main(String[] args) {
    }
}
