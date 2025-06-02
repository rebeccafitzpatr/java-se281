package objects;

public class Stone implements FindableObject {
    public Stone() {

    }

    @Override
    public void look() {
        System.err.println("Here is an lovely stone");
    }

    
}