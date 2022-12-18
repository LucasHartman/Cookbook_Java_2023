import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Person> persons;
        List<Person> females;
        List<Person> sorted;
        boolean allMatch;
        boolean anyMatch;
        boolean noneMatch;
        Map<Gender, List<Person>> groupByValue;

        

        // CREATE LIST
        persons = List.of(
        new Person("Jame Bond", 20, Gender.MALE), 
        new Person("Alina Smith", 33, Gender.FEMALE),
        new Person("Helen White", 57, Gender.FEMALE), 
        new Person("Alex Boz", 14, Gender.MALE),
        new Person("Jamie Goa", 99, Gender.MALE), 
        new Person("Anna Cook", 7, Gender.FEMALE),
        new Person("Zelda Brown", 120, Gender.FEMALE));

       

        // SELECT FEMALES
        females = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);



        // SORT LIST
        sorted = persons
            .stream()
            .sorted(Comparator
            .comparing(Person::getAge).reversed())
            .collect(Collectors.toList());
        sorted.forEach(System.out::println);



        // ALL MATCH CONDITION
        allMatch = persons
            .stream()
            .allMatch(person -> person.getAge() > 6);
        System.out.println("allMatch: " + allMatch); // true



        // ANY MATCH CONDITION
        anyMatch = persons
            .stream()
            .anyMatch(person -> person.getAge() > 119);
        System.out.println("anyMatch: " + anyMatch); // true



        // NON MATCH CONDITION
        noneMatch = persons
            .stream()
            .noneMatch(person -> person.getName()
            .equals("Antonio"));
        System.out.println("noneMatch: " + noneMatch);
        


        // GET WITH MAX VALUE
        persons
            .stream()
            .max(Comparator
            .comparing(Person::getAge))
            .ifPresent(System.out::println);



        // GET WITH MIN VALUE
        persons
            .stream()
            .min(Comparator
            .comparing(Person::getAge))
            .ifPresent(System.out::println);

            

        // GROUP BY VALUE
        groupByValue = persons
            .stream()
            .collect(Collectors
            .groupingBy(Person::getGender));




        // PRINT GROUPS
        groupByValue.forEach((gender, person) -> {
        System.out.println(gender);
        person.forEach(System.out::println);
        System.out.println();
        });


    }

    static class Person {
        private final String name;
        private final int age;
        private final Gender gender;
    
        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public Gender getGender() {
            return gender;
        }
    
        @Override
        public String toString() {
            return "Person{" + "name= " + name + '\'' + ", age= " + age + ", gender= " + gender + '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}