package godofjavabook1.ch7;

public class ManageHeight {
  int[][] gradeHeights;

  public static void main(String[] args) {
    ManageHeight manager = new ManageHeight();
    manager.setData();

    for (int classNo = 1; classNo <= 5; classNo++) {
      manager.printHeight(classNo);
    }

    System.out.println();

    int loop = 1;
    while (loop <=5) {
      manager.printAverage(loop);
      loop++;
    }
  }

  public void setData() {
    gradeHeights = new int[][]{
        {170, 180, 173, 175, 177},
        {160, 165, 167, 186},
        {158, 177, 187, 176},
        {173, 182, 181},
        {170, 180, 165, 177, 172},
    };

/*    gradeHeights = new int[5][];
    gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
    gradeHeights[0] = new int[] {160, 165, 167, 186};
    gradeHeights[0] = new int[] {158, 177, 187, 176};
    gradeHeights[0] = new int[] {173, 182, 181};
    gradeHeights[0] = new int[] {170, 180, 165, 177, 172};*/

  }

  public void printHeight(int classNo) {
    System.out.println("Class No.: " + classNo);
    for (int studentHeight : gradeHeights[classNo - 1]) {
      System.out.print(studentHeight+ " ");
    }
    System.out.println();
  }

  public void printAverage(int classNo) {
    double sumHeight = 0.0;

    System.out.println("Class No.:" + classNo);
    for (int studentHeight : gradeHeights[classNo - 1]) {
      sumHeight += studentHeight;
    }

    System.out.println("Height average : " +sumHeight / gradeHeights[classNo - 1].length);

  }

}
