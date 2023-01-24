package mentoring.memory;

public class NullTest {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";

        // null 키워드로 선언한 변수의 해시코드는 항상 0이다.
        System.out.println("str1 : " +System.identityHashCode(str1));

        // ""(blank) 즉, 빈 값은 jvm에서 하나의 메모리를 참조하고 있다.
        System.out.println("str1 : " +System.identityHashCode(str2));
    }
}
