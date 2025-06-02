import objects.*;

public class Main {

    public static void main(String[] args) {
        FindableObject apple = new Apple();
        apple.look();

        FindableObject stone = new Stone();
        stone.look();

        Backpack backpack = new Backpack();
        backpack.add(stone);
        backpack.add(apple);

        backpack.showContents();
    }
}


