package interoperability.properties;

public class PropertiesExample {

    public static void main(String[] args) {
        Person person = new Person("Santiago", "Mattiauda", 29);

        System.out.println(person.getName());
        System.out.println(person.getLastName());

        person.setAge(30);
    }
}
