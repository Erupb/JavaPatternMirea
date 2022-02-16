package task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("1) Начальный список:");
        App app=new App();
        app.printList();
        System.out.println("2) Список отсортированный по последней букве фамилии:");
        app.sortByLastName();
        System.out.println("3) Список отфильтрованный по принципу возраст больше чем вес:");
        app.sortByAW();
        System.out.println("4) Список отсортированный по дате рождения:");
        app.sortByDate();
        System.out.print("Произведение всех возрастов: ");
        app.productOld();
    }
}
