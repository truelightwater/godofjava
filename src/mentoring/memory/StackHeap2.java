package mentoring.memory;

import java.util.ArrayList;
import java.util.List;

public class StackHeap2 {
    public static void main(String[] args) {
        List<String> listArgument = new ArrayList<>();
        listArgument.add("kks");  // listArgument.add(new String("kks")) 와 같은 역할을 한다.
        listArgument.add("jue");

        print(listArgument);
        System.out.println(listArgument);
    }

    private static void print(List<String> listParam) {
        String value = listParam.get(0);
        listParam.add("io");
        System.out.println(value);
    }


}
