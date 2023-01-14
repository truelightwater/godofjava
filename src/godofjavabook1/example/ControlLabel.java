package godofjavabook1.example;

public class ControlLabel {
  public static void main(String[] args) {
    ControlLabel control = new ControlLabel();
    control.printTimeTable();
  }

  public void printTimeTable() {
    startLabel:                                 // 반복문 바로 앞에 원하는 이름을 입력하고 콜론을 써주면 된다.
                                                // 2개 이상의 for, while 사용할 경우, 바깥쪽 루프의 시작점으로 이동하려고 할때 Label:
    for (int level = 2; level < 10; level++) {
      for (int unit = 1; unit < 10; unit++) {
        if (unit == 4) continue startLabel;     // 이 지점에서 원하는 지점으로 가는 것이다.
        System.out.print(level + " * " + unit + " = " + level * unit + " ");
      }
      System.out.println();
    }
  }
}
