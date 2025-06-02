import java.util.ArrayList;

import objects.FindableObject;

public class Backpack {

    private ArrayList<FindableObject> foundObjects = new ArrayList<FindableObject>();

    public void showContents() {
        if (foundObjects.isEmpty()) {
            System.out.println("There is nothing in your bag!!");
        }
        for (FindableObject object : foundObjects) {
            object.look();

        }
    }

    public void add(FindableObject object) {
        foundObjects.add(object);
        System.out.println("New object added to backpack!");
    }


}