package interoperability.clazz;

public class DataClazzExample {

    public static void main(String[] args) {
        Person person1 = new Person("Santiago", 29);
        Person person2 = new Person("Santiago", 29);

        if (person1.equals(person2)) {

        }

        Person person3 = person1.copy("New Name", 99);
    }
}
