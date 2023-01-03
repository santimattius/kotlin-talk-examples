package interoperability.extra;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CoroutineExample {

    public static void main(String[] args) {
        CoroutinesData.INSTANCE.getNumbers(new Continuation<>() {
            @NotNull
            @Override
            public CoroutineContext getContext() {
                return EmptyCoroutineContext.INSTANCE;
            }

            @Override
            public void resumeWith(@NotNull Object o) {

            }
        });
    }
}
