package lt.codeacademy.db.fisherman;

import lt.codeacademy.db.fisherman.faker.FakerDataBuilder;

public class TaskFisherman {

    public static void main(String[] args) {
        FakerDataBuilder.genFishermanList().forEach(s -> System.out.println(s.toString()));
        FakerDataBuilder.genFishList().forEach(s -> System.out.println(s.toString()));
    }
}
