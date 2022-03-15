package lt.codeacademy.db.fisherman.faker;

import com.github.javafaker.Faker;
import lt.codeacademy.db.fisherman.entity.Fish;
import lt.codeacademy.db.fisherman.entity.Fisherman;
import lt.codeacademy.db.fisherman.entity.enums.HookSize;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.LongStream;

public final class FakerDataBuilder {

    private static final Faker FAKER = new Faker();

    public static List<Fisherman> genFishermanList() {
        List<Fisherman> list = new ArrayList<>();
        LongStream.rangeClosed(1, 100).forEach(i -> {
            HookSize hookSize = HookSize.fromValue(new Random().ints(1, 3).findFirst().getAsInt());
            list.add(Fisherman.builder()
                    .id(i)
                    .name(FAKER.name().firstName())
                    .surname(FAKER.name().lastName())
                    .hookSize(hookSize)
                    .rod(FAKER.team().name())
                    .startFishingDate(FAKER.date().between(getFuture(1), getFuture(200)))
                    .age(new Random().ints(8, 100).findFirst().getAsInt())
                    .build()
            );
        });

        return list;
    }

    public static List<Fish> genFishList() {
        List<Fish> list = new ArrayList<>();
        LongStream.rangeClosed(1, 10000).forEach(i -> {
            HookSize hookSize = HookSize.fromValue(new Random().ints(1, 3).findFirst().getAsInt());
            list.add(Fish.builder()
                    .id(i)
                    .name("Fish-" + FAKER.name().username())
                    .hookSize(hookSize)
                    .favoriteFood(FAKER.food().ingredient())
                    .weight(new Random().ints(1, 20).findFirst().getAsInt())
                    .build()
            );
        });

        return list;
    }

    private static Date getFuture(int countOfDay) {
        var cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, countOfDay);
        return cal.getTime();
    }
}
