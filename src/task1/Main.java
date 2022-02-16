package task1;

import java.util.HashMap;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        class Student {
            String name;
            int grade;
        }
        Student[] stud = new Student[2];
        var a = (Predicate<Student[]>) students -> {
            for (var key : students) {
                if(key.grade == 100){
                    return true;
                }
            }
            return false;
        };

        stud[0] = new Student();
        stud[1] = new Student();

        stud[0].name = "Fedorov";
        stud[0].grade = 100;
        stud[1].name = "Petrov";
        stud[1].grade = 70;
        System.out.println(a.test(stud));
    }


}
