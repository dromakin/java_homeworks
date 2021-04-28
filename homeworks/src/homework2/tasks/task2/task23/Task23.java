package homework2.tasks.task2.task23;

public class Task23 {
    public static void task23() {
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
