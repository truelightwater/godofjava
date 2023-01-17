package godofjavabook1.ch10;

public class AnimalRunner {
  public static void main(String[] args) {
    Animal animal1 = new Animal("pigeon", 2, 2, 90);
    Dog animal2 = new Dog("dog", 4, 0, 70);

    animal1.move();
    animal1.eatFood(false);
    System.out.println(animal1.toString());
    System.out.println();

    animal2.move();
    animal2.eatFood(true);
    animal2.running();
    animal2.drinkWater();
    System.out.println(animal2.toString());




  }


}
