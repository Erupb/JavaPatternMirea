package task2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    List<Human> Humanlist=new ArrayList();

    public App() {
        LocalDate date=LocalDate.now();
        LocalDate date2=LocalDate.of(2021, 12, 31);
        LocalDate date3=LocalDate.of(2020, 12, 31);
        Humanlist = Stream.of(new Human(19,"Svetlana","Zotova",date,70),
                new Human(18,"Sasha","Kripovc",date,75),
                new Human(70,"Alex","Joyb",date2,69),
                new Human(13,"Vitya","Karasev",date3,80)).collect(Collectors.toList());
    }

    public void printList() {
        for (int i = 0; i < Humanlist.size(); i++) {
            System.out.println(Humanlist.get(i).toString());
        }
    }

    public void sortByLastName()
    {
        List sortedList = Humanlist.stream()
                .sorted(Comparator.comparing(Human -> Human.getLastName().substring(Human.getLastName().length()-1)))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void sortByAW(){
        List sortedList = Humanlist.stream().filter(Human->(Human.getWeight()<Human.getAge())).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void productOld(){
        int product=Humanlist.stream().mapToInt(Human->Human.getAge()).reduce(1, Math::multiplyExact);
        System.out.println(product);
    }
    public void sortByDate()
    {
        List sortedList = Humanlist.stream()
                .sorted(Comparator.comparing(Human -> Human.getBirthDate()))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }



}
