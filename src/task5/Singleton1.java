package task5;

//Можно не описывать явно приватный конструктор
public enum Singleton1 {
    INSTANCE;
    private Singleton1() {
        System.out.println("Singleton 1 created");
    }
}
