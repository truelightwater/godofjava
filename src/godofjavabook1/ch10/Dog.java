package godofjavabook1.ch10;

public class Dog extends Animal {

  public Dog(String name, int legCount, int hasWings, int satiety) {
    super();
    this.name = name;
    this.legCount = legCount;
    this.hasWings = hasWings;
    this.satiety = satiety;
  }

  public void running() {
    int totalMove = 1;

    totalMove *= 4;
    System.out.printf("나는 %d 만큼 이동했어! \n", totalMove);
    satiety--;
    System.out.printf("나는 %d 만큼 에너지가 고갈되었어! \n", satiety);
  }

  public void drinkWater() {
    satiety++;
    System.out.printf("나는 물을 마셔서 %d 만큼 에너지가 채워졌어! \n", satiety);

  }



}
