package godofjavabook1.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentForEachSample {

    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> list = new ArrayList<>();

        list.add(new StudentDTO("요다", 43, 99, 10));
        list.add(new StudentDTO("만두", 30, 71, 85));
        list.add(new StudentDTO("건빵", 32, 81, 75));
//        sample.printStudentNames(list);
//        sample.printStudentScores(list);
        sample.printStudentScoreCutLine(list, 80);



    }

    public void printStudentNames(List<StudentDTO> students) {
        students.stream().map(student -> student.getName()).collect(Collectors.toList());
        students.stream().forEach(student -> System.out.println(student.getName()));
        students.stream().forEach(student -> System.out.println(student.getAge()));
    }

    public void printStudentScores(List<StudentDTO> students) {
        students.stream().map(student -> student.getScoreMath()).forEach(math -> System.out.println(math));
        students.stream().map(student -> student.getScoreEnglish()).forEach(english-> System.out.println(english));
    }

    public void printStudentScoreCutLine(List<StudentDTO> students, int cutline) {
        students.stream()
                .filter(student -> student.getScoreMath() > cutline)
                .forEach(student -> System.out.println(student.getName()));

    }
}
