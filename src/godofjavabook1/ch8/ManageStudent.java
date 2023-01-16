package godofjavabook1.ch8;

public class ManageStudent {
  public static void main(String[] args) {
    Student[] student = null;

    ManageStudent manager = new ManageStudent();
    student = manager.addStudent();
    manager.printStudents(student);
  }

  public Student[] addStudent() {
    Student[] student = new Student[3];
    student[0] = new Student("Lim");
    student[1] = new Student("Min");
    student[2] = new Student("Sock", "Seoul", "XXXX-XXXX", "ask@java.com");

    return student;
  }

  public void printStudents(Student[] student) {
    for (Student data : student) {
      System.out.println(data);
    }
  }


}
