package godofjavabook1.ch10;

public class Animal {
  int satiety;
  String name;
  int legCount;
  int hasWings;

  public Animal() {
    System.out.println("Animal Default Constructor");
  }

  public Animal(String name, int legCount, int hasWings, int satiety) {
    this.name = name;
    this.legCount = legCount;
    this.hasWings = hasWings;
    this.satiety = satiety;
  }

  public void move() {
    int totalMove = 1;

    if (legCount == 2 && hasWings == 2) {
      totalMove *= 8;
      System.out.printf("나는 %d 만큼 이동했어! \n" ,totalMove);

    } else if (legCount == 4 && hasWings == 0) {
      totalMove *= 2;
      System.out.printf("나는 %d 만큼 이동했어! \n" ,totalMove);
    }
  }

  public boolean eatFood(boolean hungry) {
    if (hungry) {
      satiety++;
      System.out.println("I'm full. My satiety = " +satiety);
      return true;

    } else {
      satiety--;
      System.out.println("I'm enough My satiety = " +satiety);

      return false;
    }
  }

  public String toString() {
    return "name = "+name+" leg = "+legCount+" Wings = "+hasWings;
  }



}
