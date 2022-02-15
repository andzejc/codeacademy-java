package standard;

import standard.model.Box;

public class StandardManager {

    public static void init() {
        Integer number;
        Box box = new Box();
        box.setObject(10);

        number = (Integer) box.getObject();
        System.out.println(number);

        box.setObject("text");
        // below line will throw ClassCastException
        number = (Integer) box.getObject();
        System.out.println(number);
    }
}
