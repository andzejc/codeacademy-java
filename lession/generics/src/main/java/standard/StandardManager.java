package standard;

import standard.model.Box;

public class StandardManager {

    public static void init() {
        Integer number;
        Box<Integer> box = new Box<>();
        box.setObject(10);

        number = box.getObject();
        System.out.println(number);

        Box<String> boxOfString = new Box<>();
        boxOfString.setObject("text");
        System.out.println(boxOfString.getObject());
    }
}
