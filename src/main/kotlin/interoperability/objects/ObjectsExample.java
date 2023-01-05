package interoperability.objects;

import java.util.List;

public class ObjectsExample {

    public static void main(String[] args) {

//        List<Integer> numbers = DataProvider.INSTANCE.getNumbers();
        List<Integer> numbers = DataProvider.numbers;

//        String randomId = DataProvider.INSTANCE.randomId();
        String randomId = DataProvider.randomId();
    }
}
