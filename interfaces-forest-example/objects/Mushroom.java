package objects;

public class Mushroom implements FindableObject, EdibleObject {
    public Mushroom() {

    }

    @Override
    public void look() {
        System.err.println("Here is an mushroom");
    }

    @Override
    public void eat() {
        System.out.println("We can make a delicious mushroom soup!");
    }
}