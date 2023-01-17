package godofjavabook1.ch12;

public class ManageStudent {
  public static void main(String[] args) {
    ManageStudent manager = new ManageStudent();

//    Student[] student = null;
//    student = manager.addStudent();
//    manager.printStudents(student);
    manager.checkEquals();
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

  public void checkEquals() {
    Student a = new Student("Min", "Seoul", "XXXX-XXXX", "ask@godofjava.com");
    Student b = new Student("Min", "Seoul", "XXXX-XXXX", "ask@godofjava.com");

    if (a.equals(b)) {
      System.out.println("Equal");
    } else System.out.println("Not Equal");

  }


}
