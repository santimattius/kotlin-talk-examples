package interoperability.functions;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class ExampleFunctions {
    public static void main(String[] args) {
        FunctionsKt.printString("Hello Java!");
//        Utils.printString("Hello Java!");
        FunctionsKt.print("");
        FunctionsKt.printAndNext("Hello Java!", new Function0<Unit>() {
            @Override
            public Unit invoke() {
                //next code
                return Unit.INSTANCE;
            }
        });

        Tracker.send("hello_java");
    }
}
