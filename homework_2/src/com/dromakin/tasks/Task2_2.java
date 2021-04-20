package com.dromakin.tasks;

public class Task2_2 {

    static class Box<K,T> {

        private K key;
        private T obj;

        public Box(K key, T obj){
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

    public static void task2_2() {
        // параметризируем класс типом String
        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);
    }

    public static void main(String[] args) {
    }
}
