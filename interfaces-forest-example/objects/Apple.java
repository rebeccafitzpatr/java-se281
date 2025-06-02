package objects;

public class Apple implements FindableObject, EdibleObject {
    public Apple() {

    }

    @Override
    public void look() {
        System.out.println("Here is an apple");
    }

    @Override
    public void eat() {
        System.out.println("It is delicious and juicy!");
    }
}