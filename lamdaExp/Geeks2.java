import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class Geeks2 {

    public static int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("bibek", 13));
        personList.add(new Person("magar", 12));
        personList.add(new Person("hum", 55));

        Collections.sort(personList, Geeks2::compareByName);
        System.out.println("Sort By Name");

        personList.stream().map(x -> x.getName()).forEach(System.out::println);

        System.out.println();

        Collections.sort(personList, Geeks2::compareByAge);
        System.out.println("Sort By Age:");

        personList.stream().map(x -> x.getName()).forEach(System.out::println);
    }

}