package mentoring.memory;
public class NullPointerException {
    public static class Item{
        private String name;
        private int price;
    }

    public static void main(String[] args){
        Item item = new Item();
        item.name = "apple";
        item.price = 1000;
        System.out.println(item.name);

        item = null;
        System.out.println(item.name);
        /* 처음에는 item에 new 키워드를 통해 객체를 생성해주었을 때, 힙 공간에 객체의 주소가 담기고 여기에 null 을 넣어주었다.
        그리고 null을 넣었을 때 item이라는 변수는 더 이상 주소값을 가지고 있지 않게 되는데, 여기에서 item.name을 하여 item안의 값을 쓰려고 하니
        name을 어디서 가져오라고 하는 건지 모르겠다면 에러를 내뿜게 된다.

        여담으로 처음에 item 변수 안에 담겨던 객체는 이 객체를 참조하고 있던 item 변수가 이제 더이상 자신을 참조하고 있지 않고, 아무도 자신을 가리키는
        녀석이 없으니 시간이 지나면 가바지컬렉터(GC)의 회수의 대상이 될 것이다.
         */

    }
}

