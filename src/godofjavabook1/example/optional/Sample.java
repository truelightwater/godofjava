package godofjavabook1.example.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Sample {

    private void getOptionalData(Optional<String> data) throws Exception {
        String defaultValue = "default";
        String result1 = data.get();
        String result2 = data.orElse(defaultValue);

        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "GoodOfJava";
            }
        };

        String result3 = data.orElseGet(stringSupplier);
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };

        String result4 = data.orElseThrow(exceptionSupplier);
    }
}
