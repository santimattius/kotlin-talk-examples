package interoperability.inline;

import java.util.Arrays;
import java.util.List;

public class InlineExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        for (int value : numbers) {
            String string = Converter.convertToString(() -> value);
            System.out.println(string);
        }

    }
}
