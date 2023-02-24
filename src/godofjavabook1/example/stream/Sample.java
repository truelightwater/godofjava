package godofjavabook1.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        Integer[] values = {1, 3, 5};
        List<Integer> list = Arrays.stream(values).collect(Collectors.toList());
    }

}
