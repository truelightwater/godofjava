package godofjavabook1.ch15;

public class UseStringMethods {

    public static void main(String[] args) {
        String str = "The String class represents character strings.";

        UseStringMethods sample = new UseStringMethods();
        // sample.printWords(str);
        // sample.findString(str, "string");
        // sample.findAnyCaseString(str, "string");
        // sample.countChar(str, 's');
        sample.printContainWords(str, "ss");
    }

    public void printWords(String str){
        String[] strings = str.split(" ");
        for (String data : strings) {
            System.out.println(data);
        }
    }

    public void findString(String str, String findStr) {
        System.out.println("string is appeared at " +str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr) {
        String values = str.toLowerCase();
        System.out.println("string is appeared at " +values.indexOf(findStr));
    }

    public void countChar(String str, char c) {
        int count = 0;
        char[] arrays = str.toCharArray();
        for (char data : arrays) {
            if (c == data) {
                count++;
            }
        }
        System.out.println("char 's' count is "+count);
    }

    public void printContainWords(String str, String findStr) {
        String[] arrays = str.split(" ");

        for (String data : arrays) {
            if (data.contains(findStr)) {
                System.out.println(data+ " contains " +findStr);
            }
        }
    }
}

