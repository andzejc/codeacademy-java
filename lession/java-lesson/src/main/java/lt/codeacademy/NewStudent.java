package lt.codeacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class NewStudent implements Comparable<NewStudent> {
    private String name;
    private Integer age;


    @Override
    public int compareTo(NewStudent newStudent) {
        return name.compareTo(newStudent.name);
    }

    public static void main(String[] args) {
//        Comparator<NewStudent> byAge = new Comparator<NewStudent>() {
//            @Override
//            public int compare(NewStudent o1, NewStudent o2) {
//                return Integer.compare(o1.age, o2.age);
//            }
//        };

//        Comparator<NewStudent> byAge = (s1, s2) -> s1.age.compareTo(s2.age);


        Comparator<NewStudent> byAge = Comparator.comparingInt(NewStudent::getAge).thenComparing(NewStudent::getName);

        var students = new ArrayList<NewStudent>();
        students.add(new NewStudent("Jonas", 20));
        students.add(new NewStudent("Petras", 30));
        students.add(new NewStudent("Arturas", 40));
        students.add(new NewStudent("Andrius", 40));
//        Collections.sort(students);
//        System.out.println(students);
        Collections.sort(students, byAge);
        System.out.println(students);
    }
}
