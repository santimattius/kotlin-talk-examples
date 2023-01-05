package interoperability.nullable;

import org.jetbrains.annotations.Nullable;

public class JavaExample {

    private String text;

    @Nullable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    void print() {

    }

    boolean is() {
        return true;
    }

}
