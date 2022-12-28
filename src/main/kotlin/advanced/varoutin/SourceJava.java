package advanced.varoutin;

import java.util.Collection;

public interface SourceJava<T> {

    T nextT();

    void addAll(Collection<? extends T> items);
}
