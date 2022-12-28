package advanced.reified;

public class TypesJava<T> {

    void add(T item) {
        item.getClass().getSimpleName();
    }
}
