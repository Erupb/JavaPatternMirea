package task5;

// Нетерпеливая инициализация полезна засчёт приватного конструктора по умолчанию класс не может наследоваться
//экзэмпляр может создаваться только внутри данного класса, а также с помощью public метода getInstance()
//всегда будет создаваться один и тот же объект
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2(){
        System.out.println("Singleton 2 created");
    }
    public static Singleton2 getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "Sing2";
    }
}
