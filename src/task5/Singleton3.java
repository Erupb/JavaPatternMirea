package task5;

// Дело в том, что внутренние классы загружаются только тогда, когда мы обращаемся к ним впервые -
// в отличии от "внешних" классов, которые загружаются сразу при запуске программы.
// Более того, она потокобезопасна - за счет той же особенности.
public class Singleton3 {
    public Singleton3() {
        System.out.println("Singleton 3 created");
    }

    private static class SingletonHolder {
        public static final Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return SingletonHolder.instance;
    }

    @Override
    public String toString() {
        return "Sing3";
    }
}
