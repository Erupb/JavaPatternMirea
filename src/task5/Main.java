package task5;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 реализация выдает один и тот же объект");
        System.out.println(Singleton1.INSTANCE);
        System.out.println(Singleton1.INSTANCE);
        System.out.println(Singleton1.INSTANCE);
        System.out.println(Singleton1.INSTANCE);
        System.out.println(Singleton1.INSTANCE);

        System.out.println("2 реализация выдает один и тот же объект");
        System.out.println(Singleton2.getInstance().toString());
        System.out.println(Singleton2.getInstance().toString());
        System.out.println(Singleton2.getInstance().toString());
        System.out.println(Singleton2.getInstance().toString());

        System.out.println("3 реализация выдает один и тот же объект");
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton3.getInstance().toString());
        System.out.println(Singleton3.getInstance().toString());
        System.out.println(Singleton3.getInstance().toString());
    }
}
